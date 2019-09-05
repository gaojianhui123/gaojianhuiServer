package com.gaojianhui.framework.dao;



import com.gaojianhui.framework.model.BaseEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;


public interface BaseRepository<T extends BaseEntity> extends CrudRepository<T,String>,QuerydslPredicateExecutor<T>{

}
