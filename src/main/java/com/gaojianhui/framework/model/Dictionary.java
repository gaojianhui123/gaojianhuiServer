package com.gaojianhui.framework.model;

import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 字典
 * 
 * @author gaojianhui
 *
 */
@Entity
@Table(name = "t_dictionary")
public class Dictionary extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7676215420395708521L;

	// 字典分类id
	@Column(length = 36, name = "dsId")
	private String dsId;
	// 排序
	@Column(name = "dicIndex")
	private Integer dicIndex;
	// 字典名称
	@Column(length = 100, name = "dicName")
	private String dicName;
	// 拼音码
	@Column(length = 100, name = "dicPyCode")
	private String dicPyCode;
	// 备注
	@Column(length = 200, name = "dicMemo")
	private String dicMemo;
	// 是否自用
	@Column(name = "isOwner")
	private Integer isOwner;
	// 分类名称
	@Transient
	private String sortName;
	


	

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getDsId() {
		return dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
	}

	public Integer getDicIndex() {
		return dicIndex;
	}

	public void setDicIndex(Integer dicIndex) {
		this.dicIndex = dicIndex;
	}

	public String getDicName() {
		return dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public String getDicPyCode() {
		return dicPyCode;
	}

	public void setDicPyCode(String dicPyCode) {
		this.dicPyCode = dicPyCode;
	}

	public String getDicMemo() {
		return dicMemo;
	}

	public void setDicMemo(String dicMemo) {
		this.dicMemo = dicMemo;
	}

	public Integer getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Integer isOwner) {
		this.isOwner = isOwner;
	}

}
