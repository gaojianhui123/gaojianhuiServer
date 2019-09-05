package com.gaojianhui.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_protected_resource")
public class ProtectedResource extends BaseTreeEntity{
	public static String ProtectedResource_TYPE_MENU="menu";
	public static String ProtectedResource_TYPE_BUTTON="button";
	public static String ProtectedResource_TYPE_API="api";

	public ProtectedResource() {
		super();
	}
	public ProtectedResource(String id) {
		super();
		setId(id);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -1815556541348908881L;
	@Column(length = 50)
	private String url;
	//受限资源类型，包括菜单  按钮  访问接口
	@Column(length = 10)
	private String tyle;
	//图标
	@Column(length = 50 ,name="icon")
	private String iconclass;
	//图标颜色
	@Column(length = 50)
	private String iconcolor;
	//备注
	@Column(length = 500)
	private String description;
	@Transient
	private String text;
	@Transient
	private String link;
	@Transient
	private String icon;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTyle() {
		return tyle;
	}
	public void setTyle(String tyle) {
		this.tyle = tyle;
	}
	
	public String getIconclass() {
		return iconclass;
	}
	public void setIconclass(String iconclass) {
		this.iconclass = iconclass;
	}
	public String getIconcolor() {
		return iconcolor;
	}
	public void setIconcolor(String iconcolor) {
		this.iconcolor = iconcolor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = getTitle();
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = getUrl();
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
