package com.sanyi.framework.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanyi.framework.model.Health;
import com.sanyi.framework.model.HealthDrugRelate;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import com.sanyi.framework.service.impl.HealthDrugRelateService;

@RestController
@RequestMapping(value = "/healthDrugRelate")
public class HealthDrugRelateController {
	@Autowired
	HealthDrugRelateService healthDrugRelateService;

	// 查询列表
	@RequestMapping(value = "findHealthDrugRelates", method = RequestMethod.POST)
	public SanyiPage<HealthDrugRelate> findHealthDrugRelates(@RequestBody QueryParam<HealthDrugRelate> query) {
		return healthDrugRelateService.selectByJpa(query);
	}
	// 查询列表(batis)
	@RequestMapping(value = "findHealthDrugRelate", method = RequestMethod.POST)
	public SanyiPage<Health> findGrid(@RequestBody QueryParam<HealthDrugRelate> query) {
		System.out.println("222222222");
		return healthDrugRelateService.selectByBatis(query);
	}
	// 根据id查体检
	@RequestMapping(value = "getHealthDrugRelateById", method = RequestMethod.POST)
	public HealthDrugRelate findHealthById(HttpServletRequest request, @RequestBody String id) {
		return healthDrugRelateService.findById(id).orElse(new HealthDrugRelate());
	}

	// 新增体检信息
	@RequestMapping(value = "saveHealthDrugRelate", method = RequestMethod.POST)
	public HealthDrugRelate saveHealthDrugRelate(HttpServletRequest request, @RequestBody HealthDrugRelate healthDrugRelate) {
		return healthDrugRelateService.save(healthDrugRelate);
	}

	// 逻辑删除
	@RequestMapping(value = "deleteHealthDrugRelate", method = RequestMethod.POST)
	public HealthDrugRelate deleteHealthDrugRelate(HttpServletRequest request, @RequestBody HealthDrugRelate healthDrugRelate) {
		// role.setDeleted(true);
		return healthDrugRelateService.logicDelete(healthDrugRelate);
	}
}
