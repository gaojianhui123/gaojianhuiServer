package com.sanyi.framework.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;


@MappedSuperclass
public abstract class BaseTreeEntity extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1173910920871203086L;
	@Column(length=32)
	private String pid;
	@Column()
	private Integer sortindex;
	@Transient
	private List<BaseTreeEntity> children;
	@Transient
	private String key;
	
	@Transient
	private boolean disabled=false;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getSortindex() {
		return sortindex;
	}
	public void setSortindex(Integer sortindex) {
		this.sortindex = sortindex;
	}
	public List getChildren() {
		return children;
	}
	public void setChildren(List children) {
		this.children = children;
	}
	public String getKey() {
		return getId();
	}

	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	
	

}
