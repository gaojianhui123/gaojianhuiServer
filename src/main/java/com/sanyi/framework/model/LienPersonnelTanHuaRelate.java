package com.sanyi.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 留置人和谈话记录关联表
 * @author gaojianhui
 * 2019年3月12日09:27:56
 *
 */
@Entity
@Table(name="t_lien_tanhua")
public class LienPersonnelTanHuaRelate extends BaseEntity {
	private static final long serialVersionUID = -4752281767246082588L;
	// nurseid
	@Column(length = 36, name = "nurseId")
	private String nurseId;
	// 谈话开始时间
	@Column(length = 36, name = "talkStartTime")
	private String talkStartTime; 
	// 谈话结束时间
	@Column(length = 36, name = "talkEndTime")
	private String talkEndTime; 
	// 备注
	@Column(length = 100,name = "remark")
	private String remark;
	// 谈话人
	@Column(length = 100,name = "tanHuaRen")
	private String tanHuaRen;
	// 谈话人编号
	@Column(length = 36,name = "tanHuaRenNo")
	private String tanHuaRenNo;
	// 次数 第几波人 随机生成的标识
	@Column(length = 36,name = "ciShu")
	private String ciShu;
	
	@Transient
	private String daiHao;
	@Transient
	private String lpId;
	@Transient
	private String restsRemarks;
	@Transient
	private String jishuRen; // 奇数人
	@Transient
	private String oushuRen; // 偶数人
	
	
	public String getRestsRemarks() {
		return restsRemarks;
	}
	public void setRestsRemarks(String restsRemarks) {
		this.restsRemarks = restsRemarks;
	}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getJishuRen() {
		return jishuRen;
	}
	public void setJishuRen(String jishuRen) {
		this.jishuRen = jishuRen;
	}
	public String getOushuRen() {
		return oushuRen;
	}
	public void setOushuRen(String oushuRen) {
		this.oushuRen = oushuRen;
	}
	public String getDaiHao() {
		return daiHao;
	}
	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}
	public String getCiShu() {
		return ciShu;
	}
	public void setCiShu(String ciShu) {
		this.ciShu = ciShu;
	}
	public String getTanHuaRenNo() {
		return tanHuaRenNo;
	}
	public void setTanHuaRenNo(String tanHuaRenNo) {
		this.tanHuaRenNo = tanHuaRenNo;
	}
	public String getNurseId() {
		return nurseId;
	}
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}
	public String getTanHuaRen() {
		return tanHuaRen;
	}
	public void setTanHuaRen(String tanHuaRen) {
		this.tanHuaRen = tanHuaRen;
	}
	public String getTalkStartTime() {
		return talkStartTime;
	}
	public void setTalkStartTime(String talkStartTime) {
		this.talkStartTime = talkStartTime;
	}
	public String getTalkEndTime() {
		return talkEndTime;
	}
	public void setTalkEndTime(String talkEndTime) {
		this.talkEndTime = talkEndTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
