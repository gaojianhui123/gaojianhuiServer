package com.sanyi.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.service.impl.HandlingPersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import com.sanyi.framework.dto.EntranceGuardStaffDto;
import com.sanyi.framework.exception.BusinessException;
import org.springframework.util.LinkedMultiValueMap;
import com.sanyi.framework.dto.CardInfoDto;
import com.sanyi.framework.dto.EntranceGuardDoorDto;
import org.springframework.web.client.RestTemplate;
import com.sanyi.framework.model.HandlingPerson;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import com.sanyi.framework.page.QueryParam;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import com.sanyi.framework.page.SanyiPage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 办案人员管理Controller
 */
@RestController
@RequestMapping(value = "/handlingPerson")
public class HandlingPersonController {
	@Autowired
	HandlingPersonService handlingPersonService;
	@Autowired
	RestTemplate restTemplate;
	@Value("${menjinBaseUrl}")
	private String menjinBaseUrl;

	// 查询列表 获取门禁系统的房门列表
	@RequestMapping(value = "findMenjinDoors", method = RequestMethod.POST)
	public List<EntranceGuardDoorDto> findMenjinDoors(@RequestBody EntranceGuardDoorDto query) {
		// url
		String url = menjinBaseUrl + "reformer/interface/getDoorInfoAll";
		//
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("curPage", 1);
		param.put("pageSize", 200);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// 定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
		// RestTemplate带参传的时候要用HttpEntity<?>对象传递
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("data", JSONObject.toJSONString(param));
		HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,
				headers);
		ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
		List<EntranceGuardDoorDto> entranceGuardDoorDtos = (List<EntranceGuardDoorDto>) ((Map) responseEntity.getBody()
				.get("obj")).get("list");
		return entranceGuardDoorDtos;
	}

	// 根据卡号查找人员信息
	@RequestMapping(value = "getemplybyserial", method = RequestMethod.POST)
	public CardInfoDto getemplybyserial(@RequestBody EntranceGuardStaffDto query) {
		// url
		String url = menjinBaseUrl + "reformer/interface/hr/getemplybyserial";
		// 参数
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("serial", query.getSerial());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// 定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
		// RestTemplate带参传的时候要用HttpEntity<?>对象传递
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("data", JSONObject.toJSONString(param));
		HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,
				headers);
		ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
		CardInfoDto cardInfoDto = JSON.parseObject(JSON.toJSONString((responseEntity.getBody().get("obj"))),
				CardInfoDto.class);
		return cardInfoDto;
	}

	// 查询列表 获取门禁系统的人员列表
	@RequestMapping(value = "findMenjinStaffs", method = RequestMethod.POST)
	public List<EntranceGuardStaffDto> findMenjinStaffs(@RequestBody EntranceGuardStaffDto query) throws BusinessException {
		ResponseEntity<Map> responseEntity = restTemplate
				.postForEntity(menjinBaseUrl + "reformer/interface/getAllEmplyList", null, Map.class);
		if (responseEntity.getStatusCodeValue() != 200) {
			throw new BusinessException("获取立方系统人员列表失败！");
		}
		return (List<EntranceGuardStaffDto>) responseEntity.getBody().get("obj");
	}

	// 查询列表
	@RequestMapping(value = "findHandlingPerson", method = RequestMethod.POST)
	public SanyiPage<HandlingPerson> findHandlingPerson(@RequestBody QueryParam<HandlingPerson> query) {
		return handlingPersonService.selectByJpa(query);
	}

	// 根据id查
	@RequestMapping(value = "findHandlingPersonById", method = RequestMethod.POST)
	public Optional<HandlingPerson> findHandlingPersonById(HttpServletRequest request, @RequestBody String id) {
		return handlingPersonService.findById(id);
		// return handlingPersonService.findById(handlingPersonService.getId());
	}

	// 新增
	@RequestMapping(value = "saveHandlingPerson", method = RequestMethod.POST)
	public HandlingPerson saveHandlingPerson(HttpServletRequest request, @RequestBody HandlingPerson handlingPerson)
			throws Exception {
		return handlingPersonService.saveHandlingPerson(handlingPerson);
	}

	// 逻辑删除
	@RequestMapping(value = "deleteHandlingPerson", method = RequestMethod.POST)
	public HandlingPerson deleteHandlingPerson(HttpServletRequest request, @RequestBody HandlingPerson handlingPerson) {
		handlingPerson.setDeleted(true);
		return handlingPersonService.logicDelete(handlingPerson);
	}

	// 根据多个id返回多条记录
	@RequestMapping(value = "findHandlingPersonByIds", method = RequestMethod.POST)
	public Iterable<HandlingPerson> findHandlingPersonByIds(HttpServletRequest request, @RequestBody List<String> ids) {
		Iterable<HandlingPerson> handlingPersons = handlingPersonService.findAllByIds(ids);
		return handlingPersons;
	}

	// 查询列表 获取门禁系统的查询一卡通开卡信息
	@RequestMapping(value = "findCardInfoDtos", method = RequestMethod.POST)
	public CardInfoDto findCardInfoDtos(@RequestBody CardInfoDto query) {
		// url
		String url = menjinBaseUrl + "reformer/interface/sendCardInfo";
		//
		Map<String, Object> param = new HashMap<String, Object>();

		param.put("employeeId", query.getEmployeeId());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// 定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
		// RestTemplate带参传的时候要用HttpEntity<?>对象传递
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("data", JSONObject.toJSONString(param));
		HttpEntity<MultiValueMap<String, Object>> request1 = new HttpEntity<MultiValueMap<String, Object>>(map,
				headers);
		ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url, request1, Map.class);
		CardInfoDto cardInfoDto = JSON.parseObject(JSON.toJSONString((responseEntity.getBody().get("obj"))),
				CardInfoDto.class);

		return cardInfoDto;

	}

}
