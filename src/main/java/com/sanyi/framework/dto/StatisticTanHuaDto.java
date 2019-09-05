package com.sanyi.framework.dto;

public class StatisticTanHuaDto {
	private String submitTime;// 上报时间
	private String startTime; //开始时间
	private String endTime; //结束时间
	private String count; // 谈话次数
	private String lId; //留置人id
	private String duration; //谈话时长
	
	
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getlId() {
		return lId;
	}
	public void setlId(String lId) {
		this.lId = lId;
	}

	
	
	
}
