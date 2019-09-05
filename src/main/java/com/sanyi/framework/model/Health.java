package com.sanyi.framework.model;

import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Date;

/**
 * 体检表
 * @author tanj8899
 *
 */
@Entity
@Table(name="t_health")
public class Health extends BaseEntity {
	private static final long serialVersionUID = 635818373102099941L;
	
	// 留置人id
	@Column(length = 36, name = "lpId")
	private String lpId;
	// 体检状态 1： 进驻体检  2： 常规体检
	@Column(length = 2, name = "status")
	private String status;
		
	@Column(length = 500,name = "historyMedical" )
	private String historyMedical;        			//病史
	
	@Column(length = 20,name = "tiwen" )
	private String  tiWen;  					//体温
	
	@Column(length = 20,name = "xueYa" )
	private String  xueYa;						//血压低压
	@Column(length = 20,name = "gaoXueYa" )
	private String  gaoXueYa;						//血压高压
	
	@Column(length = 20,name = "huXi" )
	private String  huXi;						//呼吸
	
	@Column(length = 20,name = "xinLv" )
	private String  xinLv;						//心率
	
	@Column(length = 500,name = "checkHealth" )
	private String  checkHealth;				//体格检查
	
	@Column(length = 500,name = "xinDianTu" )
	private String  xinDianTu;				//心电图
	
	@Column(length = 20,name = "xueTang" )
	private String  xueTang;				//随机血糖
	
	@Column(length = 500,name = "doctorYiJian" )
	private String  doctorYiJian;				//医生意见
	
	@Column(length = 50,name = "doctor" )
	private String  doctor;					//医生
	
	@Column(name = "tiJianTime" )
	private Date  tiJianTime;					//体检时间
	@Transient
	private String tiJianDate;
	
	@Column(length = 36,name = "fuZeRen" )
	private String  fuZeRen;						//专案组负责人
	
	@Column(length = 11,name = "fuZeRenTel" )
	private String  fuZeRenTel;					//联系方式
	
	@Column(length = 20,name = "shiDuan" )
	private String  shiDuan;					//时段
	
	@Column(length = 20,name = "medicalRecords" )
	private String  medicalRecords;				//用药记录
	
	@Column(length = 200,name = "specialCase" )
	private String  specialCase;				//特殊情况
	
	@Column(length = 20,name = "weight" )
	private String weight ;				        // 体重
	@Column(length = 50,name = "hushi" )
	private String hushi;//护士
	
	// 代号
	@Transient
	private String daihao;
	// 房间号
	@Transient
	private String roomNum;
	//床位号
	@Transient
	private String bedName;
	// 性别
	@Transient
	private String lzSex;
	// 年龄
	@Transient
	private Integer lzAge;
	@Transient
	private String roomNumName;
	// 进驻时间
	@Transient
	List<HealthDrugRelate> healthDrugRelateList;
	@Transient
	private String jinzhuriqi;
	@Transient
	private String dicName;
	@Transient
	private String yaoliang;
	@Transient
	private String danwei;
	@Transient
	private String remark;
	@Transient
	private String kaishiTime;
	@Transient
	private String jieshuTime;
	@Transient
	private String pinci;
	@Transient
	private String yihurenyuan;
	@Transient
	private String outStatus;



	public String getHushi() {
		return hushi;
	}

	public void setHushi(String hushi) {
		this.hushi = hushi;
	}

	public String getRoomNumName() {
		return roomNumName;
	}

	public void setRoomNumName(String roomNumName) {
		this.roomNumName = roomNumName;
	}

	public String getYihurenyuan() {
		return yihurenyuan;
	}

	public void setYihurenyuan(String yihurenyuan) {
		this.yihurenyuan = yihurenyuan;
	}

	public String getGaoXueYa() {
		return gaoXueYa;
	}

	public void setGaoXueYa(String gaoXueYa) {
		this.gaoXueYa = gaoXueYa;
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

	public String getPinci() {
		return pinci;
	}

	public void setPinci(String pinci) {
		this.pinci = pinci;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public String getYaoliang() {
		return yaoliang;
	}

	public void setYaoliang(String yaoliang) {
		this.yaoliang = yaoliang;
	}

	public String getDicName() {
		return dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public List<HealthDrugRelate> getHealthDrugRelateList() {
		return healthDrugRelateList;
	}

	public void setHealthDrugRelateList(List<HealthDrugRelate> healthDrugRelateList) {
		this.healthDrugRelateList = healthDrugRelateList;
	}

	public Integer getLzAge() {
		return lzAge;
	}

	public void setLzAge(Integer lzAge) {
		this.lzAge = lzAge;
	}

	public String getDaihao() {
		return daihao;
	}

	public void setDaihao(String daihao) {
		this.daihao = daihao;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getLzSex() {
		return lzSex;
	}

	public void setLzSex(String lzSex) {
		this.lzSex = lzSex;
	}

	public String getJinzhuriqi() {
		return jinzhuriqi;
	}

	public void setJinzhuriqi(String jinzhuriqi) {
		this.jinzhuriqi = jinzhuriqi;
	}

	public String getLpId() {
		return lpId;
	}

	public void setLpId(String lpId) {
		this.lpId = lpId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHistoryMedical() {
		return historyMedical;
	}

	public void setHistoryMedical(String historyMedical) {
		this.historyMedical = historyMedical;
	}

	public String getTiWen() {
		return tiWen;
	}

	public void setTiWen(String tiWen) {
		this.tiWen = tiWen;
	}

	public String getXueYa() {
		return xueYa;
	}

	public void setXueYa(String xueYa) {
		this.xueYa = xueYa;
	}

	public String getHuXi() {
		return huXi;
	}

	public void setHuXi(String huXi) {
		this.huXi = huXi;
	}

	public String getXinLv() {
		return xinLv;
	}

	public void setXinLv(String xinLv) {
		this.xinLv = xinLv;
	}

	public String getCheckHealth() {
		return checkHealth;
	}

	public void setCheckHealth(String checkHealth) {
		this.checkHealth = checkHealth;
	}

	public String getXinDianTu() {
		return xinDianTu;
	}

	public void setXinDianTu(String xinDianTu) {
		this.xinDianTu = xinDianTu;
	}

	public String getXueTang() {
		return xueTang;
	}

	public void setXueTang(String xueTang) {
		this.xueTang = xueTang;
	}

	public String getDoctorYiJian() {
		return doctorYiJian;
	}

	public void setDoctorYiJian(String doctorYiJian) {
		this.doctorYiJian = doctorYiJian;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public Date getTiJianTime() {
		return tiJianTime;
	}

	public void setTiJianTime(Date tiJianTime) {
		this.tiJianTime = tiJianTime;
	}

	public String getFuZeRen() {
		return fuZeRen;
	}

	public void setFuZeRen(String fuZeRen) {
		this.fuZeRen = fuZeRen;
	}

	public String getFuZeRenTel() {
		return fuZeRenTel;
	}

	public void setFuZeRenTel(String fuZeRenTel) {
		this.fuZeRenTel = fuZeRenTel;
	}

	public String getShiDuan() {
		return shiDuan;
	}

	public void setShiDuan(String shiDuan) {
		this.shiDuan = shiDuan;
	}

	public String getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(String medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public String getSpecialCase() {
		return specialCase;
	}

	public void setSpecialCase(String specialCase) {
		this.specialCase = specialCase;
	}

	public String getTiJianDate() {
		return tiJianDate;
	}

	public void setTiJianDate(String tiJianDate) {
		this.tiJianDate = tiJianDate;
	}

	public String getBedName() {
		return bedName;
	}

	public void setBedName(String bedName) {
		this.bedName = bedName;
	}

	public String getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(String outStatus) {
		this.outStatus = outStatus;
	}
}
