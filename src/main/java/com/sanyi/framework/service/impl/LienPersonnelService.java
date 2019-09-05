package com.sanyi.framework.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dao.LienPersonnelRepository;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.model.QLienPersonnel;
import com.sanyi.framework.model.LienPersonnel;
import org.springframework.stereotype.Service;
import com.sanyi.framework.util.ObjectUtil;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;


@Service
public class LienPersonnelService extends BaseService<LienPersonnel> {
	@Autowired
	private LienPersonnelRepository lienPersonnelRepository;
	@Autowired
	CommonMapper commonMapper;
	@Override
	public Predicate packagePredicate(QueryParam<LienPersonnel> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDaiHao())) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.daiHao.like("%" + queryDto.getQuery().getDaiHao() + "%"));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getCbDepartment())) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.cbDepartment.eq(queryDto.getQuery().getCbDepartment()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getKanhuLiLiang())) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.kanhuLiLiang.eq(queryDto.getQuery().getKanhuLiLiang()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getYihurenyuan())) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.yihurenyuan.eq(queryDto.getQuery().getYihurenyuan()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getOutStatus())) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.outStatus.eq(queryDto.getQuery().getOutStatus()));
		}
		if (queryDto.getQuery().getStart()!= null&&!queryDto.getQuery().getStart().trim().isEmpty() || queryDto.getQuery().getEnd() !=null&&!queryDto.getQuery().getEnd().trim().isEmpty()) {
			wherepredicate.and(QLienPersonnel.lienPersonnel.enterTime.between(queryDto.getQuery().getStart(), queryDto.getQuery().getEnd()));
		}
		wherepredicate.and(QLienPersonnel.lienPersonnel.deleted.eq(false));
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectLienPersonnel(query);
		};
	}
	
	public LienPersonnel saveLienPersonnel(LienPersonnel lienPersonnel)throws Exception{
		if (lienPersonnel.getDaiHao() != null) {
			if (lienPersonnelRepository.exists(QLienPersonnel.lienPersonnel.daiHao.stringValue().eq(lienPersonnel.getDaiHao()).and(QLienPersonnel.lienPersonnel.deleted.eq(false))
					.and(QLienPersonnel.lienPersonnel.id.stringValue().notEqualsIgnoreCase(lienPersonnel.getId())))) {
				throw new BusinessException(lienPersonnel.getDaiHao() + "此代号已存在，不能重复添加！");
			}
		}
		if (lienPersonnelRepository.exists(QLienPersonnel.lienPersonnel.bedNum.eq(lienPersonnel.getBedNum())
				.and(QLienPersonnel.lienPersonnel.deleted.eq(false))
				.and(QLienPersonnel.lienPersonnel.outStatus.eq("0"))
				.and(QLienPersonnel.lienPersonnel.id.stringValue().notEqualsIgnoreCase(lienPersonnel.getId())))) {
			throw new BusinessException("所选床位已分配了留置人，请更换床位！");
		}
		if (lienPersonnel.getOutTime() != null) {
			lienPersonnel.setOutStatus("1");
		} else {
			lienPersonnel.setOutStatus("0");
		}
		return lienPersonnelRepository.save(lienPersonnel);
	}
	/**
	 *  做导出人员数据 
	 * @param status
	 * @return
	 */
	//查询在点 或者 撤离 的留置人员列表 （status 为 0 是在点的  为1  是撤离人员）
	public List<LienPersonnel> selectLienPersonnelStatus(String status) {
		// TODO Auto-generated method stub
		return commonMapper.selectLienPersonnelStatus(status);
	}
	// 查询 全部 的留置人员列表
	public List<LienPersonnel> selectLienPersonnelAll() {
		return commonMapper.selectLienPersonnelAll();
	}
}
