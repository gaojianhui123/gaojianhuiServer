package com.gaojianhui.framework.model;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.Size;
import java.util.Collection;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户表
 */
@Entity
@Table(name = "t_user",
		indexes = {@Index(columnList = "username"),
				@Index(columnList = "telphone"),
				@Index(columnList = "ukey"),
				@Index(columnList = "userType")})
@Inheritance(strategy=InheritanceType.JOINED)
public class User extends BaseEntity implements UserDetails {

	private static final long serialVersionUID = 5406596740421570032L;

	@Size(max=50,min=2,message="登录名应该是2-50个字符长度")
	@Column(length = 50)
	private String username;
	@Column(length = 1)
	private String sex;//
	@Column(length = 20)
	private String telphone;
	@Column(length = 200)
	private String img;
	@Column(length = 200)
	private String ukey;
	@Size(max=50,message="用户类型不能超过32个字符")
	@Column(length = 50, name = "userType")
	private String userType;
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

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="sycore_user_role",
			joinColumns={@JoinColumn(name="user_id")},
			inverseJoinColumns={@JoinColumn(name="role_id")})
	private Set<Role> roles = new HashSet<Role>();
	/**
	 *机构id
	 */
	@Column(length = 32)
	private String orgId;

	@Column(length=100)
	private String wxopenid;

	@Column(length=200)
	private String address;

	@Transient
	private String orgName;
	// 修改密码
	@Transient
	private String oldpassword;
	@Transient
	private String errorMsg;
	@Transient
	private String updatePassword;
	@Transient
	private String secondPassword;

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
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

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

	public Boolean getEnabled() {
		return enabled;
	}

	
}
