package com.sanyi.framework.model;

import com.sanyi.framework.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 字典分类
 * 
 * @author gaojianhui
 *
 */
@Entity
@Table(name = "t_dictsort")
public class Dictsort extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7676215420395708521L;

	// 图标字典分类名称
	@Column(length = 36, name = "dictsortName")
	private String dictsortName;
	// 图标是否自用
	@Column(name = "isOwner")
	private Integer isOwner;

	public String getDictsortName() {
		return dictsortName;
	}

	public void setDictsortName(String dictsortName) {
		this.dictsortName = dictsortName;
	}

	public Integer getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Integer isOwner) {
		this.isOwner = isOwner;
	}




}
