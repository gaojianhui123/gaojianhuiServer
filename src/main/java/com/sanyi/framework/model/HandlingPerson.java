package com.sanyi.framework.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

/**
 * 办案人员管理 Model
 * @author 唐翔
 *
 */
@Entity
@Table(name = "t_handling_person")
public class HandlingPerson extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5505991644037286470L;

	// title 是办案人员姓名
	
	@Column(length = 100, name="applyTime")
	private String applyTime;                  // 登记日期
	
	@Column(length = 36, name="controlNo")
	private String controlNo;                // 办案人员编号
	
	@Column(name="memberSex")
	private Integer memberSex;               // 性别(0:男 1:女)
	
	@Column(name="age")
	private Integer age;                     // 年龄
	
	@Type(type = "json")
	@Column(columnDefinition = "json")
	private List<AttachmentFile> image;              // 办案人员图片
	
	@Column(length =200,name="img")
	private String img;              // 办案人员图片


	public String getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getControlNo() {
		return controlNo;
	}

	public void setControlNo(String controlNo) {
		this.controlNo = controlNo;
	}

	public Integer getMemberSex() {
		return memberSex;
	}

	public void setMemberSex(Integer memberSex) {
		this.memberSex = memberSex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<AttachmentFile> getImage() {
		return image;
	}

	public void setImage(List<AttachmentFile> image) {
		this.image = image;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


	
	
	
	
	

}
