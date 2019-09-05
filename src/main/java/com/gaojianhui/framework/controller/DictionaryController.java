package com.gaojianhui.framework.controller;

import com.gaojianhui.framework.model.Dictionary;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.page.SanyiPage;
import com.gaojianhui.framework.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.gaojianhui.framework.exception.BusinessException;

/**
 * 字典Controller
 * @author Gaojianhui
 */
@RestController
@RequestMapping(value = "/dictionary")
public class DictionaryController extends BaseController{
	@Autowired
    DictionaryService dictionaryService;
	
	// 查询字典列表
	@RequestMapping(value = "findDictionary", method = RequestMethod.POST)
	public SanyiPage<Dictionary> findDictionary(@RequestBody QueryParam<Dictionary> query) {
		return dictionaryService.selectByJpa(query);
	}
	// 查询字典列表(batis)
	@RequestMapping(value = "findDictionarys", method = RequestMethod.POST)
	public SanyiPage<Dictionary> findGrid(@RequestBody QueryParam<Dictionary> query) {
		System.out.println("sssssssssssss");
		SanyiPage<Dictionary> a = dictionaryService.selectByBatis(query);
		return a;
	}
	// 保存字典
	@RequestMapping(value = "saveDictionary", method = RequestMethod.POST)
	public Dictionary saveDictionary(@RequestBody Dictionary dictionary) throws BusinessException {
		return dictionaryService.saveDictionary(dictionary);
	}
	// 根据id获取字典对象
	@RequestMapping(value = "getDictionaryById", method = RequestMethod.POST)
	public Dictionary getDictionaryById(@RequestBody String id) {
		return dictionaryService.findById(id).orElse(new Dictionary());
	}
	// 删除字典对象
	@RequestMapping(value = "deleteDictionary", method = RequestMethod.POST)
	public Dictionary deleteDictionary(@RequestBody Dictionary dictionary) {
		return dictionaryService.logicDelete(dictionary);
	}
		
}
