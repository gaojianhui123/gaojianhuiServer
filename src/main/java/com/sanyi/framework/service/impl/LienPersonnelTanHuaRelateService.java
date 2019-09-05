package com.sanyi.framework.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import com.sanyi.framework.dao.LienPersonnelTanHuaRelateRepository;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;
import com.sanyi.framework.model.Nurse;
import com.sanyi.framework.model.QLienPersonnelTanHuaRelate;
import java.util.function.Function;
import java.util.List;


@Service
public class LienPersonnelTanHuaRelateService extends BaseService<LienPersonnelTanHuaRelate> {
	@Autowired
	private LienPersonnelTanHuaRelateRepository lienPersonnelTanHuaRelateRepository;
	@Override
	public Predicate packagePredicate(QueryParam<LienPersonnelTanHuaRelate> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
//		wherepredicate.and(QLienPersonnelTanHuaRelate..deleted.eq(false));
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectHealthDrugRelate(query);
		};
	}
	// 根据留置人id 获取留置谈话记录列表
	public List<LienPersonnelTanHuaRelate> findByLpIdAndNurseId(Nurse nurse) {
		return lienPersonnelTanHuaRelateRepository.findByLpIdAndNurseId(nurse.getLienPersonnelid(), nurse.getId());
	}
	// 逻辑删除对象  首先查询是否存在此对象
	public LienPersonnelTanHuaRelate deletedLienPersonnelTanHua(LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate) {
		// TODO Auto-generated method stub
		if (lienPersonnelTanHuaRelateRepository.exists(QLienPersonnelTanHuaRelate.lienPersonnelTanHuaRelate.deleted.eq(false)
				.and(QLienPersonnelTanHuaRelate.lienPersonnelTanHuaRelate.id.eq(lienPersonnelTanHuaRelate.getId())))) {
			lienPersonnelTanHuaRelate.setDeleted(true);
			return lienPersonnelTanHuaRelateRepository.save(lienPersonnelTanHuaRelate);
		}
		return null;
	}
	//根据nurseId 查询谈话记录表列表
	public List<LienPersonnelTanHuaRelate> findLPTanHuaRelateByNurseId(String nurseId) {
		return lienPersonnelTanHuaRelateRepository.findLPTanHuaRelateByNurseId(nurseId);
	}
}
