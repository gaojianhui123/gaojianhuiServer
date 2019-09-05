package com.gaojianhui.framework.aop;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.gaojianhui.framework.model.BaseEntity;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class BaseEntityCreatetimeAop {
	@Before("execution(* com.sanyi.framework.dao.*.save*(..)) && args(baseEntity)")
	public void beforeSampleMethod(BaseEntity baseEntity) {
		baseEntity.setCreatetime(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
	}
}
