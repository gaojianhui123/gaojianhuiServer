package com.sanyi.framework.dto;

import java.sql.Date;

import com.sanyi.framework.model.LienPersonnel;

/**
 * 进驻表关联保障申请表
 * 
 * @author tanj8899
 *
 */
public class LienPersonnelBzDto extends LienPersonnel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2831338626898038427L;
	private String lpId;
	private String bumen;
	private String chengbanbumen;
	private String tianBaoTime;
	private String matter;
	private String apply;
	private String applyStatus;
	private String remark;
	private String bzId;

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

	public String getChengbanbumen() {
		return chengbanbumen;
	}

	public void setChengbanbumen(String chengbanbumen) {
		this.chengbanbumen = chengbanbumen;
	}

	public String getTianBaoTime() {
		return tianBaoTime;
	}

	public void setTianBaoTime(String tianBaoTime) {
		this.tianBaoTime = tianBaoTime;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public String getApply() {
		return apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	public String getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBzId() {
		return bzId;
	}

	public void setBzId(String bzId) {
		this.bzId = bzId;
	}

}
