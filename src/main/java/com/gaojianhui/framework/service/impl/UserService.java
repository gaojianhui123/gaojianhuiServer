package com.gaojianhui.framework.service.impl;


import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import com.gaojianhui.framework.exception.BusinessException;
import org.springframework.stereotype.Service;
import com.gaojianhui.framework.dao.UserRepository;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.util.ObjectUtil;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import com.gaojianhui.framework.model.QUser;
import com.gaojianhui.framework.model.User;
import java.util.function.Function;
import java.util.Optional;
import java.util.List;

@Service
public class UserService extends BaseService<User> implements UserDetailsService {
	static String defaultPassword = "111111";
	@Autowired
	private UserRepository userRepository;

	@Override
	public Predicate packagePredicate(QueryParam<User> queryDto) {
		User userQuery = Optional.ofNullable(queryDto.getQuery()).orElse(new User());
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QUser.user.deleted.eq(false));
		// wherepredicate.and(QUser.user.isadmin.eq(userQuery.getIsadmin()));
		if (!ObjectUtil.isEmpty(userQuery.getUsername())) {
			wherepredicate.and(QUser.user.username.eq(userQuery.getUsername()));
		}
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return null;
		};
	}

	// public SanyiPage<UserDTO> selectUserDTOByQueryPage(QueryParam<UserDTO>
	// query){
	// if(query.getPaging()) {
	// return new
	// SanyiPage<UserDTO>(PageHelper.startPage(query.getPage().getCurrentPage()+1,query.getPage().getSizePerPage()).doSelectPage(()->
	// userDtoMapper.selectUserDTOByQuery(query.getQuery())),query.getPage());
	// }else {
	// SanyiPage<UserDTO> result= new SanyiPage<UserDTO>();
	// result.setContent(userDtoMapper.selectUserDTOByQuery(query.getQuery()));
	// return result;
	// }
	// }
	/**
	 * 通过用户名查询用户
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		return user;
	}

	public User changeEnabled(User user) {
		User user_ = userRepository.findById(user.getId()).get();
		user_.setEnabled(user.isEnabled());
		return userRepository.save(user_);
	}

	public User saveUser(User user) throws BusinessException {
		if (userRepository.exists(QUser.user.username.stringValue().eq(user.getUsername())
				.and(QUser.user.id.stringValue().notEqualsIgnoreCase(user.getId())))) {
			throw new BusinessException(user.getUsername() + "用户已经存在，请更换用户名！");
		}
		;
		if (user.getId() == null || user.getId().equals("")) { // 这是针对新增用户来说的
			user.setPassword(defaultPassword);
		} else {
			// 这是针对修改用户信息来说的
			User tempUser = userRepository.findById(user.getId()).get();
			if (tempUser != null) {
				user.setEncoderPassword(tempUser.getPassword());
			} else {
				user.setPassword(defaultPassword);
			}
		}
		return userRepository.save(user);
	}

	// 修改密码
	public User updatePassword(User user) {
		// 这是针对修改用户信息来说的
		User currentUser = userRepository.findById(user.getId()).get();
		if (currentUser != null) {
			currentUser.setPassword("");
		}
		return userRepository.save(currentUser);
	}

	// 重置密码 重置为 111111
	public User resetPassword(User user) {
		User currentUser = userRepository.findById(user.getId()).get();
		if (currentUser != null) {
			currentUser.setPassword(defaultPassword);
		}
		return userRepository.save(currentUser);
	}

}
