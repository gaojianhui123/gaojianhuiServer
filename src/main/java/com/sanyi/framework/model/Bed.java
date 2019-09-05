package com.sanyi.framework.model;

import com.sanyi.framework.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * 床
 * @author gaojianhui
 * 2019年5月30日16:23:30
 *
 */
@Entity
@Table(name = "t_bed")
public class Bed extends BaseEntity {

	private static final long serialVersionUID = -6374800649059243848L;
	// 房间Id
	@Column(length = 32, name = "roomId")
	private String roomId;
	@Column(name = "nearWind")
	private boolean nearWind = false; // 是否靠窗 true 靠窗 false 不靠窗
	@Transient
	private String key;  // 关键字
	@Transient
	private String daiHao;  // 代号
	@Transient
	private String buMen;  // 部门
	@Transient
	private String jinzhuTime;  // 进驻时间
	
	
	public String getDaiHao() {
		return daiHao;
	}
	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}
	public String getBuMen() {
		return buMen;
	}
	public void setBuMen(String buMen) {
		this.buMen = buMen;
	}
	public String getJinzhuTime() {
		return jinzhuTime;
	}
	public void setJinzhuTime(String jinzhuTime) {
		this.jinzhuTime = jinzhuTime;
	}
	public boolean isNearWind() {
		return nearWind;
	}
	public void setNearWind(boolean nearWind) {
		this.nearWind = nearWind;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	

}
