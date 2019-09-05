package com.sanyi.framework.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.sanyi.framework.model.User;

public interface UserRepository extends BaseRepository<User>{
	@Query(value="SELECT * FROM t_user  WHERE username=( ?1 ) ",nativeQuery=true)
	List<User> findUserByUsername(String username);
	
	User findByUsername(String username);
	User findByWxopenid(String wxopenid);
}
