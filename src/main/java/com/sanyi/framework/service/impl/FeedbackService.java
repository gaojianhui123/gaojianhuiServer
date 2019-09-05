package com.sanyi.framework.service.impl;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.dao.FeedbackRepository;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.model.Feedback;
import com.sanyi.framework.model.QFeedback;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;
/**
 * FeedbackService(问题反馈)
 * @author 唐翔
 *
 */
@Service
public class FeedbackService extends BaseService<Feedback> {
	@Autowired
	FeedbackRepository feedbackRepository;
	@Autowired
	CommonMapper commonMapper;
	@Override
	public Predicate packagePredicate(QueryParam<Feedback> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QFeedback.feedback.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDepartment())) {
			wherepredicate.and(QFeedback.feedback.department.eq(queryDto.getQuery().getTitle() ));
		}
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectFeedback(query);
		};
	}
	

}
