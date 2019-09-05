package com.sanyi.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sanyi.framework.controller.BaseController;
import com.sanyi.framework.dao.BedRepository;
import com.sanyi.framework.model.Bed;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import com.sanyi.framework.service.impl.BedService;

/**
 * 床
 * 
 * @author Gaojianhui 2019年5月30日16:31:05
 */
@RestController
@RequestMapping(value = "/bed")
public class BedController extends BaseController {
	@Autowired
	BedService bedService;
	@Autowired
	BedRepository bedRepository;
	// 查询字典列表
	@RequestMapping(value = "findBed", method = RequestMethod.POST)
	public SanyiPage<Bed> findBed(@RequestBody QueryParam<Bed> query) {
		return bedService.selectByJpa(query);
	}

	// 查询字典列表(MyBatis)
	@RequestMapping(value = "findBedByMybatis", method = RequestMethod.POST)
	public SanyiPage<Bed> findBedByMybatis(@RequestBody QueryParam<Bed> query) {
		return bedService.selectByBatis(query);
	}

	// 保存床
	@RequestMapping(value = "saveBed", method = RequestMethod.POST)
	public Bed saveBed(@RequestBody Bed bed) {
		return bedRepository.save(bed);
	}
//
	// 根据id获取字典对象
	@RequestMapping(value = "getBedById", method = RequestMethod.POST)
	public Bed getBedById(@RequestBody String id) {
		return bedService.findById(id).orElse(new Bed());
	}

}
