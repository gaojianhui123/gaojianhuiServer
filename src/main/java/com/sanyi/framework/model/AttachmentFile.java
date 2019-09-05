package com.sanyi.framework.model;
/**
 * 用于接收上传参数
 * @author 74308
 *
 */
public class AttachmentFile {
	private String name;   
	private String suffix;   
	private String url;
	private String uid;
	
	public String getName() {
		return name;
	}
	public String getSuffix() {
		if(suffix!=null) {
			return suffix.toUpperCase();
		}else {
			return suffix;
		}
	}
	public String getUrl() {
		return url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}   
	
	
}
