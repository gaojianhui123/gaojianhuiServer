package com.sanyi.framework.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 问题反馈查询
 * @author 唐翔
 *
 */
@Entity
@Table(name ="t_feedback")
public class Feedback extends BaseEntity {
	
	private static final long serialVersionUID = 5570565584160869804L;
	// title 是签收人
	
	@Column(length=100,name="fkTime")
	private String fkTime;                    // 反馈时间
	
	@Column(length=100,name="signTime")
	private String signTime;                  // 签收时间
	
	@Column(length=36,name="department")
	private String department;              // 部门
	
	@Column(length=36)
	private String bumenid;
	
	@Column(columnDefinition="longtext default null")
	private String problem;                 // 存在问题
	
	@Column(columnDefinition="longtext default null")
	private String suggest;                 // 改进建议
	@Column(length=36,name="shenpi")
	private String shenpi;                  // 审批状态
	
	
	@Column(length=36,name="fzPerson")
	private String fzPerson;                  // 负责人
	
	@Column(length=36,name="gjTime")
	private String gjTime;                  // 改进反馈时间
	
	@Column(length=36,name="phone")
	private String phone;                  // 联系方式
	
	@Column(columnDefinition="longtext default null")
	private String gjResult;                  // 改进结果

	@Column(length = 36,name="lienPersonnelid")
	private String lienPersonnelid;                // 代号id

	@Transient
	private String daiHao;                         // 代号
	@Transient
	private String lzName;                         // 姓名
	@Transient
	private String lzSex;                          // 性别
	@Transient
	private String lzZhiJi;					       // 留置人员职级                        
	@Transient
	private String enterTime;	                   // 进驻时间
	@Transient
	private Integer lzAge;                         // 年龄
	
	
	
	public String getBumenid() {
		return bumenid;
	}

	public void setBumenid(String bumenid) {
		this.bumenid = bumenid;
	}

	public String getFzPerson() {
		return fzPerson;
	}

	public void setFzPerson(String fzPerson) {
		this.fzPerson = fzPerson;
	}

	public String getGjTime() {
		return gjTime;
	}

	public void setGjTime(String gjTime) {
		this.gjTime = gjTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGjResult() {
		return gjResult;
	}

	public void setGjResult(String gjResult) {
		this.gjResult = gjResult;
	}

	public String getShenpi() {
		return shenpi;
	}

	public void setShenpi(String shenpi) {
		this.shenpi = shenpi;
	}


	public String getFkTime() {
		return fkTime;
	}

	public void setFkTime(String fkTime) {
		this.fkTime = fkTime;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public String getDaiHao() {
		return daiHao;
	}

	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}

	
	public String getLzName() {
		return lzName;
	}

	public void setLzName(String lzName) {
		this.lzName = lzName;
	}

	public String getLzSex() {
		return lzSex;
	}

	public void setLzSex(String lzSex) {
		this.lzSex = lzSex;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getLienPersonnelid() {
		return lienPersonnelid;
	}

	public void setLienPersonnelid(String lienPersonnelid) {
		this.lienPersonnelid = lienPersonnelid;
	}

	public String getLzZhiJi() {
		return lzZhiJi;
	}

	public void setLzZhiJi(String lzZhiJi) {
		this.lzZhiJi = lzZhiJi;
	}

	public Integer getLzAge() {
		return lzAge;
	}

	public void setLzAge(Integer lzAge) {
		this.lzAge = lzAge;
	}
	
	
	

}