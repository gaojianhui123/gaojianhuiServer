package com.sanyi.framework.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * 餐饮表
 * @author 74308
 *
 */
@Entity
@Table(name = "t_catering")
public class Catering extends BaseEntity{

	private static final long serialVersionUID = -9118400250587410736L;
	
	@Column(length = 36,name="cateringMenu")
	private String cateringMenu;                     // 菜单  0 常规菜单    1 特殊菜单
	
	
	@Column(length = 50,name="cookingMan")
	private String cookingMan;                     // 做餐人一
	@Column(length = 50,name="cookingManTwo")
	private String cookingManTwo;                     // 做餐人二
	@Column(length = 50,name="cookingManThree")
	private String cookingManThree;                     // 做餐人三
	
//	@Type(type = "json")
//	@Column(columnDefinition = "json")
//	private List<String> cookingMans = new ArrayList<String>();             // -----多个 做餐人
	
	@Column(length = 50,name="packingMan")
	private String packingMan;                     // 打包人
	@Column(length = 50,name="packingManTwo")
	private String packingManTwo;                     // 打包人二
	@Column(length = 50,name="packingManThree")
	private String packingManThree;                     // 打包人三
	
	
	@Column(length = 50,name="deliveryMan")
	private String deliveryMan;                     // 送餐人receive
	@Column(length = 50,name="deliveryManTwo")
	private String deliveryManTwo;                     // 送餐人二receive
	@Column(length = 50,name="deliveryManThree")
	private String deliveryManThree;                     // 送餐人三receive
	
	@Column(length = 50,name="receiveMan")
	private String receiveMan;                     // 接餐人
	@Column(length = 50,name="receiveManTwo")
	private String receiveManTwo;                     // 接餐人二
	@Column(length = 50,name="receiveManThree")
	private String receiveManThree;                     // 接餐人三
	
	@Column(length = 50,name="riqi")
	private String riqi;                     // 日期
	
	@Column(length = 36,name="lienPersonnelid")
	private String lienPersonnelid;                     // 代号   留置人员的id
	
	@Column(length = 250,name="remarks")
	private String remarks;                         // 备注
	
	@Column(columnDefinition="longtext default null",name="breakfast")
	private String breakfast;                                                    // 常规早餐
	
	@Column(columnDefinition="longtext default null",name="lunch")
	private String lunch;                                                       // 常规午餐
	
	@Column(columnDefinition="longtext default null",name="dinner")
	private String dinner;                                                       // 常规晚餐
	
	@Column(columnDefinition="longtext default null",name="specificbreakfast")
	private String specificbreakfast;                                                    // 特殊早餐
	
	@Column(columnDefinition="longtext default null",name="specificlunch")
	private String specificlunch;                                                       // 特殊午餐
	
	@Column(columnDefinition="longtext default null",name="specificdinner")
	private String specificdinner;                                                       // 特殊晚餐

	public String getCateringMenu() {
		return cateringMenu;
	}

	public String getCookingMan() {
		return cookingMan;
	}

	public String getPackingMan() {
		return packingMan;
	}

	public String getDeliveryMan() {
		return deliveryMan;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public String getSpecificbreakfast() {
		return specificbreakfast;
	}

	public String getSpecificlunch() {
		return specificlunch;
	}

	public String getSpecificdinner() {
		return specificdinner;
	}

	public void setCateringMenu(String cateringMenu) {
		this.cateringMenu = cateringMenu;
	}

	public void setCookingMan(String cookingMan) {
		this.cookingMan = cookingMan;
	}

	public void setPackingMan(String packingMan) {
		this.packingMan = packingMan;
	}

	public void setDeliveryMan(String deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public void setSpecificbreakfast(String specificbreakfast) {
		this.specificbreakfast = specificbreakfast;
	}

	public void setSpecificlunch(String specificlunch) {
		this.specificlunch = specificlunch;
	}

	public void setSpecificdinner(String specificdinner) {
		this.specificdinner = specificdinner;
	}

	public String getReceiveMan() {
		return receiveMan;
	}

	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}

	public String getRiqi() {
		return riqi;
	}

	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}

	public String getLienPersonnelid() {
		return lienPersonnelid;
	}

	public void setLienPersonnelid(String lienPersonnelid) {
		this.lienPersonnelid = lienPersonnelid;
	}

	public String getCookingManTwo() {
		return cookingManTwo;
	}

	public String getCookingManThree() {
		return cookingManThree;
	}

	public String getPackingManTwo() {
		return packingManTwo;
	}

	public String getPackingManThree() {
		return packingManThree;
	}

	public String getDeliveryManTwo() {
		return deliveryManTwo;
	}

	public String getDeliveryManThree() {
		return deliveryManThree;
	}

	public String getReceiveManTwo() {
		return receiveManTwo;
	}

	public String getReceiveManThree() {
		return receiveManThree;
	}

	public void setCookingManTwo(String cookingManTwo) {
		this.cookingManTwo = cookingManTwo;
	}

	public void setCookingManThree(String cookingManThree) {
		this.cookingManThree = cookingManThree;
	}

	public void setPackingManTwo(String packingManTwo) {
		this.packingManTwo = packingManTwo;
	}

	public void setPackingManThree(String packingManThree) {
		this.packingManThree = packingManThree;
	}

	public void setDeliveryManTwo(String deliveryManTwo) {
		this.deliveryManTwo = deliveryManTwo;
	}

	public void setDeliveryManThree(String deliveryManThree) {
		this.deliveryManThree = deliveryManThree;
	}

	public void setReceiveManTwo(String receiveManTwo) {
		this.receiveManTwo = receiveManTwo;
	}

	public void setReceiveManThree(String receiveManThree) {
		this.receiveManThree = receiveManThree;
	}

	
	
	

}
