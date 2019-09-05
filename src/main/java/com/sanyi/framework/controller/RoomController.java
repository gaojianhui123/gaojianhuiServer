package com.sanyi.framework.controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.model.LienPersonnel;
import com.sanyi.framework.model.QRoom;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.service.impl.RoomService;

import net.sf.jxls.transformer.XLSTransformer;

import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import com.sanyi.framework.model.Room;
/**
 * 楼层房间
 * @author Gaojianhui
 * 2019年5月30日16:31:05
 */
@RestController
@RequestMapping(value = "/room")
public class RoomController extends BaseController{
	@Autowired
	RoomService roomService;
	@Autowired
	CommonMapper commonMapper;
	// 查询字典列表
	@RequestMapping(value = "findRoom", method = RequestMethod.POST)
	public SanyiPage<Room> findRoom(@RequestBody QueryParam<Room> query) {
		return roomService.selectByJpa(query);
	}
	// 查询字典列表(MyBatis)
	@RequestMapping(value = "findRoomByMybatis", method = RequestMethod.POST)
	public SanyiPage<Room> findRoomByMybatis(@RequestBody QueryParam<Room> query) {
		return roomService.selectByBatis(query);
	}
	// 保存字典
	@RequestMapping(value = "saveRoom", method = RequestMethod.POST)
	public Room saveRoom(@RequestBody Room room) throws BusinessException {
		return roomService.saveRoom(room);
	}
	// 根据id获取字典对象
	@RequestMapping(value = "getRoomById", method = RequestMethod.POST)
	public Room getRoomById(@RequestBody String id) {
		return roomService.findById(id).orElse(new Room());
	}
	// 根据固定的值查询获取房间对象
	@RequestMapping(value = "getRoomByFixationValue", method = RequestMethod.POST)
	public Room getRoomByFixationValue(@RequestBody String fixationValue) {
		return roomService.getRoomByFixationValue(fixationValue);
	}
	// 根据固定的值查询获取房间对象
	@RequestMapping(value = "noLimit_exportRoom/{selectValue}", method = RequestMethod.GET)
	public void exportRoom(@PathVariable("selectValue") String selectValue,HttpServletRequest request, HttpServletResponse response) throws IOException, BusinessException {
		String path = "";
		InputStream realPath = null;
		// 输出路径
		String destFileName = "";
		List<LienPersonnel> lienPersonnels = new ArrayList<LienPersonnel>();
		List<Room> roomList = new ArrayList<Room>();
		Map<String, Object> beans = new HashMap<String, Object>();//模板中的数据
		if (selectValue != null) {
			if ("2".equals(selectValue)) {
				path = "/templates/2楼执勤区域划分及执勤路线.xlsx";
				destFileName = "2楼执勤区域划分及执勤路线.xlsx";
				roomList = (List) roomService.findAll(QRoom.room.floorTier.eq("2"));// 查询2楼所有的房间号
				lienPersonnels = commonMapper.selectLienPersonnelByFloorTier("2");// 查询二楼的的所有的留置列表
				realPath =  new ClassPathResource(path).getInputStream();
				for (int i =0; i< lienPersonnels.size(); i++) {
					LienPersonnel l = lienPersonnels.get(i);
					l.setPaixu(i+1);
					if (l.getLzSex().equals("1")) { // 男
						l.setSex("男");
					}else if(l.getLzSex().equals("2")) {
						l.setSex("女");
					} else {
						l.setSex("未知");
					}
				}
				beans.put("list",lienPersonnels);
				beans.put("L23",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L23")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L24",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L24")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L25",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L25")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L26",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L26")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L27",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L27")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L28",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L28")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L29",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L29")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L30",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L30")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L31",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L31")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L32",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L32")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L33",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L33")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L34",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L34")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L35",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L35")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L36",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L36")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L37",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L37")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L38",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L38")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L39",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L39")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L40",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L40")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L41",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L41")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L42",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L42")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L43",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L43")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L44",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L44")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L45",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L45")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L46",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L46")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L47",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L47")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L48",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L48")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L49",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L49")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L50",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L50")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L51",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L51")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L52",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L52")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L53",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L53")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L54",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L54")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L55",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L55")).collect(Collectors.toList()).get(0).getTitle());
			} else{
				destFileName = "1楼执勤区域划分及执勤路线.xlsx";
				path = "/templates/1楼执勤区域划分及执勤路线.xlsx";// 模板文件所在路径
				roomList = (List) roomService.findAll(QRoom.room.floorTier.eq("1"));// 查询1楼所有的房间号
				lienPersonnels = commonMapper.selectLienPersonnelByFloorTier("1");// 查询一楼的的所有的留置列表
				realPath =  new ClassPathResource(path).getInputStream();
				for (int i =0; i< lienPersonnels.size(); i++) {
					LienPersonnel l = lienPersonnels.get(i);
					l.setPaixu(i+1);
					if (l.getLzSex().equals("1")) { // 男
						l.setSex("男");
					}else if(l.getLzSex().equals("2")) {
						l.setSex("女");
					} else {
						l.setSex("未知");
					}
				}
				beans.put("list",lienPersonnels);
				beans.put("L01",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L01")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L02",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L02")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L03",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L03")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L04",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L04")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L05",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L05")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L06",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L06")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L07",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L07")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L08",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L08")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L09",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L09")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L10",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L10")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L11",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L11")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L12",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L12")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L13",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L13")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L14",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L14")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L15",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L15")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L16",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L16")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L17",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L17")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L18",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L18")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L19",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L19")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L20",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L20")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L21",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L21")).collect(Collectors.toList()).get(0).getTitle());
				beans.put("L22",roomList.stream().filter( (Room room) -> room.getFixationValue().equals("L22")).collect(Collectors.toList()).get(0).getTitle());
			}
		} else {
			throw new BusinessException("请选择你要导出的楼层！");
		}


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
		
}
