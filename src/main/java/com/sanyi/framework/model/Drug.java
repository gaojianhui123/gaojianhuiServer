package com.sanyi.framework.model;

import com.sanyi.framework.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.sql.Date;

/**
 * 药品库
 * @author gaojianhui
 */
@Entity
@Table(name = "t_drug")
public class Drug extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4992918110924406056L;
	
	// 留置人id
	@Column(length = 36, name = "lpId")
	private String lpId;
	// 使用药品名称
	@Column(length = 36, name = "drugName")
	private String drugName;
	// 入库时间
	@Column(name = "rukuTime")
	private Date rukuTime;
	// 药品数量
	@Column(name = "drugTotalCount")
	private Integer drugTotalCount;
	// 单位
	@Column(length = 36,name = "unit")
	private String unit;
	// 单价
	@Column(length = 36,name = "price")
	private String price;
	// 入库医生
	@Column(length = 36, name = "doctor")
	private String doctor;
	// 备注
	@Column(length = 100,name = "remark")
	private String remark;
	// 规格
	@Column(length = 20,name = "guige")
	private String guige;
	
	// 使用药品名称
	@Transient
	private String drugNameString;
	/**
	 * 费用
	 */
	@Transient
	private double cost;
	// 开始
	@Transient
	private String start;
	// 结束
	@Transient
	private String end;
	
	
	public String getGuige() {
		return guige;
	}
	public void setGuige(String guige) {
		this.guige = guige;
	}
	public String getDrugNameString() {
		return drugNameString;
	}
	public void setDrugNameString(String drugNameString) {
		this.drugNameString = drugNameString;
	}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Integer getDrugTotalCount() {
		return drugTotalCount;
	}
	public void setDrugTotalCount(Integer drugTotalCount) {
		this.drugTotalCount = drugTotalCount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getRukuTime() {
		return rukuTime;
	}
	public void setRukuTime(Date rukuTime) {
		this.rukuTime = rukuTime;
	}


	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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
}
