package com.gaojianhui.framework.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "t_role")
public class Role extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2521986567514905795L;
	
	@Column(length = 50)
	private String rolename;
	
	@Column(length = 50)
	private String roletype;       //  类型                    下拉  0 ： 平台用户   1：租户用户
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="t_role_protected_resources",  
	   joinColumns={@JoinColumn(name="role_id")},  
	   inverseJoinColumns={@JoinColumn(name="protected_resources_id")}) 
	private Set<ProtectedResource> protectedResources = new HashSet<ProtectedResource>();   // 权限
	
	
	@Transient
	private String errorMsg;
	
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Set<ProtectedResource> getProtectedResources() {
		return protectedResources;
	}
	public void setProtectedResources(Set<ProtectedResource> protectedResources) {
		this.protectedResources = protectedResources;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	

}
