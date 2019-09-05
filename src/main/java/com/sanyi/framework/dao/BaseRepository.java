package com.sanyi.framework.dao;



import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import com.sanyi.framework.model.BaseEntity;



public interface BaseRepository<T extends BaseEntity> extends CrudRepository<T,String>,QuerydslPredicateExecutor<T>{

}
