package com.sanyi.framework.aop;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sanyi.framework.model.BaseEntity;



@Component
@Aspect
public class BaseEntityCreatetimeAop {
	@Before("execution(* com.sanyi.framework.dao.*.save*(..)) && args(baseEntity)")
	public void beforeSampleMethod(BaseEntity baseEntity) {
		baseEntity.setCreatetime(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
	}
}
