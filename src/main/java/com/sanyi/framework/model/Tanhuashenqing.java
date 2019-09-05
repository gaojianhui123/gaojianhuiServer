package com.sanyi.framework.model;

import com.sanyi.framework.dto.EntranceGuardStaffDto;
import com.sanyi.framework.model.BaseEntity;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * 谈话申请
 * @author gaojianhui
 */
@Entity
@Table(name = "t_tanhuashenqing")
public class Tanhuashenqing extends BaseEntity {
	@Transient
	private String	cuoShiType;
	
	private static final long serialVersionUID = -8183931121459959037L;
	// 留置人id
	@Column(length = 36, name = "lpId")
	private String lpId;
	// 填报部门
	@Column(length = 50, name = "bumen")
	private String bumen;
	// 填报人
	@Column(length = 50,name = "tianbaoren")
	private String tianbaoren;
	//填报时间
	@Column(name = "tianBaoTime")
	private Date  tianBaoTime;	
	
	@Column(length = 36,name = "shenpiStatus")
	private String shenpiStatus;                // 审批状态 0 未审批  1 已审批
	
	
	@Column(length = 200,name = "shenpiYijian")
	private String shenpiYijian;                // 审批意见
	
	@Column(length = 36,name = "doorId")
	private String doorId;                // 房门id（门禁系统中的房门id）
	
	// 人员 (门禁系统中的人员id列表) 
	@Type(type = "json")
	@Column(columnDefinition = "json",name = "renyuan")
	private List<String> renyuan =new ArrayList<String>();
	// 立方人员对象数据
	@Type(type = "json")
	@Column(columnDefinition = "json",name = "lifangStaffDto")
	private List<EntranceGuardStaffDto> lifangStaffDto =new ArrayList<EntranceGuardStaffDto>();
	
	// 代号
	@Transient
	private String daiHao;
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
	// 看护力量
	@Transient
	private String kanhuLiLiang;
	// 部门字符串
	@Transient
	private String bumenString;
	
	
	public List<EntranceGuardStaffDto> getLifangStaffDto() {
		return lifangStaffDto;
	}
	public void setLifangStaffDto(List<EntranceGuardStaffDto> lifangStaffDto) {
		this.lifangStaffDto = lifangStaffDto;
	}
	public String getBumenString() {
		return bumenString;
	}
	public void setBumenString(String bumenString) {
		this.bumenString = bumenString;
	}
	public String getKanhuLiLiang() {
		return kanhuLiLiang;
	}
	public void setKanhuLiLiang(String kanhuLiLiang) {
		this.kanhuLiLiang = kanhuLiLiang;
	}
	public String getDoorId() {
		return doorId;
	}
	public void setDoorId(String doorId) {
		this.doorId = doorId;
	}
	public Date getTianBaoTime() {
		return tianBaoTime;
	}
	public void setTianBaoTime(Date tianBaoTime) {
		this.tianBaoTime = tianBaoTime;
	}
	
	public String getDaiHao() {
		return daiHao;
	}
	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
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
	public Integer getLzAge() {
		return lzAge;
	}
	public void setLzAge(Integer lzAge) {
		this.lzAge = lzAge;
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
	public String getTianbaoren() {
		return tianbaoren;
	}
	public void setTianbaoren(String tianbaoren) {
		this.tianbaoren = tianbaoren;
	}
	public List<String> getRenyuan() {
		return renyuan;
	}
	public void setRenyuan(List<String> renyuan) {
		this.renyuan = renyuan;
	}
	public String getCuoShiType() {
		return cuoShiType;
	}
	public void setCuoShiType(String cuoShiType) {
		this.cuoShiType = cuoShiType;
	}
	public String getShenpiStatus() {
		return shenpiStatus;
	}
	public void setShenpiStatus(String shenpiStatus) {
		this.shenpiStatus = shenpiStatus;
	}
	public String getShenpiYijian() {
		return shenpiYijian;
	}
	public void setShenpiYijian(String shenpiYijian) {
		this.shenpiYijian = shenpiYijian;
	}


}
