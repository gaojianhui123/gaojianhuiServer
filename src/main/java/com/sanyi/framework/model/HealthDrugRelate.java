package com.sanyi.framework.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 体检药品关联表
 * @author gaojianhui
 *
 */
@Entity
@Table(name="t_health_drugs")
public class HealthDrugRelate extends BaseEntity {
	private static final long serialVersionUID = 635818373102099941L;
	
	// 体检id
	@Column(length = 36, name = "healthId")
	private String healthId;
	// 留置人id
	@Column(length = 36, name = "lpId")
	private String lpId;
	// 药品id
	@Column(length = 36, name = "dId")
	private String dId;
    // 数量
	@Column(length = 20,name = "yongliang" )
	private String yongliang;
	// 用法
	@Column(length = 100,name = "remark")
	private String remark;
	// 规格
	@Column(length = 36,name = "danwei")
	private String danwei;
	//开始时间
	@Column(length = 36,name = "kaishiTime" )
	private String  kaishiTime ;					
	//结束时间
	@Column(length = 36,name = "jieshuTime" )
	private String jieshuTime ;
	// 频次
	@Column(length = 36, name = "pinci")
	private String pinci;
	// 用药类型（0：长期用药；1：临时用药）
	@Column(length=36,name="yongyaoType")
	private String yongyaoType;
	// 开药医生
	@Column(length=36,name="kaiYaoDoctor")
	private String kaiYaoDoctor;

	// 停药医生
	@Column(length=36,name="tingYaoDoctor")
	private String tingYaoDoctor;


	// 检查项目ID（数据字典项目）
	@Column(length=36,name="jianchaProject")
	private String jianchaProject;
	// 药品名
	@Transient
	private String drugName;
	
	// 用法
	@Transient
	private String yongfa;
	// 频次
	@Transient
	private String pinciString;
	// 规格
	@Transient
	private String guigeString;

	// 检查化验
	@Transient
	private String projectName;
	
	
	
	public String getPinciString() {
		return pinciString;
	}
	public void setPinciString(String pinciString) {
		this.pinciString = pinciString;
	}
	public String getGuigeString() {
		return guigeString;
	}
	public void setGuigeString(String guigeString) {
		this.guigeString = guigeString;
	}
	public String getKaiYaoDoctor() {
		return kaiYaoDoctor;
	}
	public void setKaiYaoDoctor(String kaiYaoDoctor) {
		this.kaiYaoDoctor = kaiYaoDoctor;
	}
	public String getTingYaoDoctor() {
		return tingYaoDoctor;
	}
	public void setTingYaoDoctor(String tingYaoDoctor) {
		this.tingYaoDoctor = tingYaoDoctor;
	}
	public String getYongyaoType() {
		return yongyaoType;
	}
	public void setYongyaoType(String yongyaoType) {
		this.yongyaoType = yongyaoType;
	}
	public String getPinci() {
		return pinci;
	}
	public void setPinci(String pinci) {
		this.pinci = pinci;
	}
	
	
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getKaishiTime() {
		return kaishiTime;
	}
	public void setKaishiTime(String kaishiTime) {
		this.kaishiTime = kaishiTime;
	}
	public String getJieshuTime() {
		return jieshuTime;
	}
	public void setJieshuTime(String jieshuTime) {
		this.jieshuTime = jieshuTime;
	}
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getHealthId() {
		return healthId;
	}
	public void setHealthId(String healthId) {
		this.healthId = healthId;
	}
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public String getYongfa() {
		return yongfa;
	}
	public void setYongfa(String yongfa) {
		this.yongfa = yongfa;
	}
	public String getYongliang() {
		return yongliang;
	}
	public void setYongliang(String yongliang) {
		this.yongliang = yongliang;
	}

	public String getJianchaProject() {
		return jianchaProject;
	}

	public void setJianchaProject(String jianchaProject) {
		this.jianchaProject = jianchaProject;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
