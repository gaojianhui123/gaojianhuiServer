package com.sanyi.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanyi.framework.dao.LienPersonnelTanHuaRelateRepository;
import com.sanyi.framework.dao.NurseRepository;
import com.sanyi.framework.dto.StatisticTanHuaDto;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.exception.BusinessException;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import com.sanyi.framework.model.QNurse;
import com.sanyi.framework.model.LienPersonnel;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;
import com.sanyi.framework.model.Nurse;
import java.util.function.Function;
import java.util.List;

/**
 * 
 * @author 74308
 *
 */
@Service
public class NurseService extends BaseService<Nurse> {

	@Autowired
	private CommonMapper commonMapper;
	@Autowired
	private NurseRepository nurseRepository;
	@Autowired
	private LienPersonnelTanHuaRelateService lienPersonnelTanHuaRelateService;
	@Autowired
	private LienPersonnelTanHuaRelateRepository lienPersonnelTanHuaRelateRepository;
	@Autowired
	private LienPersonnelService lienPersonnelService;
	@Override
	public Predicate packagePredicate(QueryParam<Nurse> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QNurse.nurse.deleted.eq(false));
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectNurse(query);
		};
	}
	// 导出讯问及安全情况日报
	public List<LienPersonnelTanHuaRelate> selectLienPersonnelTanHuaBySubmitTime(String submitTime) {
		return commonMapper.selectLienPersonnelTanHuaBySubmitTime(submitTime);
	}
	// 导出讯问及安全情况日报（根据lpId去重）
		public List<LienPersonnelTanHuaRelate> selectDistinctLienPersonnelTanHuaBySubmitTime(String submitTime) {
			return commonMapper.selectDistinctLienPersonnelTanHuaBySubmitTime(submitTime);
		}
	// 根据上报时间查询nurse列表
	public List<Nurse> selectNurseBySubmitTime(String submitTime) {
		return commonMapper.selectNurseBySubmitTime(submitTime);
	}
		/**
		 * 根据上报时间查询nurse列表（导出询问时间表）
		 * @param submitTime
		 * @return
		 */
	public List<Nurse> selectNurseBySubmitTime1(String submitTime) {
		return commonMapper.selectNurseBySubmitTime1(submitTime);
	}
	
	// 保存 看护
	public Nurse saveNurse(Nurse nurse) throws BusinessException {
		 // 如果保存的这条 的 上报时间和留置人在数据库已经存在 是不允许再次保存的 提示"这个留置人的这一个时间已经存在不能重复添加！"
		if(nurseRepository.exists(QNurse.nurse.deleted.eq(false).and(QNurse.nurse.id.notEqualsIgnoreCase(nurse.getId()))
				.and(QNurse.nurse.lienPersonnelid.eq(nurse.getLienPersonnelid())).and(QNurse.nurse.submitTime.eq(nurse.getSubmitTime())))) {
			LienPersonnel l = lienPersonnelService.findById(nurse.getLienPersonnelid()).orElse(new LienPersonnel());
			throw new BusinessException("代号  "+l.getDaiHao()+"  在   "+nurse.getSubmitTime()+" 已经存在情况信息，不能重复添加！");
		}
		Nurse n = nurseRepository.save(nurse);
		for (int i = 0; i < nurse.getLienPersonnelTanHuaRelates().size(); i++){
			LienPersonnelTanHuaRelate relate= nurse.getLienPersonnelTanHuaRelates().get(i);
			relate.setNurseId(n.getId());
			lienPersonnelTanHuaRelateRepository.save(relate);
		}
		return n;
	}
	/**
	 * 留置人员谈话情况统计
	 * @param statisticTanHuaDto
	 * @return
	 */
	public List<StatisticTanHuaDto> statisticTanHua(StatisticTanHuaDto statisticTanHuaDto) {
		return commonMapper.selectStatisticTanHua(statisticTanHuaDto);
	}

	// 根据谈话申请id查nurse对象
	public Nurse findNurseByTanHuaShenQingId(String tanHuaShenQingId, String dateString) {
		return nurseRepository.findNurseByTanHuaShenQingId(tanHuaShenQingId, dateString);
	}
	// 根据留置人id 和 上报时间查找出来对应的那一条谈话记录对象nurse
	public Nurse getNurseByLpIdAndTime(String lienPersonnelid, String submitTime) {
		return nurseRepository.getNurseByLpIdAndTime(lienPersonnelid, submitTime);
	}
	

	
}
