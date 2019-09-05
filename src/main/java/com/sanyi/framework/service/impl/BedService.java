package com.sanyi.framework.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dao.BedRepository;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.model.Bed;
import com.sanyi.framework.model.QBed;
import com.sanyi.framework.service.impl.BaseService;
import com.sanyi.framework.util.ObjectUtil;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;


@Service
public class BedService extends BaseService<Bed>{
	@Autowired
	BedRepository bedRepository;
	@Autowired
	private CommonMapper commonMapper;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Bed> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QBed.bed.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getRoomId())) {
			wherepredicate.and(QBed.bed.roomId.eq(queryDto.getQuery().getRoomId()));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectBed(query);
		};
	}


}
