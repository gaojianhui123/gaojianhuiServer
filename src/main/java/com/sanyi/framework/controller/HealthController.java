package com.sanyi.framework.controller;

import com.sanyi.framework.service.impl.HealthDrugRelateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sanyi.framework.service.impl.LienPersonnelService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.sanyi.framework.service.impl.HealthService;
import org.springframework.core.io.ClassPathResource;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import com.sanyi.framework.dto.StatisticResultDto;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.HealthDrugRelate;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import com.sanyi.framework.model.LienPersonnel;

import javax.servlet.http.HttpServletResponse;

import com.sanyi.framework.util.WordTemplate;

import javax.servlet.http.HttpServletRequest;

import com.sanyi.framework.dto.StatisticDto;
import org.apache.poi.xwpf.usermodel.IBody;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;

import javax.servlet.ServletOutputStream;

import com.sanyi.framework.model.Health;

import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

@RestController
@RequestMapping(value = "/health")
public class HealthController {
    @Autowired
    HealthService healthService;
    @Autowired
    HealthDrugRelateService healthDrugRelateService;
    @Autowired
    private LienPersonnelService lienPersonnelService;
    @Autowired
    private HealthDrugRelateService HealthDrugRelateService;
    @Autowired
    private CommonMapper commonMapper;

    // 查询列表
    @RequestMapping(value = "findHealths", method = RequestMethod.POST)
    public SanyiPage<Health> findHealths(@RequestBody QueryParam<Health> query) {
        return healthService.selectByJpa(query);
    }

    // 查询列表(batis)
    @RequestMapping(value = "findHealth", method = RequestMethod.POST)
    public SanyiPage<Health> findGrid(@RequestBody QueryParam<Health> query) {
        return healthService.selectByBatis(query);
    }

    // 根据id查体检
    @RequestMapping(value = "getHealthById", method = RequestMethod.POST)
    public Health findHealthById(HttpServletRequest request, @RequestBody String id) {
        return healthService.findById(id).orElse(new Health());
    }

    // 新增体检信息
    @RequestMapping(value = "saveHealth", method = RequestMethod.POST)
    public Health saveHealth(HttpServletRequest request, @RequestBody Health health) {
        return healthService.save(health);
    }

    // 针对进驻体检的 保存新增体检信息
    @RequestMapping(value = "saveJinZhuTiJian", method = RequestMethod.POST)
    public Health saveJinZhuTiJian(HttpServletRequest request, @RequestBody Health health) throws BusinessException {
        return healthService.saveHealth(health);
    }

    // 逻辑删除
    @RequestMapping(value = "deleteHealth", method = RequestMethod.POST)
    public Health deleteHealth(HttpServletRequest request, @RequestBody Health health) {
        // role.setDeleted(true);
        return healthService.logicDelete(health);
    }

    // 批量逻辑删除
    @RequestMapping(value = "deleteHealthAll", method = RequestMethod.POST)
    public Iterable<Health> deleteHealthAll(HttpServletRequest request, @RequestBody Iterable<Health> healthList) {

        return healthService.logicDeletedAll((Iterable<Health>) healthList);
    }

    // 查询留置人身体指标心率
    @RequestMapping(value = "selectlzXinLv", method = RequestMethod.POST)
    public List<StatisticResultDto> selectlzXinLv(@RequestBody StatisticDto sDto) {

        List<StatisticResultDto> aa = commonMapper.selectlzXinLv(sDto);
        return aa;
    }

    /**
     * 进驻体检在每条后面点击导出
     *
     * @param id       进驻体检id
     * @param lpId     留置人id
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "noLimit_exportJinZhu/{id}/{lpId}", method = RequestMethod.GET)
    public void exportJinZhu(@PathVariable("id") String id, @PathVariable("lpId") String lpId, HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        Optional<LienPersonnel> optional = lienPersonnelService.findById(lpId);
        LienPersonnel lienPersonnel = optional.get(); // 获得留置人对象
        Optional<Health> optionalH = healthService.findById(id);
        Health health = optionalH.get(); // 获得进驻体检对象
        parametersMap.put("daihao", lienPersonnel.getDaiHao()); // 代号
        String sex;
        switch (lienPersonnel.getLzSex()) {
            case "1":
                sex = "男";
                break;
            case "2":
                sex = "女";
                break;
            default:
                sex = "未知";
                break;
        }
        parametersMap.put("sex", sex); // 性别
        if (lienPersonnel.getLzAge() != null) { // 年龄
            parametersMap.put("age", lienPersonnel.getLzAge());
        } else {
            parametersMap.put("age", "");
        }
        if (health.getTiWen() != null) { // 体温
            parametersMap.put("tiwen", health.getTiWen() + "℃");
        } else {
            parametersMap.put("tiwen", "");
        }
        if (health.getGaoXueYa() != null) { // 高压
            parametersMap.put("gaoxueya", health.getGaoXueYa());
        } else {
            parametersMap.put("gaoxueya", ""); //高血压
        }
        if (health.getXueYa() != null) { // 低压
            parametersMap.put("xueya", health.getXueYa() + "mmHg");
        } else {
            parametersMap.put("xueya", "");
        }
        if (health.getXueTang() != null) { // 随机血糖
            parametersMap.put("xuetang", health.getXueTang() + "mmol/l");
        } else {
            parametersMap.put("xuetang", "");
        }
        if (health.getXinLv() != null) { // 心率
            parametersMap.put("xinlv", health.getXinLv() + "次/分钟");
        } else {
            parametersMap.put("xinlv", "");
        }
        if (health.getHistoryMedical() != null) { //病史
            //首行缩进两个字符
            parametersMap.put("jiwangbingshi", "    " + health.getHistoryMedical());
        } else {
            parametersMap.put("jiwangbingshi", "");
        }
        if (health.getCheckHealth() != null) { //体格检查
            //首行缩进两个字符
            parametersMap.put("tigejiancha", "  "+ health.getCheckHealth());
        } else {
            parametersMap.put("tigejiancha", "");
        }
        if (health.getDoctorYiJian() != null) { //医生意见
            parametersMap.put("yijian", "   "+ health.getDoctorYiJian());
        } else {
            parametersMap.put("yijian", "");
        }
        if (health.getDoctor() != null) { //医生
            parametersMap.put("yisheng", health.getDoctor());
        } else {
            parametersMap.put("yisheng", "");
        }
        if (health.getTiJianTime() != null) { // 体检时间
            parametersMap.put("time", new SimpleDateFormat("yyyy-MM-dd").format(health.getTiJianTime()));
        } else {
            parametersMap.put("time", "");
        }
        if (health.getHushi() != null) { // 护士
            parametersMap.put("hushi", health.getHushi());
        } else {
            parametersMap.put("hushi", "");
        }
        if (health.getXinDianTu() != null) { //心电图
            //首行缩进两个字符
            parametersMap.put("xindiantu", health.getXinDianTu());
        } else {
            parametersMap.put("xindiantu", "");
        }
//		if (health.getFuZeRen() != null) { // 负责人
//			parametersMap.put("fuzeren", health.getFuZeRen());
//		} else {
//			parametersMap.put("fuzeren", "");
//		}
//		if (health.getFuZeRenTel() != null) { // 电话
//			parametersMap.put("tel", health.getFuZeRenTel());
//		} else {
//			parametersMap.put("tel", "");
//		}
        wordDataMap.put("parametersMap", parametersMap);
        InputStream realPath = new ClassPathResource("/templates/被调查人体检登记表2.docx").getInputStream();
        String fileName = "被调查人体检登记表-"+lienPersonnel.getDaiHao()+ ".docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
    }

    /**
     * 按照进驻人Id导出常规体检信息（生命体征）
     */
    @RequestMapping(value = "noLimit_exportTiZheng/{lpId}", method = RequestMethod.GET)
    public void noLimit_exportTiZheng(@PathVariable("lpId") String lpId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        Optional<LienPersonnel> optional = lienPersonnelService.findById(lpId);
        LienPersonnel lienPersonnel = optional.get();
        List<Health> healths = commonMapper.selectHealthStatusTwo(lpId);
        parametersMap.put("daihao", lienPersonnel.getDaiHao()); // 代号
        List<Map<String, Object>> table1 = new ArrayList<Map<String, Object>>();
        for (Health health : healths) {
            Map<String, Object> map1 = new HashMap<>();
            if (health.getTiJianTime() != null) { // 体检时间
                map1.put("date", new SimpleDateFormat("yyyy-MM-dd").format(health.getTiJianTime()));
            } else {
                map1.put("date", "");
            }
            if (health.getTiWen() != null) { // 体温
                map1.put("tw", health.getTiWen());
            } else {
                map1.put("tw", "");
            }
            if (health.getGaoXueYa() != null) { // 高压
                map1.put("gxy", health.getGaoXueYa());
            } else {
                map1.put("gxy", "");
            }
            if (health.getXueYa() != null) { // 低压
                map1.put("xy", health.getXueYa());
            } else {
                map1.put("xy", "");
            }
            if (health.getXueTang() != null) { // 血糖
                map1.put("xt", health.getXueTang());
            } else {
                map1.put("xt", "");
            }
            if (health.getXinLv() != null) { // 心率
                map1.put("xl", health.getXinLv());
            } else {
                map1.put("xl", "");
            }
            if (health.getWeight() != null) { // 体重
                map1.put("tz", health.getWeight());
            } else {
                map1.put("tz", "");
            }
            if (health.getDoctor() != null) { // 医生
                map1.put("ys", health.getDoctor());
            } else {
                map1.put("ys", "");
            }
            table1.add(map1);
        }
        wordDataMap.put("table1", table1);
        wordDataMap.put("parametersMap", parametersMap);
        InputStream realPath = new ClassPathResource("/templates/生命体征.docx").getInputStream();
        String fileName = "被调查人日常体检表-"+lienPersonnel.getDaiHao()+" .docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
    }

    /**
     * 按照进驻人Id导出常规体检信息（特殊情况）
     */
    @RequestMapping(value = "noLimit_exportSpecial/{lpId}", method = RequestMethod.GET)
    public void noLimit_exportSpecial(@PathVariable("lpId") String lpId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        Optional<LienPersonnel> optional = lienPersonnelService.findById(lpId);
        LienPersonnel lienPersonnel = optional.get();
        List<Health> healths = commonMapper.selectHealthStatusTwo(lpId);
        parametersMap.put("daihao", lienPersonnel.getDaiHao());
        List<Map<String, Object>> table1 = new ArrayList<Map<String, Object>>();
        for (Health health : healths) {
            Map<String, Object> map1 = new HashMap<>();
            if (health.getSpecialCase() != null) {
                if (health.getTiJianTime() != null) {
                    map1.put("date", new SimpleDateFormat("yyyy-MM-dd").format(health.getTiJianTime()));
                } else {
                    map1.put("date", "");
                }
                if (health.getSpecialCase() != null) {
                    map1.put("qingkuang", health.getSpecialCase());
                } else {
                    map1.put("qingkuang", "");
                }
                if (health.getDoctor() != null) {
                    map1.put("yisheng", health.getDoctor());
                } else {
                    map1.put("yisheng", "");
                }
                table1.add(map1);
            }
        }
        wordDataMap.put("table1", table1);
        wordDataMap.put("parametersMap", parametersMap);
        InputStream realPath = new ClassPathResource("/templates/特殊情况.docx").getInputStream();
        String fileName = "被调查人特殊情况登记表-"+lienPersonnel.getDaiHao()+".docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
    }

    /**
     * 按照进驻人Id导出常规体检信息（用药记录 长期医嘱）
     */
    @RequestMapping(value = "noLimit_exportYongYao/{yongyaoType}/{lpId}", method = RequestMethod.GET)
    public void noLimit_exportYongYao(@PathVariable("yongyaoType") String yongyaoType, @PathVariable("lpId") String lpId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        Optional<LienPersonnel> optional = lienPersonnelService.findById(lpId);
        LienPersonnel lienPersonnel = optional.get();
        List<HealthDrugRelate> healths = commonMapper.selectHealthYongYaoStatus(lpId, yongyaoType);
        parametersMap.put("daihao", lienPersonnel.getDaiHao());
        List<Map<String, Object>> table1 = new ArrayList<Map<String, Object>>();
        List<Object> items = new ArrayList<Object>();
        Object[] distintItems = null;
        for (HealthDrugRelate health : healths) {

            if (health.getProjectName() == null && health.getDrugName() == null) {
                continue;
            }
            Map<String, Object> map2 = new HashMap<>();
//			String key_ = lienPersonnel.getDaiHao()+health.getTiJianDate()+health.getShiDuan();
//			items.add(key_);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            if (health.getKaishiTime() != null)
                map2.put("ks", health.getKaishiTime().substring(0, 10));
            if (health.getJieshuTime() != null)
                map2.put("js", health.getJieshuTime().substring(0, 10));
            map2.put("pc", health.getPinciString());
            map2.put("yy", health.getDrugName());
            map2.put("sl", health.getYongliang());
            map2.put("gg", health.getGuigeString());
            map2.put("yf", health.getYongfa());
            map2.put("kaiYaoYiSheng", health.getKaiYaoDoctor());
            map2.put("tingYaoYiSheng", health.getTingYaoDoctor());
            map2.put("jc", health.getProjectName());
//			map2.put("yisheng", health.getDoctor());
            table1.add(map2);

        }
//		distintItems=items.stream().distinct().toArray();
//		for(Object item: distintItems){
//			Map<String, Object> map1 = new HashMap<>();
//			StringBuffer drugDes= new StringBuffer();
//			Health currentHealth = new Health();
//			
//			for (Health health_ : healths) {
//				if((health_.getDaihao()+health_.getTiJianDate()+health_.getShiDuan()).equals(item.toString())){
////					drugDes.append(health_.getDicName() + " " + health_.getYaoliang() + health_.getDanwei() + " " + health_.getRemark() + "\r\n");
////					drugDes.append(health_.getTiJianDate()+health_.getShiDuan());
//					currentHealth = health_;
//				}		
//			}
//			map1.put("date",  currentHealth.getTiJianDate());
//			System.out.println(drugDes.toString());
////			map1.put("yongyao", drugDes.toString());
//			map1.put("yisheng", currentHealth.getDoctor());
//			table1.add(map1);
//		}
        wordDataMap.put("table1", table1);
        wordDataMap.put("parametersMap", parametersMap);
        if (yongyaoType.equals("1")) {
            InputStream realPath = new ClassPathResource("/templates/用药记录临时用药.docx").getInputStream();
            String fileName = "被调查人日常用药登记表(临时医嘱)-"+lienPersonnel.getDaiHao()+".docx";
            chongYongDaiMa(response, wordDataMap, realPath, fileName);
        } else {
            InputStream realPath = new ClassPathResource("/templates/用药记录.docx").getInputStream();
            String fileName = "被调查人日常用药登记表(长期医嘱)-"+lienPersonnel.getDaiHao()+".docx";
            chongYongDaiMa(response, wordDataMap, realPath, fileName);
        }


//		chongYongHeBingDaiMa(response, wordDataMap, realPath, fileName);
    }

    /**
     * 按照进驻人Id导出常规体检信息（用药记录 临时医嘱）
     */
    @RequestMapping(value = "noLimit_exportYongYaoLinShi/{id}/{lpId}/{healthId}", method = RequestMethod.GET)
    public void noLimit_exportYongYaoLinShi(@PathVariable("id") String id, @PathVariable("lpId") String lpId,
                                            HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> wordDataMap = new HashMap<>();// 存储word中所有数据
        Map<String, Object> parametersMap = new HashMap<>();// 存储不循环的数据
        Optional<LienPersonnel> optional = lienPersonnelService.findById(lpId);
        LienPersonnel lienPersonnel = optional.get();
        List<Health> healths = healthService.selectHealthYongYaoStatuls(lpId);
        parametersMap.put("daihao", lienPersonnel.getDaiHao());
        List<Map<String, Object>> table1 = new ArrayList<Map<String, Object>>();
        List<Object> items = new ArrayList<Object>();
        Object[] distintItems = null;
        for (Health health : healths) {
            Map<String, Object> map2 = new HashMap<>();
            map2.put("date", health.getTiJianDate());
            String key_ = health.getDaihao() + health.getTiJianDate() + health.getShiDuan();
            items.add(key_);
            map2.put("ks", health.getKaishiTime());
            map2.put("yy", health.getDicName());
            map2.put("sl", health.getYaoliang());
            map2.put("gg", health.getDanwei());
            map2.put("yf", health.getRemark());
            map2.put("yisheng", health.getDoctor());
            table1.add(map2);
        }
        distintItems = items.stream().distinct().toArray();
        wordDataMap.put("table1", table1);
        wordDataMap.put("parametersMap", parametersMap);
        InputStream realPath = new ClassPathResource("/templates/用药记录临时用药.docx").getInputStream();
        String fileName = "被调查人日常用药登记表(临时医嘱).docx";
        chongYongDaiMa(response, wordDataMap, realPath, fileName);
//		chongYongHeBingDaiMa(response, wordDataMap, realPath, fileName);
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

    /**
     * 导出Word重用的代码 合并单元格
     *
     * @param response
     * @param wordDataMap
     * @param wordPath
     * @param fileName
     * @throws IOException
     */
    public void chongYongHeBingDaiMa(HttpServletResponse response, Map<String, Object> wordDataMap, String wordPath,
                                     String fileName) throws IOException {
        response.setContentType("application/msword;charset=utf-8");
        response.setHeader("Content-Disposition",
                "attachment; filename=" + new String(fileName.getBytes(), "iso-8859-1"));
        File file = new File(wordPath);
        FileInputStream fileInputStream = new FileInputStream(file);
        WordTemplate template = new WordTemplate(fileInputStream);
        List<IBodyElement> document = template.replaceDocument(wordDataMap);
        List<XWPFTable> tables = null;
        XWPFTable xwpfTable = null;
        for (IBodyElement i : document) {
            IBody body = i.getBody();
            tables = body.getTables();
        }
        // 获取第0个表格
        xwpfTable = tables.get(0);
        // 装第0列 所有信息
        List<String> firstCols = new LinkedList<String>();
        List<String> towCols = new LinkedList<String>();

        List<XWPFTableRow> rows = xwpfTable.getRows();
        // 第二列所有值
//		rows.forEach(row -> {
//			List<XWPFTableCell> cells = row.getTableCells();
//			for (XWPFTableCell cell : cells) {
//				if (cells.indexOf(cell) == 2) {
//					towCols.add(cell.getText());
//				}
//			}
//		});
        rows.forEach(row -> {
            List<XWPFTableCell> cells = row.getTableCells();
            firstCols.add(cells.get(0).getText());
        });

//		int count = 1;
//		int sum = 0;
//		for (int i = 0; i < firstCols.size() - 1; i++) {
//			String s = firstCols.get(i);
//			for (int j = i + 1; j < firstCols.size(); j++) {
//				if (s.equals(firstCols.get(j))) {
//					sum = Integer.valueOf(towCols.get(i)) + Integer.valueOf(towCols.get(j));
//					count++;
//				}
//			}
//		}
        // 去重第一列所有内容
        System.err.println(firstCols);
        Object[] cols = firstCols.stream().distinct().toArray();

        List<Pair> pairs = new LinkedList<Pair>();
        for (int i = 0; i < cols.length; i++) {
            pairs.add(new Pair(firstCols.indexOf(cols[i]), firstCols.lastIndexOf(cols[i])));
        }
        for (int i = 0; i < pairs.size(); i++) {
            template.mergeCellsVertically(xwpfTable, 0, pairs.get(i).first, pairs.get(i).last);
            template.mergeCellsVertically(xwpfTable, 5, pairs.get(i).first, pairs.get(i).last);
//			template.mergeCellsVertically(xwpfTable, 3, pairs.get(i).first, pairs.get(i).last);
//			if (pairs.get(i).first != pairs.get(i).last) {
//				int w = 0;
//				for (int j = pairs.get(i).first; j <= pairs.get(i).last; j++) {
//					try {
//						w = new Integer(xwpfTable.getRow(j).getCell(3).getText()).intValue() + w;
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//
//				for (int k = pairs.get(i).first; k <= pairs.get(i).last; k++) {
//					for (XWPFParagraph p : xwpfTable.getRow(k).getCell(1).getParagraphs()) {
//						List<XWPFRun> runs = p.getRuns();
//						for (XWPFRun run : runs) {
//							// 如果文本对象在List中第一个位置则设置count 否则设置为空值
//							if (runs.indexOf(run) == 0) {
//								runs.get(runs.indexOf(run)).setText(count + "", 0);
//							} else {
//								runs.get(runs.indexOf(run)).setText("", 0);
//							}
//
//						}
//
//					}
//					for (XWPFParagraph p : xwpfTable.getRow(k).getCell(3).getParagraphs()) {
//						List<XWPFRun> runs = p.getRuns();
//						for (XWPFRun run : runs) {
//							// 如果文本对象在List中第一个位置则设置sum 否则设置为空值
//							if (runs.indexOf(run) == 0) {
//								runs.get(runs.indexOf(run)).setText(sum + "", 0);
//							} else {
//								runs.get(runs.indexOf(run)).setText("", 0);
//							}
//
//						}
//					}
//				}

//			}

        }

        ServletOutputStream outputStream = response.getOutputStream();
        template.getDocument().write(outputStream);
        outputStream.close();
        fileInputStream.close();
    }

    class Pair {

        public Pair(int first, int last) {
            super();
            this.first = first;
            this.last = last;
        }

        int first;
        int last;

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getLast() {
            return last;
        }

        public void setLast(int last) {
            this.last = last;
        }

    }
}
