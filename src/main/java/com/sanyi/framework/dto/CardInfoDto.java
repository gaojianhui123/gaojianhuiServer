package com.sanyi.framework.dto;
/**
 * 门禁系统
 * @author 74308
 *
 */
public class CardInfoDto implements Comparable<CardInfoDto>{
	
//	private String employeeName;  //人员姓名 ”张三”, 
//	private String operateTime;  //发卡日期 string:“2016-11-0309:36:03”,
//	private String invalidate;//有效期  string
//	private String serial;//卡号 string
//	private String phone;  //手机号 string 
//	private String departName; //所在部门 :”测试部” 
//
//
//	private Integer departId;//部门id  int
//	private String deptName;//部门名称  string:"接口测试部门",//
//	
//	private String empTypeName;//用户类型名称  string "A 用户类型 A"
//	
//	private String employeeId;//证件号  string :"0008
//
//	private String employeePass;//用户密码 string
//	private String employeeSex;//性别  1男 2女
//	private String employeeType;//用户类型编号 string
//	private String emplyeeCode;//用户姓名首字母
//
//	private Integer isDelete;//是否删除，0表示未删除  int
//	private Integer recharge_gif; //充值赠送 BigDecimal
//	
//	private Integer sysNo;//人员编号 int
//	private String sysNoForDevice;//给设备的人员编号
	private String boarding_expenses;
	private String cardCost;
	private String departId;
	private String deposit;
	private String deptName;
	private String empTypeName;
	
	private String employeeId;
	private String employeeName;
	private String employeePass;
	private String employeeSex;
	
	private String employeeType;
	private String emplyeeCode;
	private String fingerPrintNumber;
	private String invalidate;
	
	private String isAdmin;
	private String isDelete;
	private String isLeave;
	private String password;
	
	private String phone;
	private String photo;
	private String recharge_gif;
	private String serial;
	private String sysNo;
	private String sysNoForDevice;
	public String getBoarding_expenses() {
		return boarding_expenses;
	}
	public String getCardCost() {
		return cardCost;
	}
	public String getDepartId() {
		return departId;
	}
	public String getDeposit() {
		return deposit;
	}
	public String getDeptName() {
		return deptName;
	}
	public String getEmpTypeName() {
		return empTypeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeePass() {
		return employeePass;
	}
	public String getEmployeeSex() {
		return employeeSex;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public String getEmplyeeCode() {
		return emplyeeCode;
	}
	public String getFingerPrintNumber() {
		return fingerPrintNumber;
	}
	public String getInvalidate() {
		return invalidate;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public String getIsLeave() {
		return isLeave;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	public String getPhoto() {
		return photo;
	}
	public String getRecharge_gif() {
		return recharge_gif;
	}
	public String getSerial() {
		return serial;
	}
	public String getSysNo() {
		return sysNo;
	}
	public String getSysNoForDevice() {
		return sysNoForDevice;
	}
	public void setBoarding_expenses(String boarding_expenses) {
		this.boarding_expenses = boarding_expenses;
	}
	public void setCardCost(String cardCost) {
		this.cardCost = cardCost;
	}
	public void setDepartId(String departId) {
		this.departId = departId;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setEmpTypeName(String empTypeName) {
		this.empTypeName = empTypeName;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}
	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public void setEmplyeeCode(String emplyeeCode) {
		this.emplyeeCode = emplyeeCode;
	}
	public void setFingerPrintNumber(String fingerPrintNumber) {
		this.fingerPrintNumber = fingerPrintNumber;
	}
	public void setInvalidate(String invalidate) {
		this.invalidate = invalidate;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public void setIsLeave(String isLeave) {
		this.isLeave = isLeave;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setRecharge_gif(String recharge_gif) {
		this.recharge_gif = recharge_gif;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public void setSysNo(String sysNo) {
		this.sysNo = sysNo;
	}
	public void setSysNoForDevice(String sysNoForDevice) {
		this.sysNoForDevice = sysNoForDevice;
	}
	// 自定义排序
	@Override
	public int compareTo(CardInfoDto o) {
		// TODO Auto-generated method stub
		return this.getEmployeeId().compareTo(o.getEmployeeId());      //这里定义你排序的规则。
	}
	
	



}
