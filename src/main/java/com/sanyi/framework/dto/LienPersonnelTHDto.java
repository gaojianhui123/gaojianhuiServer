package com.sanyi.framework.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.sanyi.framework.model.LienPersonnel;

/**
 * 进驻表关联谈话申请表
 * 
 * @author tanj8899
 *
 */
public class LienPersonnelTHDto extends LienPersonnel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -914955520338589173L;

	private String lpId;
	private String bumen;
	private String tianbaoren;
	private String tianBaoTime;
	private List<String> renyuan = new ArrayList<String>();
	private String thId;
	private String shenpiStatus;

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

	public String getTianBaoTime() {
		return tianBaoTime;
	}

	public void setTianBaoTime(String tianBaoTime) {
		this.tianBaoTime = tianBaoTime;
	}

	public List<String> getRenyuan() {
		return renyuan;
	}

	public void setRenyuan(List<String> renyuan) {
		this.renyuan = renyuan;
	}

	public String getThId() {
		return thId;
	}

	public void setThId(String thId) {
		this.thId = thId;
	}

	public String getShenpiStatus() {
		return shenpiStatus;
	}

	public void setShenpiStatus(String shenpiStatus) {
		this.shenpiStatus = shenpiStatus;
	}
	

}
