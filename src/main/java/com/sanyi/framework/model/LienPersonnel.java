package com.sanyi.framework.model;

import org.hibernate.annotations.Type;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * 留置人员信息表
 * 
 * @author tanj8899
 *
 */
@Entity
@Table(name = "t_lien_personnel")
public class LienPersonnel extends BaseEntity {

	private static final long serialVersionUID = -1743556436723344685L;

	@Column(length = 20, name = "cuoShiType")
	private String cuoShiType; // 措施种类

	@Column(length = 20, name = "zhuanAnName")
	private String zhuanAnName; // 专案名称

	@Column(length = 36, name = "daiHao")
	private String daiHao; // 留置人代号

	@Column(length = 36, name = "roomNum")
	private String roomNum; // 留置人员房间号
	
	@Column(length = 36, name = "bedNum")
	private String bedNum; // 留置人员床位号

	@Column(length = 20, name = "lzName")
	private String lzName; // 留置人员姓名

	@Column(length = 10, name = "lzSex")
	private String lzSex; // 留置人员性别

	@Column(name = "lzAge")
	private Integer lzAge; // 留置人员年龄

	@Column(length = 36, name = "birthDay")
	private String birthDay; // 留置人员出生日期

	@Column(length = 36, name = "lzMinZu")
	private String lzMinZu; // 留置人员名族

	@Column(length = 36, name = "lzZhiJi")
	private String lzZhiJi; // 留置人员职级
	@Column(length = 36, name = "lzZhiWu")
	private String lzZhiWu; // 留置人员职务
	
	@Column(length = 36, name = "lzDanWei")
	private String lzDanWei; // 留置人员单位
	
	@Column(length = 36, name = "enterTime")
	private String enterTime; // 进驻时间

	@Column(length = 20, name = "lzQiXian")
	private String lzQiXian; // 留置期限

	@Column(length = 20, name = "outTime")
	private String outTime; // 撤离时间
	
	@Column(length = 2, name = "outStatus")
	private String outStatus; // 撤离状态  0: 未撤离 1： 已撤离

	@Column(length = 36, name = "cbDepartment")
	private String cbDepartment; // 承办部门（字典id）

	@Column(length = 20, name = "linkman")
	private String linkman; // 联系人

	@Column(length = 11, name = "telNum")
	private String telNum; // 联系电话
	
	@Type(type = "json")
	@Column(columnDefinition = "json")
	private List<AttachmentFile> wenjian; // 相关文件
	
	@Column(length = 36, name = "kanhuLiLiang")
	private String kanhuLiLiang; // 看护力量(字典id)
	
	@Column(length = 36, name = "yihurenyuan")
	private String yihurenyuan; // 医护人员
	@Transient
	private String kanhuLiLiangString; // 看护力量名称
	@Transient
	private String cbDepartmentString; // 承办部门名称
	@Transient
	private String roomName; // 房间表名称
	@Transient
	private String bedName; // 床位名称
	/**
	 * Health Transient 体检
	 */
	@Transient
	private String lpId; // 留置id
	@Transient
	private String doctor; // 医生
	@Transient
	private String tiJianTime; // 体检时间
	@Transient
	private String hId; // 体检id
	
	/**
	 * 以下为看护表临时信息
	 */
	@Transient
	private String submitId; // 上报人
	@Transient
	private String talkId; // 谈话人
	@Transient
	private String talkTimeOpen; // 谈话开始时间
	@Transient
	private String talkTimeClose; // 谈话结束时间
	@Transient
	private String nurseId; // 看护ID
	// 上报时间
	@Transient
	private String submitTime;
	
	@Transient
	private String start;
	@Transient
	private String end;

	@Transient
	private String tianBaoTime;
	//这个是导出excel 判断性别临时变量
	@Transient
	private String sex;
	//这个是导出excel 判断措施种类临时变量
	@Transient
	private String cuoshi;
	//这个是导出excel 判断承办部门临时变量
	@Transient
	private String bumen;
	//这个是导出excel 判断职务临时变量
	@Transient
	private String zhiji;
	//这个是导出excel 判断序号临时变量
	@Transient
	private Integer paixu;
	//这个是导出excel 判断看护力量临时变量
	@Transient
	private String kanhu;

	public String getBedName() {
		return bedName;
	}

	public void setBedName(String bedName) {
		this.bedName = bedName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getBedNum() {
		return bedNum;
	}

	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}

	public String getKanhuLiLiangString() {
		return kanhuLiLiangString;
	}

	public void setKanhuLiLiangString(String kanhuLiLiangString) {
		this.kanhuLiLiangString = kanhuLiLiangString;
	}

	public String getCbDepartmentString() {
		return cbDepartmentString;
	}

	public void setCbDepartmentString(String cbDepartmentString) {
		this.cbDepartmentString = cbDepartmentString;
	}

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getLzZhiWu() {
		return lzZhiWu;
	}

	public void setLzZhiWu(String lzZhiWu) {
		this.lzZhiWu = lzZhiWu;
	}

	public String getLzDanWei() {
		return lzDanWei;
	}

	public void setLzDanWei(String lzDanWei) {
		this.lzDanWei = lzDanWei;
	}

	public String getYihurenyuan() {
		return yihurenyuan;
	}

	public void setYihurenyuan(String yihurenyuan) {
		this.yihurenyuan = yihurenyuan;
	}

	public String getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(String outStatus) {
		this.outStatus = outStatus;
	}


	public String getTianBaoTime() {
		return tianBaoTime;
	}

	public void setTianBaoTime(String tianBaoTime) {
		this.tianBaoTime = tianBaoTime;
	}

	public String getKanhuLiLiang() {
		return kanhuLiLiang;
	}

	public void setKanhuLiLiang(String kanhuLiLiang) {
		this.kanhuLiLiang = kanhuLiLiang;
	}

	public String getKanhu() {
		return kanhu;
	}

	public void setKanhu(String kanhu) {
		this.kanhu = kanhu;
	}

	public Integer getPaixu() {
		return paixu;
	}

	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
	}

	public String getCuoshi() {
		return cuoshi;
	}

	public void setCuoshi(String cuoshi) {
		this.cuoshi = cuoshi;
	}

	public String getBumen() {
		return bumen;
	}

	public void setBumen(String bumen) {
		this.bumen = bumen;
	}

	public String getZhiji() {
		return zhiji;
	}

	public void setZhiji(String zhiji) {
		this.zhiji = zhiji;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public String getLpId() {
		return lpId;
	}

	public void setLpId(String lpId) {
		this.lpId = lpId;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getTiJianTime() {
		return tiJianTime;
	}

	public void setTiJianTime(String tiJianTime) {
		this.tiJianTime = tiJianTime;
	}


	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Column(length = 10, name = "sPStatus")
	private String sPStatus; // 审批状态

	public String getCuoShiType() {
		return cuoShiType;
	}

	public void setCuoShiType(String cuoShiType) {
		this.cuoShiType = cuoShiType;
	}

	public String getZhuanAnName() {
		return zhuanAnName;
	}

	public void setZhuanAnName(String zhuanAnName) {
		this.zhuanAnName = zhuanAnName;
	}

	public String getDaiHao() {
		return daiHao;
	}

	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
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

	public Integer getLzAge() {
		return lzAge;
	}

	public void setLzAge(Integer lzAge) {
		this.lzAge = lzAge;
	}

	public String getLzMinZu() {
		return lzMinZu;
	}

	public void setLzMinZu(String lzMinZu) {
		this.lzMinZu = lzMinZu;
	}

	public String getLzZhiJi() {
		return lzZhiJi;
	}

	public void setLzZhiJi(String lzZhiJi) {
		this.lzZhiJi = lzZhiJi;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getLzQiXian() {
		return lzQiXian;
	}

	public void setLzQiXian(String lzQiXian) {
		this.lzQiXian = lzQiXian;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getCbDepartment() {
		return cbDepartment;
	}

	public void setCbDepartment(String cbDepartment) {
		this.cbDepartment = cbDepartment;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public List<AttachmentFile> getWenjian() {
		return wenjian;
	}

	public void setWenjian(List<AttachmentFile> wenjian) {
		this.wenjian = wenjian;
	}

	public String getsPStatus() {
		return sPStatus;
	}

	public void setsPStatus(String sPStatus) {
		this.sPStatus = sPStatus;
	}

	public String getSubmitId() {
		return submitId;
	}

	public String getTalkId() {
		return talkId;
	}

	public String getTalkTimeOpen() {
		return talkTimeOpen;
	}

	public String getTalkTimeClose() {
		return talkTimeClose;
	}

	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}

	public void setTalkId(String talkId) {
		this.talkId = talkId;
	}

	public void setTalkTimeOpen(String talkTimeOpen) {
		this.talkTimeOpen = talkTimeOpen;
	}

	public void setTalkTimeClose(String talkTimeClose) {
		this.talkTimeClose = talkTimeClose;
	}

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

}
