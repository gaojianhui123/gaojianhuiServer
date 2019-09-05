package com.sanyi.framework.model;

import com.sanyi.framework.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.sql.Date;

/**
 * 保障申请
 * @author gaojianhui
 */
@Entity
@Table(name = "t_baozhangshenqing")
public class Baozhangshenqing extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -377910454276197566L;
	
	// 留置人id
	@Column(length = 36, name = "lpId")
	private String lpId;
	// 填报部门
	@Column(length = 50, name = "bumen")
	private String bumen;
	// 案件承办部门
	@Column(length = 50,name = "chengbanbumen")
	private String chengbanbumen;
	//填报时间
	@Column(length = 20 ,name = "tianBaoTime")
	private String  tianBaoTime;					
	// 申请事项及具体需求
	@Column(length = 100,name = "matter")
	private String matter;
	// 呈批情况
	@Column(length = 100,name = "apply")
	private String apply;
	// 呈批申请的状态（1：未审批 2：已审批 3:审批拒绝）
	@Column(length = 2,name = "applyStatus")
	private String applyStatus="1";
	// 备注
	@Column(length = 100,name = "remark")
	private String remark;
	// 代号
	@Transient
	private String daihao;
	// 留置人姓名
	@Transient
	private String lpName;
	// 留置人性别
	@Transient
	private String lzSex;
	// 留置人年龄
	@Transient
	private Integer lzAge;
	// 留置人职级
	@Transient
	private String lpZhiji;
	// 进驻时间
	@Transient
	private String lpTime;
	/*
	 * 部门分类id
	 */
	@Column(length = 36)
	private String bumens;
	
	
	public String getBumens() {
		return bumens;
	}
	public void setBumens(String bumens) {
		this.bumens = bumens;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public Integer getLzAge() {
		return lzAge;
	}
	public void setLzAge(Integer lzAge) {
		this.lzAge = lzAge;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
	public String getLzSex() {
		return lzSex;
	}
	public void setLzSex(String lzSex) {
		this.lzSex = lzSex;
	}
	public String getLpZhiji() {
		return lpZhiji;
	}
	public void setLpZhiji(String lpZhiji) {
		this.lpZhiji = lpZhiji;
	}
	public String getLpTime() {
		return lpTime;
	}
	public void setLpTime(String lpTime) {
		this.lpTime = lpTime;
	}
	
	public String getTianBaoTime() {
		return tianBaoTime;
	}
	public void setTianBaoTime(String tianBaoTime) {
		this.tianBaoTime = tianBaoTime;
	}
	public String getDaihao() {
		return daihao;
	}
	public void setDaihao(String daihao) {
		this.daihao = daihao;
	}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getBumen() {
		return bumen;
	}
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	public String getChengbanbumen() {
		return chengbanbumen;
	}
	public void setChengbanbumen(String chengbanbumen) {
		this.chengbanbumen = chengbanbumen;
	}
	public String getApply() {
		return apply;
	}
	public void setApply(String apply) {
		this.apply = apply;
	}
	public String getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}


}
