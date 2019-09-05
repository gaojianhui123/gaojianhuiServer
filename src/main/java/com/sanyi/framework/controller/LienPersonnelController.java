package com.sanyi.framework.controller;

import com.sanyi.framework.model.Room;
import com.sanyi.framework.service.impl.RoomService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sanyi.framework.service.impl.TanhuashenqingService;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sanyi.framework.service.impl.LienPersonnelService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import com.sanyi.framework.dao.TanhuashenqingRepository;
import org.springframework.core.io.ClassPathResource;
import com.sanyi.framework.service.impl.NurseService;
import com.sanyi.framework.dto.LienPersonnelCaterDto;
import com.sanyi.framework.dao.DictionaryRepository;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.sanyi.framework.dto.LienPersonnelBzDto;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.dto.LienPersonnelTHDto;
import com.sanyi.framework.model.Tanhuashenqing;
import org.springframework.http.ResponseEntity;
import com.sanyi.framework.model.LienPersonnel;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.XLSTransformer;
import com.sanyi.framework.util.WordTemplate;

import javax.servlet.http.HttpServletRequest;

import com.sanyi.framework.model.Dictionary;
import org.springframework.http.HttpHeaders;

import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpEntity;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import org.springframework.http.MediaType;
import com.sanyi.framework.dto.DoorMunDto;

import javax.servlet.ServletOutputStream;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedInputStream;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;
import java.util.HashMap;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lienPersonnel")
public class LienPersonnelController {
    @Autowired
    LienPersonnelService lienPersonnelService;
    @Autowired
    CommonMapper commonMapper;
    @Autowired
    NurseService nurseService;
    @Autowired
    RoomService roomService;
    @Autowired
    TanhuashenqingService tanhuashenqingService;
    @Autowired
    RestTemplate restTemplate;
    @Value("${menjinBaseUrl}")
    private String menjinBaseUrl;
    @Autowired
    private TanhuashenqingRepository tanhuashenqingRepository;
    @Autowired
    private DictionaryRepository dictionaryRepository;

    // 解除人员权限
    @RequestMapping(value = "unregisteruserDoorArea", method = RequestMethod.POST)
    public void unregisteruserDoorArea(HttpServletRequest request, @RequestBody LienPersonnel lienPersonnel) {

        // 根据留置人id获取留置人的谈话人员
        List<Tanhuashenqing> tanhuashenqings = tanhuashenqingRepository.findByLienPersonnelId(lienPersonnel.getId());
        List<String> employs = new ArrayList<String>();
        tanhuashenqings.forEach((tanhuashenqing) -> {
            tanhuashenqing.getRenyuan().forEach((renyuan) -> {
                employs.add(renyuan);
            });
        });
        String url = menjinBaseUrl + "reformer/interface/unregisteruserDoorArea";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        for (String renyuanId : employs) {
            MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
            Map<String, Object> param = new HashMap<String, Object>();
            // 房门id
            param.put("doorAreaId", lienPersonnel.getRoomNum());
            param.put("employeeId", renyuanId);
            map.add("data", JSONObject.toJSONString(param));
            HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,
                    headers);
            ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
            System.out.println(responseEntity);
        }
    }

    // 查询列表 获取获取全部门区信息查询
    @RequestMapping(value = "findDoorMuns", method = RequestMethod.POST)
    public List<DoorMunDto> findDoorMuns(@RequestBody DoorMunDto query) {
        // url
        String url = menjinBaseUrl + "reformer/interface/getDoorArea";
        //
        Map<String, Object> param = new HashMap<String, Object>();
        // param.put("curPage", 1);
        // param.put("pageSize", 200);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        // 定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
        // RestTemplate带参传的时候要用HttpEntity<?>对象传递
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("data", JSONObject.toJSONString(param));
        HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,
                headers);
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
        List<DoorMunDto> doorMunDtos = (List<DoorMunDto>) (responseEntity.getBody().get("obj"));
        return doorMunDtos;
    }

    // 查询列表jps
    @RequestMapping(value = "findLienPersonnels", method = RequestMethod.POST)
    public SanyiPage<LienPersonnel> findLienPersonnels(@RequestBody QueryParam<LienPersonnel> query) {
        return lienPersonnelService.selectByJpa(query);
    }

    // 查询列表 batis
    @RequestMapping(value = "findLienPersonnelsByBatis", method = RequestMethod.POST)
    public SanyiPage<LienPersonnel> findLienPersonnelsByBatis(@RequestBody QueryParam<LienPersonnel> query) {
        return lienPersonnelService.selectByBatis(query);
    }

    // 根据id查活动
    @RequestMapping(value = "findLienPersonnelById", method = RequestMethod.POST)
    public Optional<LienPersonnel> findLienPersonnelById(HttpServletRequest request, @RequestBody String id) {
        return lienPersonnelService.findById(id);
    }

    // 新增留置人员
    @RequestMapping(value = "saveLienPersonnel", method = RequestMethod.POST)
    public LienPersonnel saveLienPersonnel(HttpServletRequest request, @RequestBody LienPersonnel lienPersonnel)
            throws Exception {
        LienPersonnel a = lienPersonnelService.saveLienPersonnel(lienPersonnel);
        return a;
    }

    // 逻辑删除
    @RequestMapping(value = "deleteLienPersonnel", method = RequestMethod.POST)
    public LienPersonnel deleteLienPersonnel(HttpServletRequest request, @RequestBody LienPersonnel lienPersonnel) {
        // role.setDeleted(true);
        return lienPersonnelService.logicDelete(lienPersonnel);
    }

    // 批量逻辑删除
    @RequestMapping(value = "deleteLienPersonnelAll", method = RequestMethod.POST)
    public Iterable<LienPersonnel> deleteLienPersonnelAll(HttpServletRequest request,
                                                          @RequestBody Iterable<LienPersonnel> LienPersonnelList) {

        return lienPersonnelService.logicDeletedAll((Iterable<LienPersonnel>) LienPersonnelList);
    }

    /**
     * 进驻表关联看护表
     *
     * @param query
     * @return
     */
    @RequestMapping(value = "selectLienPersonnelJoinNurse", method = RequestMethod.POST)
    public SanyiPage<LienPersonnel> selectLienPersonnelJoinNurse(@RequestBody QueryParam<LienPersonnel> query) {
        return lienPersonnelService.selectByBatis((queryParam) -> {
            return commonMapper.selectLienPersonnelJoinNurse(queryParam);
        }, query);
    }

    /**
     * 进驻表关联餐饮表
     *
     * @param query
     * @return
     */
    @RequestMapping(value = "selectLienPersonnelJoinCater", method = RequestMethod.POST)
    public SanyiPage<LienPersonnelCaterDto> selectLienPersonnelJoinCater(
            @RequestBody QueryParam<LienPersonnelCaterDto> query) {
        return lienPersonnelService.selectByBatis((queryParam) -> {
            return commonMapper.selectLienPersonnelJoinCater(queryParam);
        }, query);
    }

    /**
     * 进驻表关联谈话申请表
     */
    @RequestMapping(value = "selectLienPersonnelJoinTh", method = RequestMethod.POST)
    public SanyiPage<LienPersonnelTHDto> selectLienPersonnelJoinTh(@RequestBody QueryParam<LienPersonnelTHDto> query) {

        return lienPersonnelService.selectByBatis((queryParam) -> {
            return commonMapper.selectLienPersonnelJoinTh(queryParam);
        }, query);
    }

    /**
     * 进驻表关联保障申请表
     */
    @RequestMapping(value = "selectLienPersonnelJoinBz", method = RequestMethod.POST)
    public SanyiPage<LienPersonnelBzDto> selectLienPersonnelJoinBz(@RequestBody QueryParam<LienPersonnelBzDto> query) {
        return lienPersonnelService.selectByBatis((queryParam) -> {
            return commonMapper.selectLienPersonnelJoinBz(queryParam);
        }, query);
    }

    /**
     * 进驻表关联体检表
     */
    @RequestMapping(value = "selectLienPersonnelJoinHealth", method = RequestMethod.POST)
    public SanyiPage<LienPersonnel> selectLienPersonnelJoinHealth(@RequestBody QueryParam<LienPersonnel> query) {
        return lienPersonnelService.selectByBatis((queryParam) -> {
            return commonMapper.selectLienPersonnelJoinHealth(queryParam);
        }, query);
    }

    // 文件导出wrod留置期限即将届满提醒函
    @RequestMapping(value = "noLimit_exportDaoChu/{id}", method = RequestMethod.GET)
    public void exportDaoChu(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        SimpleDateFormat formatToString = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat formatToDate = new SimpleDateFormat("yyyy-MM-dd");
        LienPersonnel lienPersonnel = lienPersonnelService.findById(id).get();
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        wordDataMap.put("parametersMap", parametersMap);
        String bumen = "";
        String daiHao = "";
        String enterTime = "   年   月   日  ";
        String daoqiTime = "   年   月   日 ";
        if (lienPersonnel.getCbDepartment() != null) {
            Dictionary dictionary = dictionaryRepository.findById(lienPersonnel.getCbDepartment()).get();
            if (dictionary != null) {
                bumen = dictionary.getDicName();
            }
        }
        if (lienPersonnel.getEnterTime() != null) {
            Date jinzhuTime = formatToDate.parse(lienPersonnel.getEnterTime());
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(jinzhuTime);


            rightNow.setTime(jinzhuTime);
            enterTime = formatToString.format(jinzhuTime);
            switch (lienPersonnel.getLzQiXian()) {

                case "1": // 3个月

                    rightNow.add(Calendar.MONTH, 3);//日期加3个月
                    daoqiTime = formatToString.format(rightNow.getTime());
                    break;
                case "2":  //6个月
                    rightNow.add(Calendar.MONTH, 6);//日期加6个月
                    daoqiTime = formatToString.format(rightNow.getTime());
                    break;
                case "3":  // 1年
                    rightNow.add(Calendar.MONTH, 12);//日期加1年
                    daoqiTime = formatToString.format(rightNow.getTime());
                    break;
                case "4":  // 3年
                    rightNow.add(Calendar.MONTH, 36);//日期加3年
                    daoqiTime = formatToString.format(rightNow.getTime());
                    break;
                default:
                    break;
            }
        }
        parametersMap.put("bumen", bumen); // 部门
        parametersMap.put("daiHao", lienPersonnel.getDaiHao()); // 代号
        parametersMap.put("enterTime", enterTime); // 进驻时间
        parametersMap.put("outTime", daoqiTime); // 撤离时间
        /*
         * String realPath = org.springframework.util.ResourceUtils.getFile(
         * "classpath:templates/留置期限即将届满提醒函.docx") .getAbsolutePath();
         */
        InputStream realPath = new ClassPathResource("/templates/留置期限即将届满提醒函.docx").getInputStream();
        String fileName = "留置期限即将届满提醒函.docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
    }


    /**
     * 导出Word重用的代码
     *
     * @param response
     * @param wordDataMap
     * @param wordPath
     * @param fileName
     * @throws IOException
     */
    public void chongYongDaiMa(HttpServletResponse response, Map<String, Object> wordDataMap, InputStream wordPath,
                               String fileName) throws IOException {
        response.setContentType("application/msword;charset=utf-8");
        response.setHeader("Content-Disposition",
                "attachment; filename=" + new String(fileName.getBytes(), "iso-8859-1"));
        WordTemplate template = new WordTemplate(wordPath);
        template.replaceDocument(wordDataMap);
        ServletOutputStream outputStream = response.getOutputStream();
        template.getDocument().write(outputStream);
        outputStream.close();
        wordPath.close();
    }

    // 文件导出天津市监委水上基地  在点  或者 撤离  或者 全部 被调查对象情况一览表
    @RequestMapping(value = "noLimit_exportLiuZhiRenExcel/{status}", method = RequestMethod.GET)
    public void exportLiuZhiRenExcel(HttpServletRequest request, HttpServletResponse response, @PathVariable("status") String status) throws Exception {
        // 模板文件所在路径
        InputStream realPath = new ClassPathResource("/templates/监委水上基地在点留置对象情况一览表.xlsx").getInputStream();
        // 输出路径
        String destFileName = "天津市监委水上基地在点留置对象情况一览表.xlsx";
        List<LienPersonnel> lienPersonnels = new ArrayList<LienPersonnel>();
        if (status.equals("1")) {// 已撤离
            realPath = new ClassPathResource("/templates/监委水上基地撤离留置对象情况一览表.xlsx").getInputStream();
            destFileName = "天津市监委水上基地撤离留置对象情况一览表.xlsx";
        }
        if (status.equals("ALL")) {
            realPath = new ClassPathResource("/templates/监委水上基地全部留置对象情况一览表.xlsx").getInputStream();
            destFileName = "天津市监委水上基地全部留置对象情况一览表.xlsx";
            // 查询看护信息列表
            lienPersonnels = lienPersonnelService.selectLienPersonnelAll();
        } else {
            // 查询看护信息列表
            lienPersonnels = lienPersonnelService.selectLienPersonnelStatus(status);// 传0 是在点人员  1 是撤离人员
        }

        Map<String, Object> beans = new HashMap<String, Object>();
        // 封装bean
        int paixu = 1;

        for (LienPersonnel lienPersonnel : lienPersonnels) {
            if (lienPersonnel.getRoomNum() != null) {
                lienPersonnel.setRoomName(roomService.findById(lienPersonnel.getRoomNum()).orElse(new Room()).getTitle());
            }
            if (lienPersonnel.getLzSex() != null) {
                switch (lienPersonnel.getLzSex()) {
                    case "1":
                        lienPersonnel.setSex("男");
                        break;
                    case "2":
                        lienPersonnel.setSex("女");
                        break;
                    default:
                        lienPersonnel.setSex("");
                        break;
                }
            } else {
                lienPersonnel.setSex("");
            }
            if (lienPersonnel.getCuoShiType() != null) {
                switch (lienPersonnel.getCuoShiType()) {
                    case "0":
                        lienPersonnel.setCuoshi("留置");
                        break;
                    case "1":
                        lienPersonnel.setCuoshi("监拘");
                        break;
                }
            } else {
                lienPersonnel.setCuoshi("");
            }
            if (lienPersonnel.getLzZhiJi() != null) {
                switch (lienPersonnel.getLzZhiJi()) {
                    case "1":
                        lienPersonnel.setZhiji("(处级以下)");
                        break;
                    case "2":
                        lienPersonnel.setZhiji("(处级)");
                        break;
                    case "3":
                        lienPersonnel.setZhiji("(厅局级)");
                        break;
                    case "4":
                        lienPersonnel.setZhiji("(厅局级以上)");
                        break;
                    default:
                        lienPersonnel.setZhiji("");
                        break;
                }
            } else {
                lienPersonnel.setZhiji("");
            }

            lienPersonnel.setPaixu(paixu++);
        }
        beans.put("list", lienPersonnels);
        String date = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
        beans.put("date", date);
        XLSTransformer transformer = new XLSTransformer();
        // 创建输入输出流
        InputStream in = null;
        ServletOutputStream out = null;
        try {
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String(destFileName.getBytes(), "iso-8859-1"));
            response.setContentType("application/vnd.ms-excel");
            in = new BufferedInputStream(realPath);
            out = response.getOutputStream();
            org.apache.poi.ss.usermodel.Workbook workbook = transformer.transformXLS(in, beans);
            // 将内容写入输出流并把缓存的内容全部发出去
            workbook.write(out);
            out.flush();
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }

    }

    /**
     * 将输入流中的数据写入字节数组
     *
     * @param in
     * @return
     */
    public static byte[] inputStream2ByteArray(InputStream in, boolean isClose) {
        byte[] byteArray = null;
        try {
            int total = in.available();
            byteArray = new byte[total];
            in.read(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isClose) {
                try {
                    in.close();
                } catch (Exception e2) {
                    System.out.println("关闭流失败");
                }
            }
        }
        return byteArray;
    }

    /**
     * 统计
     *
     * @return
     */

    @RequestMapping(value = "nolimit_countLienPerson", method = RequestMethod.POST)
    public SanyiPage<Map<String, Integer>> countlienPerson() {
        SanyiPage result = new SanyiPage();
        result.setContent(commonMapper.countLienPerson());
        return result;
    }

    @RequestMapping(value = "nolimit_countLienPersonByFloor", method = RequestMethod.POST)
    public SanyiPage<Map<String, Integer>> nolimit_countLienPersonByFloor(HttpServletRequest request, @RequestBody String floor) {
        SanyiPage result = new SanyiPage();
        result.setContent(commonMapper.countLienPersonByFloor(floor));
        return result;
    }

}
