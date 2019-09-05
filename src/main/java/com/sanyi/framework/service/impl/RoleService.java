package com.sanyi.framework.service.impl;


import java.util.List;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.dao.RoleRepository;
import com.sanyi.framework.dao.UserRepository;
import com.sanyi.framework.model.QRole;
import com.sanyi.framework.model.QUser;
import com.sanyi.framework.model.Role;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;


@Service
public class RoleService extends BaseService<Role> {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Predicate packagePredicate(QueryParam<Role> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QRole.role.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getTitle())) {
			wherepredicate.and(QRole.role.title.eq(queryDto.getQuery().getTitle()));
		}
		return wherepredicate;
	}
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return null;
		};
	}
	
	
	public Role roleDelete(Role role) {
		Boolean iscontrainArticle = userRepository.exists(QUser.user.roles.contains(role).and(QUser.user.deleted.eq(false)));
		if(iscontrainArticle) {
			role.setErrorMsg("该栏目下存在文章！");
			return role;
		}else {
			role.setDeleted(true);
			return roleRepository.save(role);
		}
		
	}
	
	/**
	 * 通过用户名查询用户
	 */
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepository.findByUsername(username);
//		return user;
//	}
	
//	public User changeEnabled(User user) {
//		User user_ =userRepository.findById(user.getId()).get();
//		user_.setEnabled(user.isEnabled());
//		return userRepository.save(user_);
//	}

//	public User saveUser(User user) throws BusinessException {
//		if(userRepository.exists(QUser.user.username.stringValue().eq(user.getUsername()).and(QUser.user.id.stringValue().notEqualsIgnoreCase(user.getId())))) {
//			throw new BusinessException(user.getUsername()+"用户已经存在，请更换用户名！");
//		};
//		if(user.getId()==null||user.getId().equals("")) { // 这是针对新增用户来说的
//			user.setPassword(user.getUsername());
//		}else {
//			//  这是针对修改用户信息来说的
//			User tempUser = userRepository.findById(user.getId()).get();
//			if(tempUser!=null) {
//				user.setEncoderPassword(tempUser.getPassword());
//			}
//			else {
//				user.setPassword(user.getUsername());
//			}			
//		}
//		return userRepository.save(user);
//	}

//	public SanyiPage<User> selectUserNoNullWxopenid(QueryParam<User> query){
//		if(query.getPaging()) {
//			return new SanyiPage<User>(PageHelper.startPage(query.getPage().getCurrentPage()+1,query.getPage().getSizePerPage()).doSelectPage(()-> userDtoMapper.selectUserNoNullWxopenid(query)),query.getPage());
//		}else {
//			SanyiPage<User> result= new SanyiPage<User>();
//			result.setContent(userDtoMapper.selectUserNoNullWxopenid(query));
//			return result;
//		}
//	}
	
//	public User findUserByWxopenid(String wxopenid) {
//		User user =userRepository.findByWxopenid(wxopenid);
//		return user;
//	}
	
//	@Transactional(rollbackFor= {Exception.class})
//	public User saveUserFromWx(String wxopenid) {
//		User user = new User();
//		user.setUsername(wxopenid);
//		user.setEnabled(true);
//		user.setWxopenid(wxopenid);
//		User newUser=userRepository.save(user);
//		return newUser;
//	}

}
