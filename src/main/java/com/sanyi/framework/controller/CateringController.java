package com.sanyi.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.sanyi.framework.service.impl.CateringService;
import javax.servlet.http.HttpServletRequest;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.model.Catering;
import com.sanyi.framework.page.SanyiPage;
import java.util.Optional;
/**
 * 
 * @author 74308
 *
 */
@RestController
@RequestMapping(value = "/catering")
public class CateringController {
	@Autowired
	CateringService cateringService;
	
	/**
	 * 查询列表
	 * @param query
	 * @return
	 */
	@RequestMapping(value = "findCatering", method = RequestMethod.POST)
	public SanyiPage<Catering> findCatering(@RequestBody QueryParam<Catering> query) {
		return cateringService.selectByJpa(query);
	}
	
	/**
	 * 根据id查
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "findCateringById", method = RequestMethod.POST)
	public Optional<Catering> findCateringById(HttpServletRequest request, @RequestBody String id) {
		return cateringService.findById(id);
	}
	
	
	/**
	 *  新增
	 * @param request
	 * @param catering
	 * @return
	 */
	@RequestMapping(value = "saveCatering", method = RequestMethod.POST)
	public Catering saveCatering(HttpServletRequest request, @RequestBody Catering catering){
		return cateringService.save(catering);
	}
	
	/**
	 *  逻辑删除
	 * @param request
	 * @param catering
	 * @return
	 */
	@RequestMapping(value = "deleteCatering", method = RequestMethod.POST)
	public Catering deleteCatering(HttpServletRequest request, @RequestBody Catering catering)  {
		return cateringService.logicDelete(catering);
	}
}
