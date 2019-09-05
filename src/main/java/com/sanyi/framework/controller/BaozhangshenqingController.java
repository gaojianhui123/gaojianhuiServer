package com.sanyi.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;

@RestController
@RequestMapping(value = "/baozhangshenqing")
public class BaozhangshenqingController {
	@Autowired
	BaozhangshenqingService baozhangshenqingService;

	// 查询列表
	@RequestMapping(value = "findBaozhangshenqings", method = RequestMethod.POST)
	public SanyiPage<Baozhangshenqing> findBaozhangshenqings(@RequestBody QueryParam<Baozhangshenqing> query) {
		return baozhangshenqingService.selectByJpa(query);
	}

	// 查询列表(batis)
	@RequestMapping(value = "findBaozhangshenqing", method = RequestMethod.POST)
	public SanyiPage<Baozhangshenqing> findGrid(@RequestBody QueryParam<Baozhangshenqing> query) {
		return baozhangshenqingService.selectByBatis(query);
	}

	// 根据id查体检
	@RequestMapping(value = "findBaozhangshenqingById", method = RequestMethod.POST)
	public Baozhangshenqing findBaozhangshenqingById(HttpServletRequest request, @RequestBody String id) {
		return baozhangshenqingService.findById(id).orElse(new Baozhangshenqing());
	}

	// 新增体检信息
	@RequestMapping(value = "saveBaozhangshenqing", method = RequestMethod.POST)
	public Baozhangshenqing saveBaozhangshenqing(HttpServletRequest request,@RequestBody Baozhangshenqing baozhangshenqing) {
		baozhangshenqingService.save(baozhangshenqing);
//		mqttGateway.sendToMqtt("新到一个保障申请审批","BZSQalert");
		return baozhangshenqing;
	}

	// 逻辑删除
	@RequestMapping(value = "deleteBaozhangshenqing", method = RequestMethod.POST)
	public Baozhangshenqing deleteBaozhangshenqing(HttpServletRequest request,
			@RequestBody Baozhangshenqing baozhangshenqing) {
		// role.setDeleted(true);
		return baozhangshenqingService.logicDelete(baozhangshenqing);
	}

	// 保障审批同意
	@RequestMapping(value = "tongyi", method = RequestMethod.POST)
	public Baozhangshenqing tongyi(HttpServletRequest request, @RequestBody Baozhangshenqing baozhangshenqing) {
		baozhangshenqing.setApplyStatus("2");
		 baozhangshenqingService.save(baozhangshenqing);
//		 mqttGateway.sendToMqtt("新到一个保障信息","BZalert");
		 System.out.println("000000000000000000000000000000000000000000000000000000000");
		 return baozhangshenqing;
	}

	// 保障审批拒绝
	@RequestMapping(value = "jujue", method = RequestMethod.POST)
	public Baozhangshenqing jujue(HttpServletRequest request, @RequestBody Baozhangshenqing baozhangshenqing) {
		baozhangshenqing.setApplyStatus("3");
		return baozhangshenqingService.save(baozhangshenqing);
	}
}
