package com.sanyi.framework.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * 房间
 * @author gaojianhui
 * 2019年5月30日16:26:36
 *
 */
@Entity
@Table(name = "t_room")
public class Room extends BaseEntity {

	private static final long serialVersionUID = 6152462823901381075L;
	// 楼层 1 ,2 ,3
	@Column(length = 10, name = "floorTier")
	private String floorTier;
	// 固定值 数据库不能修改
	@Column(length = 50, name = "fixationValue")
	private String fixationValue;
	@Transient
	private List<Bed> bedList = new ArrayList<Bed>();
	@Transient
	private String daiHao;
	@Transient
	private String bedName;

	public String getDaiHao() {
		return daiHao;
	}

	public void setDaiHao(String daiHao) {
		this.daiHao = daiHao;
	}

	public List<Bed> getBedList() {
		return bedList;
	}
	public void setBedList(List<Bed> bedList) {
		this.bedList = bedList;
	}
	public String getFloorTier() {
		return floorTier;
	}
	public void setFloorTier(String floorTier) {
		this.floorTier = floorTier;
	}
	public String getFixationValue() {
		return fixationValue;
	}
	public void setFixationValue(String fixationValue) {
		this.fixationValue = fixationValue;
	}

	public String getBedName() {
		return bedName;
	}

	public void setBedName(String bedName) {
		this.bedName = bedName;
	}
}
