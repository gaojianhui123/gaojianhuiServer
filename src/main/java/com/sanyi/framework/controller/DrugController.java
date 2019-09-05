package com.sanyi.framework.controller;

import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.Drug;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import com.sanyi.framework.service.impl.DrugService;
import com.sanyi.framework.util.WordTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 药品库Controller
 *
 * @author Gaojianhui
 */
@RestController
@RequestMapping(value = "/drug")
public class DrugController extends BaseController {
    @Autowired
    DrugService drugService;
    @Autowired
    private CommonMapper commonMapper;

    // 查询药品库列表
    @RequestMapping(value = "findDrug", method = RequestMethod.POST)
    public SanyiPage<Drug> findDrug(@RequestBody QueryParam<Drug> query) {
        return drugService.selectByJpa(query);
    }

    // 查询字典列表(batis)
    @RequestMapping(value = "findDrugs", method = RequestMethod.POST)
    public SanyiPage<Drug> findGrid(@RequestBody QueryParam<Drug> query) {
        System.out.println("sssssssssssss");
        SanyiPage<Drug> a = drugService.selectByBatis(query);
        return a;
    }

    // 保存药品库
    @RequestMapping(value = "saveDrug", method = RequestMethod.POST)
    public Drug saveDrug(@RequestBody Drug drug) throws BusinessException {
        return drugService.saveDrug(drug);
    }

    // 根据id获取药品库对象
    @RequestMapping(value = "getDrugById", method = RequestMethod.POST)
    public Drug getDrugById(@RequestBody String id) {
        return drugService.findById(id).orElse(new Drug());
    }

    // 删除药品库对象
    @RequestMapping(value = "deleteDrug", method = RequestMethod.POST)
    public Drug deleteDrug(@RequestBody Drug drug) {
        return drugService.logicDelete(drug);
    }


    /**
     * 导出入库药品费用
     */
    @RequestMapping(value = "noLimit_exportDrugFeiYong/{start}/{end}/{drugNameString}", method = RequestMethod.GET)
    public void noLimit_exportYongYao(@PathVariable("start") String start, @PathVariable("end") String end, @PathVariable("drugNameString") String drugNameString, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        String ttt = start;
        String ttt2 = end;
        String ttt3 = drugNameString;
        List<Drug> drugList = commonMapper.selectDrugFeiYong(start, end, drugNameString);
        List<Map<String, Object>> table1 = new ArrayList<Map<String, Object>>();
        double couTotal = 0;
        for (Drug drug : drugList) {
            Map<String, Object> map2 = new HashMap<>();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            map2.put("rksj", drug.getCreatetime());
            map2.put("rkys", drug.getDoctor());
            map2.put("ypmc", drug.getDrugNameString());
            map2.put("sl", drug.getDrugTotalCount());
            map2.put("dj", drug.getPrice());
            map2.put("dw", drug.getUnit());
            map2.put("fy", drug.getCost());
            couTotal+=drug.getCost();
            table1.add(map2);
        }
        parametersMap.put("fyTatal",couTotal); // 费用总计
        wordDataMap.put("table1", table1);
        wordDataMap.put("parametersMap", parametersMap);
        InputStream realPath = new ClassPathResource("/templates/入库药品费用统计.docx").getInputStream();
        String fileName = "入库药品费用统计.docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
    }

    // 重用代码
    public void chongYongDaiMa(HttpServletResponse response, Map<String, Object> wordDataMap, InputStream wordPath,
                               String fileName) throws IOException {
        response.setContentType("application/msword;charset=utf-8");
        response.setHeader("Content-Disposition",
                "attachment; filename=" + new String(fileName.getBytes(), "iso-8859-1"));
//		File file = new File(wordPath);
//		FileInputStream fileInputStream = new FileInputStream(file);
        WordTemplate template = new WordTemplate(wordPath);
        template.replaceDocument(wordDataMap);
        ServletOutputStream outputStream = response.getOutputStream();
        template.getDocument().write(outputStream);
        outputStream.close();
//		fileInputStream.close();
    }

}
