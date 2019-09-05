package com.sanyi.framework.controller;

import java.io.FileOutputStream;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.awt.image.BufferedImage;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dto.CardInfoDto;
import com.sanyi.framework.dto.EntranceGuardStaffDto;
import com.sanyi.framework.page.QueryParam;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import com.sanyi.framework.service.DictionaryService;
import com.sanyi.framework.service.impl.LienPersonnelService;
import com.sanyi.framework.service.impl.RoomService;
import com.sanyi.framework.service.impl.TanhuashenqingService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.Dictionary;
import com.sanyi.framework.model.LienPersonnel;
import com.sanyi.framework.model.Room;
import com.sanyi.framework.model.Tanhuashenqing;
import com.sanyi.framework.page.SanyiPage;

@RestController
@RequestMapping(value = "/tanhuashenqing")
public class TanhuashenqingController {
	@Autowired
	TanhuashenqingService tanhuashenqingService;
	@Autowired
	LienPersonnelService lienPersonnelService;
	@Autowired
	DictionaryService dictionaryService;
	@Autowired
	RoomService roomService;
	@Autowired
	CommonMapper commonMapper;
	// 门禁系统地址
	@Value("${menjinBaseUrl}")
	private String menjinBaseUrl;
	@Autowired
	private RestTemplate restTemplate;

	// 查询列表
	@RequestMapping(value = "findTanhuashenqings", method = RequestMethod.POST)
	public SanyiPage<Tanhuashenqing> findTanhuashenqings(@RequestBody QueryParam<Tanhuashenqing> query) {
		return tanhuashenqingService.selectByJpa(query);
	}

	// 查询列表(batis)
	@RequestMapping(value = "findTanhuashenqing", method = RequestMethod.POST)
	public SanyiPage<Tanhuashenqing> findGrid(@RequestBody QueryParam<Tanhuashenqing> query) {
		return tanhuashenqingService.selectByBatis(query);
	}

	// 根据id查谈话申请
	@RequestMapping(value = "findTanhuashenqingById", method = RequestMethod.POST)
	public Tanhuashenqing findTanhuashenqingById(HttpServletRequest request, @RequestBody String id) {
		return tanhuashenqingService.findById(id).orElse(new Tanhuashenqing());
	}

	// 保存 谈话申请信息
	@RequestMapping(value = "saveTanhuashenqing", method = RequestMethod.POST)
	public Tanhuashenqing saveTanhuashenqing(HttpServletRequest request, @RequestBody Tanhuashenqing tanhuashenqing) {
		tanhuashenqingService.save(tanhuashenqing);
		// if(tanhuashenqing.getShenpiStatus() == "0") {
		// mqttGateway.sendToMqtt("新到一个谈话权限申请","THQXSQalert");
		// System.out.println("-----------------------THQXSQalert------------------------");
		return tanhuashenqing;
	}

	// 逻辑删除
	@RequestMapping(value = "deleteTanhuashenqing", method = RequestMethod.POST)
	public Tanhuashenqing deleteTanhuashenqing(HttpServletRequest request, @RequestBody Tanhuashenqing tanhuashenqing) {
		return tanhuashenqingService.logicDelete(tanhuashenqing);
	}

	/**
	 * 看护管理-谈话名单查询
	 * 
	 * @param query
	 * @return
	 */
	@RequestMapping(value = "talklist", method = RequestMethod.POST)
	public SanyiPage<Tanhuashenqing> talklist(@RequestBody QueryParam<Tanhuashenqing> query) {
		return tanhuashenqingService.selectByBatis((queryParam) -> {
			return commonMapper.talklist(queryParam);
		}, query);
	}

	// 解除人员权限
	@RequestMapping(value = "unregisteruserDoorArea", method = RequestMethod.POST)
	public void unregisteruserDoorArea(HttpServletRequest request, @RequestBody Tanhuashenqing tanhuashenqing) {

		// 根据留置人id获取留置人的进驻时间
		LienPersonnel lienPersonnel = lienPersonnelService.findById(tanhuashenqing.getLpId())
				.orElse(new LienPersonnel());
		String url = menjinBaseUrl + "reformer/interface/unregisteruserDoorArea";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		for (String renyuanId : tanhuashenqing.getRenyuan()) {
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

	// 谈话名单查询里的导出 入口为看护管理 --> 谈话名单查询
	@RequestMapping(value = "noLimit_lienTanhuashenqinginExport/{id}", method = RequestMethod.GET)
	public void lienTanhuashenqinginExport(@PathVariable("id") String id, HttpServletRequest request,HttpServletResponse response) throws Exception {
//		// 根据谈话申请的id 获取被调查人代号、填报部门、填报人、填报日期、人员信息
		Tanhuashenqing t= tanhuashenqingService.findTanHuaShenQingExport(id); // 获得要导出的数据
		if (t.getLpId() != null) {
			LienPersonnel lienPersonnel = lienPersonnelService.findById(t.getLpId()).get();
			t.setDaiHao(lienPersonnel.getDaiHao());
		}
		if (t.getBumen() != null) {
			Dictionary dictionary = dictionaryService.findById(t.getBumen()).get();
			t.setBumenString(dictionary.getDicName());
		}
		FileOutputStream fileOut = null;  
//        BufferedImage bufferImg = null;//图片
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tbrq = "";
        if (t.getTianBaoTime() != null) { // 数据处理
        	tbrq = sdf.format(t.getTianBaoTime());
        }
        // http://img2.3lian.com/2014/f4/140/d/72.jpg
        List<CardInfoDto> cardInfoDtos = new ArrayList<CardInfoDto>();
        if (t.getRenyuan() != null && t.getRenyuan().size() > 0) {
        	t.getRenyuan().forEach(r -> {cardInfoDtos.add(findRenYuanPhotoUrl(r));});
        }
//        List<CardInfoDto> cardInfoDtos = new ArrayList<CardInfoDto>();
//        CardInfoDto c1 = new CardInfoDto();
//        c1.setEmployeeName("李明");
//        c1.setEmployeeId("0000");
////        c1.setPhoto("http://img2.3lian.com/2014/f4/140/d/72.jpg");
//        c1.setPhoto(menjinBaseUrl + "/888");
//        CardInfoDto c2 = new CardInfoDto();
//        c2.setEmployeeName("王五1");
//        c2.setEmployeeId("0001");
//        c2.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        CardInfoDto c3 = new CardInfoDto();
//        c3.setEmployeeName("王五2");
//        c3.setEmployeeId("0002");
//        c3.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        CardInfoDto c4 = new CardInfoDto();
//        c4.setEmployeeName("王五3");
//        c4.setEmployeeId("0003");
//        c4.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        cardInfoDtos.add(c1);
//        cardInfoDtos.add(c2);
//        cardInfoDtos.add(c3);
//        cardInfoDtos.add(c4);
        try {  
            // 创建一个工作薄  
            HSSFWorkbook wb = new HSSFWorkbook();  
            //创建一个sheet  
            HSSFSheet sheet = wb.createSheet("纪律审查备案表"); 
            /**
             * 标题的字体
             */
            HSSFFont font = wb.createFont();
            font.setFontName("方正小标宋简体");
            font.setFontHeightInPoints((short) 20);//设置字体大小
            font.setBold(true);// 字体加粗
            
            /**
             * 标题的样式
             */
            HSSFCellStyle style = wb.createCellStyle();
            style.setVerticalAlignment(VerticalAlignment.CENTER);
            style.setAlignment(HorizontalAlignment.CENTER);
            style.setFont(font);
            style.setBorderBottom(BorderStyle.THIN);
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderTop(BorderStyle.THIN);
            /**
             * 正文的列头的标题
             */
            HSSFFont font1 = wb.createFont();
            font1.setFontName("方正仿宋简体");
            font1.setFontHeightInPoints((short) 16);//设置字体大小
            font1.setBold(true); // 字体加粗
            /**
             * 正文的列头的样式
             */
            HSSFCellStyle style1 = wb.createCellStyle();
            style1.setVerticalAlignment(VerticalAlignment.CENTER);
            style1.setAlignment(HorizontalAlignment.CENTER);
            style1.setFont(font1);
            style1.setBorderBottom(BorderStyle.THIN);
            style1.setBorderLeft(BorderStyle.THIN);
            style1.setBorderRight(BorderStyle.THIN);
            style1.setBorderTop(BorderStyle.THIN);
            /**
             * 正文的文本内容的字体
             */
            HSSFFont font2 = wb.createFont();
            font2.setFontName("方正仿宋简体");
            font2.setFontHeightInPoints((short) 12);//设置字体大小
            font2.setBold(true); // 字体加粗
            /**
             * 正文的文本内容的样式
             */
            HSSFCellStyle style2 = wb.createCellStyle();
            style2.setVerticalAlignment(VerticalAlignment.CENTER);
            style2.setAlignment(HorizontalAlignment.CENTER);
            style2.setWrapText(true);
            style2.setFont(font2);
            style2.setBorderBottom(BorderStyle.THIN);
            style2.setBorderLeft(BorderStyle.THIN);
            style2.setBorderRight(BorderStyle.THIN);
            style2.setBorderTop(BorderStyle.THIN);
            
            sheet.setColumnWidth(0, 20 * 256); // 设置第1列的宽度
            sheet.setColumnWidth(1, 20 * 256); // 设置第2列的宽度
            sheet.setColumnWidth(2, 20 * 256); // 设置第3列的宽度
            sheet.setColumnWidth(3, 20 * 256); // 设置第4列的宽度
            // 单元格合并      
            // 四个参数分别是：起始行，起始列，结束行，结束列   
            CellRangeAddress cra= new CellRangeAddress(0,0,0,3);
            sheet.addMergedRegion(cra);
            
            HSSFRow row0 = sheet.createRow(0); // 第0 行
            /**
             * 第0 行 的 四个列加边框
             */
            HSSFCell ce0 = row0.createCell((short) 0);
            ce0.setCellStyle(style);
            HSSFCell ce1 = row0.createCell((short) 1);
            ce1.setCellStyle(style);
            HSSFCell ce2 = row0.createCell((short) 2);
            ce2.setCellStyle(style);
            HSSFCell ce3 = row0.createCell((short) 3);
            ce3.setCellStyle(style);
            ce0.setCellValue("纪律审查备案表");
            row0.setHeight((short) (60*20)); // 第一行标题的高度
            
            HSSFRow row1 = sheet.createRow(1); // 第一行
            row1.setHeight((short) (47*20)); // 第二行标题的高度
            HSSFCell row1_ce0 = row1.createCell((short)0);
            row1_ce0.setCellValue("被调查人代号");
            row1_ce0.setCellStyle(style1);
            HSSFCell row1_ce1 = row1.createCell((short)1);
            row1_ce1.setCellValue("填报部门");
            row1_ce1.setCellStyle(style1);
            HSSFCell row1_ce2 = row1.createCell((short)2);
            row1_ce2.setCellValue("填报人");
            row1_ce2.setCellStyle(style1);
            HSSFCell row1_ce3 = row1.createCell((short)3);
            row1_ce3.setCellValue("填报日期");
            row1_ce3.setCellStyle(style1);
        	HSSFRow row2 = sheet.createRow(2); // 第二行
        	row2.setHeight((short) (42*20)); // 高度
        	HSSFCell row2_ce0 = row2.createCell((short)0);
        	row2_ce0.setCellValue(t.getDaiHao());
        	row2_ce0.setCellStyle(style2);
            HSSFCell row2_ce1 = row2.createCell((short)1);
            row2_ce1.setCellValue(t.getBumenString());
            row2_ce1.setCellStyle(style2);
            HSSFCell row2_ce2 = row2.createCell((short)2);
            row2_ce2.setCellValue(t.getTianbaoren());
            row2_ce2.setCellStyle(style2);
            HSSFCell row2_ce3 = row2.createCell((short)3);
            row2_ce3.setCellValue(tbrq);
            row2_ce3.setCellStyle(style2);
            
            HSSFRow row3 = sheet.createRow(3); // 第三行
            row3.setHeight((short) (47*20)); // 第三行标题的高度
            HSSFCell row3_ce0 = row3.createCell((short)0);
            row3_ce0.setCellValue("姓名及编号");
            row3_ce0.setCellStyle(style1);
            HSSFCell row3_ce1 = row3.createCell((short)1);
            row3_ce1.setCellValue("照片");
            row3_ce1.setCellStyle(style1);
            HSSFCell row3_ce2 = row3.createCell((short)2);
            row3_ce2.setCellValue("姓名及编号");
            row3_ce2.setCellStyle(style1);
            HSSFCell row3_ce3 = row3.createCell((short)3);
            row3_ce3.setCellValue("照片");
            row3_ce3.setCellStyle(style1);
            
        	
            // 利用HSSFPatriarch将图片写入EXCEL  
            HSSFPatriarch patriarch = sheet.createDrawingPatriarch();  
            /** 
             * 该构造函数有8个参数 
             * 前四个参数是控制图片在单元格的位置，分别是图片距离单元格left，top，right，bottom的像素距离 
             * 后四个参数，前连个表示图片左上角所在的cellNum和 rowNum，后天个参数对应的表示图片右下角所在的cellNum和 rowNum， 
             * excel中的cellNum和rowNum的index都是从0开始的 
             */  
            int length = cardInfoDtos.size(); // 名单个数
            // 模拟有四个人员数据 需要导出 
            if (length > 0) {
            	//排序
                Collections.sort(cardInfoDtos);
            	for (int i = 1, j = 4; i <= length; i++) {
    				if (i%2 != 0) { // 奇数
    					HSSFRow newRow = sheet.createRow(j); 
						newRow.setHeight((short) (110*20));// 高度
						HSSFCell newRow_ce0 = newRow.createCell((short)(0));
						newRow_ce0.setCellValue(new HSSFRichTextString(cardInfoDtos.get(i-1).getEmployeeName() + "\r\n "+ cardInfoDtos.get(i-1).getEmployeeId()));
						newRow_ce0.setCellStyle(style2);
						HSSFCell newRow_ce1 = newRow.createCell((short)(1));
						newRow_ce1.setCellStyle(style2);
						try {
							URL url1 = new URL(menjinBaseUrl + cardInfoDtos.get(i-1).getPhoto());
							DataInputStream dataInputStream1 = new DataInputStream(url1.openStream());
							// 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray  
							ByteArrayOutputStream byteArrayOut1 = new ByteArrayOutputStream();  
							//将图片读到BufferedImage  
							BufferedImage bufferImg1 = ImageIO.read(dataInputStream1);  
							// 将图片写入流中  
							ImageIO.write(bufferImg1, "png", byteArrayOut1);      
							
							// 插入图片
							HSSFClientAnchor anchor1 = new HSSFClientAnchor(90, 20,0, 0,(short) (1), j, (short) (2), j+1);  
							// 插入图片  
							patriarch.createPicture(anchor1, wb.addPicture(byteArrayOut1.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
						} catch (IOException io) {// 报图片文件未找到
							io.printStackTrace();  
				            System.out.println("io erorr : " + io.getMessage());  
				            newRow_ce1.setCellValue("");
						} 
    	                if (i+1 <= length) {
    	                	HSSFCell newRow_ce2 = newRow.createCell((short)(2));
    						newRow_ce2.setCellValue(new HSSFRichTextString(cardInfoDtos.get(i).getEmployeeName() + "\r\n "+ cardInfoDtos.get(i).getEmployeeId()));
    						newRow_ce2.setCellStyle(style2);
    						HSSFCell newRow_ce3 = newRow.createCell((short)(3));
    						newRow_ce3.setCellStyle(style2);
    						try {
								URL url2 = new URL(menjinBaseUrl + cardInfoDtos.get(i).getPhoto());
								DataInputStream dataInputStream2 = new DataInputStream(url2.openStream());
								// 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray  
								ByteArrayOutputStream byteArrayOut2 = new ByteArrayOutputStream();  
								//将图片读到BufferedImage  
								BufferedImage bufferImg2 = ImageIO.read(dataInputStream2);  
								// 将图片写入流中  
								ImageIO.write(bufferImg2, "png", byteArrayOut2); 
								// 插入图片
								HSSFClientAnchor anchor2 = new HSSFClientAnchor(90, 20,0, 0,(short) (3), j, (short) (4), j+1);  
								// 插入图片  
								patriarch.createPicture(anchor2, wb.addPicture(byteArrayOut2.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
							} catch (IOException io) {// 报图片文件未找到
								io.printStackTrace();  
					            System.out.println("io erorr : " + io.getMessage()); 
					            newRow_ce3.setCellValue("");
							} 
    	                }
    	                j++;
    				}
                	
    			}
            }
            String fileName = "纪律审查备案表";
            response.setContentType("application/msword;charset=utf-8");
            String title = processFileName(request, fileName);
    		response.setHeader("Content-Disposition","attachment; filename="+title+".xls");
            //生成的excel文件地址
            ServletOutputStream outputStream = response.getOutputStream();
            // 写入excel文件  
            wb.write(outputStream);  
        } catch (IOException io) {  
            io.printStackTrace();  
            System.out.println("io erorr : " + io.getMessage());  
        } finally {  
            if (fileOut != null) {  
                try {  
                    fileOut.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
}
    public static String processFileName(HttpServletRequest request, String fileNames) {
        String codedfilename = null;
        try {
            String agent = request.getHeader("USER-AGENT");
            if (null != agent && -1 != agent.indexOf("MSIE") || null != agent
                    && -1 != agent.indexOf("Trident")) {// ie

                String name = java.net.URLEncoder.encode(fileNames, "UTF8");

                codedfilename = name;
            } else if (null != agent && -1 != agent.indexOf("Mozilla")) {// 火狐,chrome等


                codedfilename = new String(fileNames.getBytes("UTF-8"), "iso-8859-1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return codedfilename;
    }

    // 谈话名单查询里的导出 入口为看护管理 --> 谈话名单查询
    @ResponseBody
    @RequestMapping(value = "noLimit_lienTanhuashenqinginExportAll", method = RequestMethod.POST)
    public void lienTanhuashenqinginExportAll(@RequestBody String kanhuliliang, HttpServletRequest request, HttpServletResponse response) throws Exception {
	// 根据谈话申请kanhuliliang获取所有符合条件的数据
        List<Tanhuashenqing> tanhuashenqings = tanhuashenqingService.findTanHuaShenQingExportAll(kanhuliliang);
        FileOutputStream fileOut = null;
        try {
            HSSFWorkbook wb = new HSSFWorkbook();
            int count = 1;
            for (Tanhuashenqing t : tanhuashenqings) {
                if (t.getLpId() != null) {
                    LienPersonnel lienPersonnel = lienPersonnelService.findById(t.getLpId()).get();
                    t.setDaiHao(lienPersonnel.getDaiHao());
                }
                if (t.getBumen() != null) {
                    Dictionary dictionary = dictionaryService.findById(t.getBumen()).get();
                    t.setBumenString(dictionary.getDicName());
                }

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String tbrq = "";
                if (t.getTianBaoTime() != null) { // 数据处理
                    tbrq = sdf.format(t.getTianBaoTime());
                }
                List<CardInfoDto> cardInfoDtos = new ArrayList<CardInfoDto>();
                if (t.getRenyuan() != null && t.getRenyuan().size() > 0) {
//                    t.getRenyuan().forEach(r -> {
//                        CardInfoDto cardInfoDto= findRenYuanPhotoUrl(r);
//                        if(cardInfoDto!=null){
//                            cardInfoDtos.add(cardInfoDto);
//                        }
//
//                    });
                    for (String r:t.getRenyuan()) {
                        CardInfoDto cardInfoDto= findRenYuanPhotoUrl(r);
                        if(cardInfoDto!=null){
                            cardInfoDtos.add(cardInfoDto);
                        }
                    }
                }
                // 创建一个工作薄
                //创建一个sheet
                HSSFSheet sheet = wb.createSheet("纪律审查备案表" + count+"_代号_"+t.getDaiHao());
                count++;
                /**
                 * 标题的字体
                 */
                HSSFFont font = wb.createFont();
                font.setFontName("方正小标宋简体");
                font.setFontHeightInPoints((short) 20);//设置字体大小
                font.setBold(true);// 字体加粗

                /**
                 * 标题的样式
                 */
                HSSFCellStyle style = wb.createCellStyle();
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setFont(font);
                style.setBorderBottom(BorderStyle.THIN);
                style.setBorderLeft(BorderStyle.THIN);
                style.setBorderRight(BorderStyle.THIN);
                style.setBorderTop(BorderStyle.THIN);
                /**
                 * 正文的列头的标题
                 */
                HSSFFont font1 = wb.createFont();
                font1.setFontName("方正仿宋简体");
                font1.setFontHeightInPoints((short) 16);//设置字体大小
                font1.setBold(true); // 字体加粗
                /**
                 * 正文的列头的样式
                 */
                HSSFCellStyle style1 = wb.createCellStyle();
                style1.setVerticalAlignment(VerticalAlignment.CENTER);
                style1.setAlignment(HorizontalAlignment.CENTER);
                style1.setFont(font1);
                style1.setBorderBottom(BorderStyle.THIN);
                style1.setBorderLeft(BorderStyle.THIN);
                style1.setBorderRight(BorderStyle.THIN);
                style1.setBorderTop(BorderStyle.THIN);
                /**
                 * 正文的文本内容的字体
                 */
                HSSFFont font2 = wb.createFont();
                font2.setFontName("方正仿宋简体");
                font2.setFontHeightInPoints((short) 12);//设置字体大小
                font2.setBold(true); // 字体加粗
                /**
                 * 正文的文本内容的样式
                 */
                HSSFCellStyle style2 = wb.createCellStyle();
                style2.setVerticalAlignment(VerticalAlignment.CENTER);
                style2.setAlignment(HorizontalAlignment.CENTER);
                style2.setWrapText(true);
                style2.setFont(font2);
                style2.setBorderBottom(BorderStyle.THIN);
                style2.setBorderLeft(BorderStyle.THIN);
                style2.setBorderRight(BorderStyle.THIN);
                style2.setBorderTop(BorderStyle.THIN);

                sheet.setColumnWidth(0, 20 * 256); // 设置第1列的宽度
                sheet.setColumnWidth(1, 20 * 256); // 设置第2列的宽度
                sheet.setColumnWidth(2, 20 * 256); // 设置第3列的宽度
                sheet.setColumnWidth(3, 20 * 256); // 设置第4列的宽度
                // 单元格合并      
                // 四个参数分别是：起始行，起始列，结束行，结束列   
                CellRangeAddress cra = new CellRangeAddress(0, 0, 0, 3);
                sheet.addMergedRegion(cra);

                HSSFRow row0 = sheet.createRow(0); // 第0 行
                /**
                 * 第0 行 的 四个列加边框
                 */
                HSSFCell ce0 = row0.createCell((short) 0);
                ce0.setCellStyle(style);
                HSSFCell ce1 = row0.createCell((short) 1);
                ce1.setCellStyle(style);
                HSSFCell ce2 = row0.createCell((short) 2);
                ce2.setCellStyle(style);
                HSSFCell ce3 = row0.createCell((short) 3);
                ce3.setCellStyle(style);
                ce0.setCellValue("纪律审查备案表");
                row0.setHeight((short) (60 * 20)); // 第一行标题的高度

                HSSFRow row1 = sheet.createRow(1); // 第一行
                row1.setHeight((short) (47 * 20)); // 第二行标题的高度
                HSSFCell row1_ce0 = row1.createCell((short) 0);
                row1_ce0.setCellValue("被调查人代号");
                row1_ce0.setCellStyle(style1);
                HSSFCell row1_ce1 = row1.createCell((short) 1);
                row1_ce1.setCellValue("填报部门");
                row1_ce1.setCellStyle(style1);
                HSSFCell row1_ce2 = row1.createCell((short) 2);
                row1_ce2.setCellValue("填报人");
                row1_ce2.setCellStyle(style1);
                HSSFCell row1_ce3 = row1.createCell((short) 3);
                row1_ce3.setCellValue("填报日期");
                row1_ce3.setCellStyle(style1);
                HSSFRow row2 = sheet.createRow(2); // 第二行
                row2.setHeight((short) (42 * 20)); // 高度
                HSSFCell row2_ce0 = row2.createCell((short) 0);
                row2_ce0.setCellValue(t.getDaiHao());
                row2_ce0.setCellStyle(style2);
                HSSFCell row2_ce1 = row2.createCell((short) 1);
                row2_ce1.setCellValue(t.getBumenString());
                row2_ce1.setCellStyle(style2);
                HSSFCell row2_ce2 = row2.createCell((short) 2);
                row2_ce2.setCellValue(t.getTianbaoren());
                row2_ce2.setCellStyle(style2);
                HSSFCell row2_ce3 = row2.createCell((short) 3);
                row2_ce3.setCellValue(tbrq);
                row2_ce3.setCellStyle(style2);

                HSSFRow row3 = sheet.createRow(3); // 第三行
                row3.setHeight((short) (47 * 20)); // 第三行标题的高度
                HSSFCell row3_ce0 = row3.createCell((short) 0);
                row3_ce0.setCellValue("姓名及编号");
                row3_ce0.setCellStyle(style1);
                HSSFCell row3_ce1 = row3.createCell((short) 1);
                row3_ce1.setCellValue("照片");
                row3_ce1.setCellStyle(style1);
                HSSFCell row3_ce2 = row3.createCell((short) 2);
                row3_ce2.setCellValue("姓名及编号");
                row3_ce2.setCellStyle(style1);
                HSSFCell row3_ce3 = row3.createCell((short) 3);
                row3_ce3.setCellValue("照片");
                row3_ce3.setCellStyle(style1);


                // 利用HSSFPatriarch将图片写入EXCEL
                HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
                /**
                 * 该构造函数有8个参数
                 * 前四个参数是控制图片在单元格的位置，分别是图片距离单元格left，top，right，bottom的像素距离
                 * 后四个参数，前连个表示图片左上角所在的cellNum和 rowNum，后天个参数对应的表示图片右下角所在的cellNum和 rowNum，
                 * excel中的cellNum和rowNum的index都是从0开始的
                 */

//        CardInfoDto c1 = new CardInfoDto();
//        c1.setEmployeeName("李明");
//        c1.setEmployeeId("0000");
////        c1.setPhoto("http://img2.3lian.com/2014/f4/140/d/72.jpg");
//                c1.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//
//                CardInfoDto c2 = new CardInfoDto();
//        c2.setEmployeeName("王五1");
//        c2.setEmployeeId("0001");
//        c2.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        CardInfoDto c3 = new CardInfoDto();
//        c3.setEmployeeName("王五2");
//        c3.setEmployeeId("0002");
//        c3.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        CardInfoDto c4 = new CardInfoDto();
//        c4.setEmployeeName("王五3");
//        c4.setEmployeeId("0003");
//        c4.setPhoto("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554884789287&di=9234b129dea02bc187656166f5153de9&imgtype=0&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F171123%2F1-1G123112354.jpg");
//        cardInfoDtos.add(c1);
//        cardInfoDtos.add(c2);
//        cardInfoDtos.add(c3);
//        cardInfoDtos.add(c4);
                int length = cardInfoDtos.size(); // 名单个数
                // 模拟有四个人员数据 需要导出
                if (length > 0) {
                    //排序
                    Collections.sort(cardInfoDtos);
                    for (int i = 1, j = 4; i <= length; i++) {
                        if(cardInfoDtos.get(i-1)==null){
                            continue;
                        }
                        if (i%2 != 0) { // 奇数
                            HSSFRow newRow = sheet.createRow(j);
                            newRow.setHeight((short) (110*20));// 高度
                            HSSFCell newRow_ce0 = newRow.createCell((short)(0));
                            if(cardInfoDtos.get(i-1).getEmployeeName()!=null&&cardInfoDtos.get(i-1).getEmployeeId()!=null){
                                newRow_ce0.setCellValue(new HSSFRichTextString(cardInfoDtos.get(i-1).getEmployeeName() + "\r\n "+ cardInfoDtos.get(i-1).getEmployeeId()));

                            }else {
                                newRow_ce0.setCellValue(new HSSFRichTextString("空" + "\r\n "+"空"));

                            }
                            newRow_ce0.setCellStyle(style2);
                            HSSFCell newRow_ce1 = newRow.createCell((short)(1));
                            newRow_ce1.setCellStyle(style2);
                            try {
                                URL url1 = new URL(menjinBaseUrl + cardInfoDtos.get(i-1).getPhoto());
                                DataInputStream dataInputStream1 = new DataInputStream(url1.openStream());
                                // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
                                ByteArrayOutputStream byteArrayOut1 = new ByteArrayOutputStream();
                                //将图片读到BufferedImage
                                BufferedImage bufferImg1 = ImageIO.read(dataInputStream1);
                                // 将图片写入流中
                                ImageIO.write(bufferImg1, "jpg", byteArrayOut1);

                                // 插入图片
                                HSSFClientAnchor anchor1 = new HSSFClientAnchor(90, 20,0, 0,(short) (1), j, (short) (2), j+1);
                                // 插入图片
                                patriarch.createPicture(anchor1, wb.addPicture(byteArrayOut1.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                            } catch (IOException io) {// 报图片文件未找到
                                io.printStackTrace();
                                System.out.println("io erorr : " + io.getMessage());
                                newRow_ce1.setCellValue("");
                            }
                            if (i+1 <= length) {
                                if(cardInfoDtos.get(i)==null){
                                    continue;
                                }
                                HSSFCell newRow_ce2 = newRow.createCell((short)(2));
                                if(cardInfoDtos.get(i).getEmployeeName()!=null&&cardInfoDtos.get(i).getEmployeeId()!=null){
                                    newRow_ce2.setCellValue(new HSSFRichTextString(cardInfoDtos.get(i).getEmployeeName() + "\r\n "+ cardInfoDtos.get(i).getEmployeeId()));

                                }else {
                                    newRow_ce2.setCellValue(new HSSFRichTextString("空" + "\r\n "+ "空"));

                                }
                                newRow_ce2.setCellStyle(style2);
                                HSSFCell newRow_ce3 = newRow.createCell((short)(3));
                                newRow_ce3.setCellStyle(style2);
                                try {
                                    URL url2 = new URL(menjinBaseUrl + cardInfoDtos.get(i).getPhoto());
                                    DataInputStream dataInputStream2 = new DataInputStream(url2.openStream());
                                    // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
                                    ByteArrayOutputStream byteArrayOut2 = new ByteArrayOutputStream();
                                    //将图片读到BufferedImage
                                    BufferedImage bufferImg2 = ImageIO.read(dataInputStream2);
                                    // 将图片写入流中
                                    ImageIO.write(bufferImg2, "jpg", byteArrayOut2);
                                    // 插入图片
                                    HSSFClientAnchor anchor2 = new HSSFClientAnchor(90, 20,0, 0,(short) (3), j, (short) (4), j+1);
                                    // 插入图片
                                    patriarch.createPicture(anchor2, wb.addPicture(byteArrayOut2.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                                } catch (IOException io) {// 报图片文件未找到
                                    io.printStackTrace();
                                    System.out.println("io erorr : " + io.getMessage());
                                    newRow_ce3.setCellValue("");
                                }
                            }
                            j++;
                        }

                    }
                }
            }
            String fileName = "纪律审查备案表.xls";
            response.setContentType("application/msword;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes(), "iso-8859-1"));
            //生成的excel文件地址
            ServletOutputStream outputStream = response.getOutputStream();
            wb.write(outputStream);
            // 写入excel文件
//            ZipOutputStream zip = new ZipOutputStream(outputStream);
//            ZipEntry entry = new ZipEntry("纪律审查备案表.xls");
//            zip.putNextEntry(entry);
//            wb.write(zip);
//            zip.flush();
//            zip.close();

        } catch (IOException io) {
            io.printStackTrace();
            System.out.println("io erorr : " + io.getMessage());
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //测试  http://localhost:8080/admin/test/test/poizip
    @RequestMapping(value = "/poizip",method = RequestMethod.POST)
    public void poizip(HttpServletResponse response) throws IOException {
        //response 输出流
        ServletOutputStream out = response.getOutputStream();
        //压缩输出流
        ZipOutputStream zipOutputStream = new ZipOutputStream(out);
        try {
            for (int i = 0; i < 6; i++) {
                //创建工作簿
                HSSFWorkbook wb = new HSSFWorkbook();
                HSSFSheet sheet = wb.createSheet("sheet" + i);
                HSSFRow row = sheet.createRow(0);
                HSSFCell cell = row.createCell(0);
                cell.setCellValue("内容" + i);
                response.setContentType("application/octet-stream; charset=utf-8");
                response.setHeader("Content-Disposition", "attachment; filename=" + "测试.zip");
                //重点开始,创建压缩文件
                ZipEntry z = new ZipEntry(i + ".xls");
                zipOutputStream.putNextEntry(z);
                //写入一个压缩文件
                wb.write(zipOutputStream);
            }
            zipOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //注意关闭顺序，否则可能文件错误
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }


    // 审批 谈话申请信息同意 同时需要给门禁系统返回有关参数
	@RequestMapping(value = "saveTanhuashenqingTongyi", method = RequestMethod.POST)
	public Tanhuashenqing saveTanhuashenqingTongyi(HttpServletRequest request,
			@RequestBody Tanhuashenqing tanhuashenqing) throws BusinessException {
		tanhuashenqing.setShenpiStatus("1");
		tanhuashenqingService.save(tanhuashenqing);
		// 根据留置人id获取留置人的进驻时间
		LienPersonnel lienPersonnel = lienPersonnelService.findById(tanhuashenqing.getLpId())
				.orElse(new LienPersonnel());
		// 设置日期输出的格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR, 50);
		String startTime = df.format(new Date()).toString();
		String endTime = df.format(calendar.getTime()).toString();
		String url = menjinBaseUrl + "reformer/interface/registeruserandname";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// 获取房间号名称
//		Optional<Room> room = roomService.findById(lienPersonnel.getRoomNum());
//		for (String renyuanId : tanhuashenqing.getRenyuan()) {
//			Map<String, Object> param = new HashMap<String, Object>();
//			MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
//			// 房门id
////			param.put("doorName", room.get().getTitle());
//			param.put("doorName", lienPersonnel.getRoomNum());
//			// 目前传的是当前时间
//			param.put("startTime", startTime);
//			if (lienPersonnel.getOutTime() != null && lienPersonnel.getOutTime() != "") {
//				// 目前传的是撤离时间
//				try {
//					param.put("endTime", df.format(df1.parse(lienPersonnel.getOutTime())));
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} else {
//				// 目前传的是进驻时间+50年
//				param.put("endTime", endTime);
//			}
//			// 这个字段不知道干什么用的 立方说传0就行
//			param.put("isSpecial", 0);
//			param.put("employeeId", renyuanId);
//			map.add("data", JSONObject.toJSONString(param));
//			HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,headers);
//			ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
//			System.out.println("------  房门号----------------" + lienPersonnel.getRoomNum());
//			System.out.println("------  人员id----------------" + renyuanId);
//			System.out.println("------AAAAAAAAAAAAAAAAA---------------------" + responseEntity);
//			if (responseEntity.getStatusCodeValue() != 200) {
//				throw new BusinessException("立方注册人员（门区）失败！");
//			}
//		}
		for (EntranceGuardStaffDto renyuan : tanhuashenqing.getLifangStaffDto()) {
			Map<String, Object> param = new HashMap<String, Object>();
			MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
			// 房门id
//			param.put("doorName", room.get().getTitle());
			param.put("doorName", roomService.findById(lienPersonnel.getRoomNum()).orElse(new Room()).getTitle());
			// 目前传的是当前时间
			param.put("startTime", startTime);
			if (lienPersonnel.getOutTime() != null && lienPersonnel.getOutTime() != "") {
				// 目前传的是撤离时间
				try {
					param.put("endTime", df.format(df1.parse(lienPersonnel.getOutTime())));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				// 目前传的是进驻时间+50年
				param.put("endTime", endTime);
			}
			// 这个字段不知道干什么用的 立方说传0就行
			param.put("isSpecial", 0);
			param.put("employeeId", renyuan.getSysno());
			map.add("data", JSONObject.toJSONString(param));
			HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,headers);
			ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
			System.out.println("------  房门号----------------" + lienPersonnel.getRoomNum());
			System.out.println("------  人员id----------------" + renyuan.getSysno());
			System.out.println("------AAAAAAAAAAAAAAAAA---------------------" + responseEntity);
			if (responseEntity.getStatusCodeValue() != 200) {
				throw new BusinessException("立方注册人员（门区）失败！");
			}
		}
		return tanhuashenqing;
	}

	// 审批 谈话申请信息拒绝
	@RequestMapping(value = "saveTanhuashenqingJujue", method = RequestMethod.POST)
	public Tanhuashenqing saveTanhuashenqingJujue(HttpServletRequest request,
			@RequestBody Tanhuashenqing tanhuashenqing) {
		tanhuashenqing.setShenpiStatus("2");
		tanhuashenqingService.save(tanhuashenqing);
		return tanhuashenqing;
	}
	public CardInfoDto findRenYuanPhotoUrl (String employeeId) {
		// url
		String url = menjinBaseUrl + "reformer/interface/sendCardInfo";
		// 
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("employeeId",  employeeId);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED); 
		//定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
		//RestTemplate带参传的时候要用HttpEntity<?>对象传递
	    MultiValueMap<String, Object> map= new LinkedMultiValueMap<String, Object>();        
	   map.add("data",JSONObject.toJSONString(param));       
	  HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map, headers);        
	  ResponseEntity<Map> responseEntity=restTemplate.postForEntity(url, request1,Map.class);
	  CardInfoDto cardInfoDto = JSON.parseObject(JSON.toJSONString((responseEntity.getBody().get("obj"))), CardInfoDto.class);
	  return cardInfoDto;
	}
	private static void downloadPicture(String urlList) {
        URL url = null;
        int imageNumber = 0;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            String imageName =  "F:/test.jpg";

            FileOutputStream fileOutputStream = new FileOutputStream(new File(imageName));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            byte[] context=output.toByteArray();
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
