package com.sanyi.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dao.HealthRepository;
import com.sanyi.framework.dao.LienPersonnelRepository;
import com.sanyi.framework.exception.BusinessException;

import org.springframework.stereotype.Service;
import com.sanyi.framework.util.ObjectUtil;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.model.QHealth;
import com.sanyi.framework.model.QLienPersonnel;
import com.querydsl.core.BooleanBuilder;
import com.sanyi.framework.model.Health;
import com.sanyi.framework.model.LienPersonnel;

import java.util.function.Function;
import java.util.List;

@Service
public class HealthService extends BaseService<Health> {
	@Autowired
	private HealthRepository healthRepository;
	@Autowired
	private LienPersonnelRepository lienPersonnelRepository;
	@Override
	public Predicate packagePredicate(QueryParam<Health> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QHealth.health.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getLpId())) {
			wherepredicate.and(QHealth.health.lpId.eq(queryDto.getQuery().getLpId()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getStatus())) {
			wherepredicate.and(QHealth.health.status.eq(queryDto.getQuery().getStatus()));
		}
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectHealth(query);
		};
	}
	
	public List<Health> selectHealthStatus(String lpId){
		return commonMapper.selectHealthStatus(lpId);
	}
	// 长期用药
//	public List<Health> selectHealthYongYaoStatus(String lpId){
//		return commonMapper.selectHealthYongYaoStatus(lpId);
//	}
	// 临时用药
	public List<Health> selectHealthYongYaoStatuls(String lpId){
		return commonMapper.selectHealthYongYaoStatuls(lpId);
	}
	public List<Health> selectHealthSpecialCaseByLpIdAndTime(String lpId, String time){
		return commonMapper.selectHealthSpecialCaseByLpIdAndTime(lpId, time);
		
	}
	// 进驻体检 保存体检
	public Health saveHealth(Health health) throws BusinessException {
		if (healthRepository.exists(QHealth.health.lpId.stringValue().eq(health.getLpId()).and(QHealth.health.deleted.eq(false))
				.and(QHealth.health.id.stringValue().notEqualsIgnoreCase(health.getId()))
					.and(QHealth.health.status.eq("1")))) {
			LienPersonnel lien= lienPersonnelRepository.findById(health.getLpId()).get();
			throw new BusinessException(lien.getDaiHao() + "此代号已添加进驻体检，不能重复添加！");
		}
		return healthRepository.save(health);
	}
}
