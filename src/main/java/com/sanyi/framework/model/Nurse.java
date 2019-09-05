package com.sanyi.framework.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 看护表
 * 
 * @author 74308
 *
 */
@Entity
@Table(name = "t_nurse")
public class Nurse extends BaseEntity {

	private static final long serialVersionUID = 5287347653529489495L;

	@Column(length = 36, name = "lienPersonnelid")
	private String lienPersonnelid; // 代号
	@Column(length = 36, name = "tanHuaShenQingId")
	private String tanHuaShenQingId; // 谈话申请id
	@Column(length = 36, name = "submitId")
	private String submitId; // 上报人
	
	@Column(length = 36, name = "submitTime")
	private String submitTime; // 上报时间
	

	@Column(columnDefinition = "longtext default null", name = "cateringRemarks")
	private String cateringRemarks; // 餐饮情况

	@Column(columnDefinition = "longtext default null", name = "conditionRemarks")
	private String conditionRemarks; // 情绪情况

	@Column(columnDefinition = "longtext default null", name = "restsRemarks")
	private String restsRemarks; // 其他情况

	@Column(length = 36, name = "nursePower")
	private String nursePower; // 看护力量 0 1 下拉

	@Column(length = 200, name = "noinquiry")
	private String noinquiry; // 被调查对象非讯问时间情况

	@Transient
	private String shichang;
	@Transient
	private String daiHao; // 代号
	@Transient
	private String roomNum; // 房间号
	@Transient
	private String lzSex; // 性别
	@Transient
	private String lzMinZu; // 民族
	@Transient
	private String enterTime; // 进驻时间
	@Transient
	private String roomNumName; // 房间号名称


	@Transient
	private String count; // 提醒次数
	@Transient
	private String sum; // 时长合计
	@Transient
	private List<LienPersonnelTanHuaRelate> lienPersonnelTanHuaRelates = new ArrayList<LienPersonnelTanHuaRelate>(); // 谈话记录列表


	public String getRoomNumName() {
		return roomNumName;
	}

	public void setRoomNumName(String roomNumName) {
		this.roomNumName = roomNumName;
	}

	public List<LienPersonnelTanHuaRelate> getLienPersonnelTanHuaRelates() {
		return lienPersonnelTanHuaRelates;
	}

	public void setLienPersonnelTanHuaRelates(List<LienPersonnelTanHuaRelate> lienPersonnelTanHuaRelates) {
		this.lienPersonnelTanHuaRelates = lienPersonnelTanHuaRelates;
	}

	public String getTanHuaShenQingId() {
		return tanHuaShenQingId;
	}

	public void setTanHuaShenQingId(String tanHuaShenQingId) {
		this.tanHuaShenQingId = tanHuaShenQingId;
	}

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}


	public String getShichang() {
		return shichang;
	}

	public void setShichang(String shichang) {
		this.shichang = shichang;
	}

	public String getSubmitId() {
		return submitId;
	}
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}


	public String getCateringRemarks() {
		return cateringRemarks;
	}

	public String getConditionRemarks() {
		return conditionRemarks;
	}

	public String getRestsRemarks() {
		return restsRemarks;
	}

	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}


	public void setCateringRemarks(String cateringRemarks) {
		this.cateringRemarks = cateringRemarks;
	}

	public void setConditionRemarks(String conditionRemarks) {
		this.conditionRemarks = conditionRemarks;
	}

	public void setRestsRemarks(String restsRemarks) {
		this.restsRemarks = restsRemarks;
	}

	public String getLienPersonnelid() {
		return lienPersonnelid;
	}

	public void setLienPersonnelid(String lienPersonnelid) {
		this.lienPersonnelid = lienPersonnelid;
	}

	public String getDaiHao() {
		return daiHao;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public String getLzSex() {
		return lzSex;
	}

	public String getLzMinZu() {
		return lzMinZu;
	}

	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public void setLzSex(String lzSex) {
		this.lzSex = lzSex;
	}

	public void setLzMinZu(String lzMinZu) {
		this.lzMinZu = lzMinZu;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getNursePower() {
		return nursePower;
	}

	public String getNoinquiry() {
		return noinquiry;
	}

	public void setNursePower(String nursePower) {
		this.nursePower = nursePower;
	}

	public void setNoinquiry(String noinquiry) {
		this.noinquiry = noinquiry;
	}
}
