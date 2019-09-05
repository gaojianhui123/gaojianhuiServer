package com.sanyi.framework.dto;
/**
 * 门禁系统的房门dto
 * @author gjh
 */
public class EntranceGuardDoorDto {
	private String areaId;
	private String channelnum;
	private String devicesysid;
	private String doorId;
	private String doorName;
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getChannelnum() {
		return channelnum;
	}
	public void setChannelnum(String channelnum) {
		this.channelnum = channelnum;
	}
	public String getDevicesysid() {
		return devicesysid;
	}
	public void setDevicesysid(String devicesysid) {
		this.devicesysid = devicesysid;
	}
	public String getDoorId() {
		return doorId;
	}
	public void setDoorId(String doorId) {
		this.doorId = doorId;
	}
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	
}
