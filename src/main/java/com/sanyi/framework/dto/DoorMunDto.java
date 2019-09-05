package com.sanyi.framework.dto;
/**
 * 
 * @author 唐翔
 *
 */
public class DoorMunDto {
	private  String areaId; //门区 id
	private  String areaName;//门区名字
	private  String areaType ;
	private  String isReceptionAssistant;
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaType() {
		return areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	public String getIsReceptionAssistant() {
		return isReceptionAssistant;
	}
	public void setIsReceptionAssistant(String isReceptionAssistant) {
		this.isReceptionAssistant = isReceptionAssistant;
	}
	
}
