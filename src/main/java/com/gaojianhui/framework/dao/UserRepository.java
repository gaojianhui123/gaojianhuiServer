package com.gaojianhui.framework.dao;

import java.util.List;

import com.gaojianhui.framework.model.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends BaseRepository<User>{
	@Query(value="SELECT * FROM t_user  WHERE username=( ?1 ) ",nativeQuery=true)
	List<User> findUserByUsername(String username);
	
	User findByUsername(String username);
	User findByWxopenid(String wxopenid);
}
