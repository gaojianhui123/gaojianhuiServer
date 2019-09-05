package com.sanyi.framework.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import javax.persistence.Transient;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "t_user")
public class User extends BaseEntity implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5406596740421570032L;

	@Column(length = 50)
	private String username;
	@Column(length = 20)
	private String telphone;
	@Column(length = 200)
	private String img;
	/**
	 * 密码
	 */
	@JsonIgnore
	@Column(length = 100)
	private String password;
	@Column()
	private Boolean isadmin=false;
	/**
	 * 是否可用
	 */
	@Column()
	private Boolean enabled;
	@Column()
	private Boolean buildinadmin=false;
	/**
	 * 党组织审核通过
	 */
	@Column()
	private Boolean dangzuzhipassed=false;

	/**
	 * 楼号
	 */
	@Column(length=100)
	private String build;
	/**
	 * 门牌号
	 */
	@Column(length=100)
	private String door;

	@ManyToMany(fetch=FetchType.EAGER)
	private Set<Role> roles = new HashSet<Role>();
	/**
	 *部门id
	 */
	@Column(length = 36)
	private String bumenId;
	// 部门名称
	@Transient
	private String bumenName;
	
	@Column(length=100)
	private String wxopenid;
	
	@Column(length=200)
	private String address;
	
	/*
	 * 看护力量id
	 */
	@Column(length = 36)
	private String kanhuId;
	/*
	 * 医护人员id
	 */
	@Column(length = 36)
	private String yihurenyuan;
	
	// 修改密码
	@Transient
	private String oldpassword;
	@Transient
	private String errorMsg;
	@Transient
	private String updatePassword;
	@Transient
	private String secondPassword;
	
	
	
	public String getYihurenyuan() {
		return yihurenyuan;
	}


	public void setYihurenyuan(String yihurenyuan) {
		this.yihurenyuan = yihurenyuan;
	}


	public String getKanhuId() {
		return kanhuId;
	}


	public void setKanhuId(String kanhuId) {
		this.kanhuId = kanhuId;
	}


	public String getSecondPassword() {
		return secondPassword;
	}


	public void setSecondPassword(String secondPassword) {
		this.secondPassword = secondPassword;
	}


	public String getOldpassword() {
		return oldpassword;
	}


	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	public String getUpdatePassword() {
		return updatePassword;
	}


	public void setUpdatePassword(String updatePassword) {
		this.updatePassword = updatePassword;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEncoderPassword(String encoderPassword) {
		this.password = encoderPassword;
	}
	public void setPassword(String password) {
		this.password = new BCryptPasswordEncoder().encode(password);
		// this.password=password;
	}
	@Override
	@JsonIgnore
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		this.getRoles().forEach(role ->{
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+role.getTitle());
			authorities.add(authority);
		});
		return authorities;
	}
	@Override
	@JsonIgnore
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	@JsonIgnore
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	@JsonIgnore
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}



//	public Boolean getEnabled() {
//		return enabled;
//	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}


	public Boolean getDangzuzhipassed() {
		return dangzuzhipassed;
	}

	public void setDangzuzhipassed(Boolean dangzuzhipassed) {
		this.dangzuzhipassed = dangzuzhipassed;
	}


	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getWxopenid() {
		return wxopenid;
	}

	public void setWxopenid(String wxopenid) {
		this.wxopenid = wxopenid;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

//	public String getProviceid() {
//		return proviceid;
//	}
//
//	public void setProviceid(String proviceid) {
//		this.proviceid = proviceid;
//	}
//
//	public String getCityid() {
//		return cityid;
//	}
//
//	public void setCityid(String cityid) {
//		this.cityid = cityid;
//	}
//
//	public String getDistrictid() {
//		return districtid;
//	}
//
//	public void setDistrictid(String districtid) {
//		this.districtid = districtid;
//	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getBuildinadmin() {
		return buildinadmin;
	}

	public void setBuildinadmin(Boolean buildinadmin) {
		this.buildinadmin = buildinadmin;
	}

	public Boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	public String getBumenId() {
		return bumenId;
	}

	public void setBumenId(String bumenId) {
		this.bumenId = bumenId;
	}

	public String getBumenName() {
		return bumenName;
	}

	public void setBumenName(String bumenName) {
		this.bumenName = bumenName;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	
}
