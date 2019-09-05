package com.gaojianhui.framework.controller;

import com.gaojianhui.framework.model.Dictsort;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.page.SanyiPage;
import com.gaojianhui.framework.service.DictsortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.gaojianhui.framework.exception.BusinessException;

/**
 * 字典分类Controller
 * @author gaojianhui
 */
@RestController
@RequestMapping(value = "/dictsort")
public class DictsortController extends BaseController{
	@Autowired
    DictsortService dictsortService;
	
	// 查询字典分类列表
	@RequestMapping(value = "findDictsort", method = RequestMethod.POST)
	public SanyiPage<Dictsort> findDictsort(@RequestBody QueryParam<Dictsort> query) {
		return dictsortService.selectByJpa(query);
	}
	// 保存字典分类
	@RequestMapping(value = "saveDictsort", method = RequestMethod.POST)
	public Dictsort saveDictsort(@RequestBody Dictsort dictsort) throws BusinessException {
		return dictsortService.saveDictsort(dictsort);
	}
	// 根据id获取字典分类对象
	@RequestMapping(value = "getDictsortById", method = RequestMethod.POST)
	public Dictsort getDictsortById(@RequestBody String id) {
		return dictsortService.findById(id).orElse(new Dictsort());
	}
	// 删除字典分类对象
	@RequestMapping(value = "deleteDictsort", method = RequestMethod.POST)
	public Dictsort deleteDictsort(@RequestBody Dictsort dictsort) {
		return dictsortService.logicDelete(dictsort);
	}
		
}
