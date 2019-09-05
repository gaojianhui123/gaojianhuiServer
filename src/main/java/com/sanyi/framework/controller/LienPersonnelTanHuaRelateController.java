package com.sanyi.framework.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sanyi.framework.dao.LienPersonnelTanHuaRelateRepository;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;
import com.sanyi.framework.model.Nurse;
import com.sanyi.framework.service.impl.LienPersonnelTanHuaRelateService;

@RestController
@RequestMapping(value = "/lienPersonnelTanHuaRelate")
public class LienPersonnelTanHuaRelateController {
	@Autowired
	LienPersonnelTanHuaRelateService lienPersonnelTanHuaRelateService;
	@Autowired
	LienPersonnelTanHuaRelateRepository lienPersonnelTanHuaRelateRepository;

	// 根据id查体检
	@RequestMapping(value = "getLienPersonnelTanHuaRelateById", method = RequestMethod.POST)
	public LienPersonnelTanHuaRelate getLienPersonnelTanHuaRelateById(HttpServletRequest request, @RequestBody String id) {
		return lienPersonnelTanHuaRelateService.findById(id).orElse(new LienPersonnelTanHuaRelate());
	}
	//根据nurseId 查询谈话记录表列表
	@RequestMapping(value = "findLPTanHuaRelateByNurseId", method = RequestMethod.POST)
	public List<LienPersonnelTanHuaRelate> findLPTanHuaRelateByNurseId(HttpServletRequest request, @RequestBody String nurseId) {
		return lienPersonnelTanHuaRelateService.findLPTanHuaRelateByNurseId(nurseId);
	}
	// 根据id查体检
	@RequestMapping(value = "getLienPersonnelTanHuaRelateByLpIdAndNurseId", method = RequestMethod.POST)
	public List<LienPersonnelTanHuaRelate> getLienPersonnelTanHuaRelateByLpIdAndNurseId(HttpServletRequest request, @RequestBody Nurse nurse) {
		return lienPersonnelTanHuaRelateService.findByLpIdAndNurseId(nurse);
	}

	// 逻辑删除
	@RequestMapping(value = "deletedLienPersonnelTanHua", method = RequestMethod.POST)
	public LienPersonnelTanHuaRelate deletedLienPersonnelTanHua(HttpServletRequest request, @RequestBody LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate) {
		return lienPersonnelTanHuaRelateService.deletedLienPersonnelTanHua(lienPersonnelTanHuaRelate);
	}
	
	// 保存对象
	@RequestMapping(value = "saveLienPersonnelTanHuaRelate", method = RequestMethod.POST)
	public LienPersonnelTanHuaRelate saveLienPersonnelTanHuaRelate(HttpServletRequest request, @RequestBody LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate) {
		return lienPersonnelTanHuaRelateService.save(lienPersonnelTanHuaRelate);
	}
}
