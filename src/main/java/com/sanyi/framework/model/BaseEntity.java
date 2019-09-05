package com.sanyi.framework.model;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.sanyi.framework.customerType.JsonStringType;
import com.sanyi.framework.customerType.StringArrayType;

@MappedSuperclass
@TypeDefs({
    @TypeDef(name = "string-array", typeClass = StringArrayType.class),
    @TypeDef(name = "json", typeClass = JsonStringType.class),
})
public abstract class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8543444379458706681L;
	@Id
	@Column(name="id", nullable=false, updatable=false,length = 32)
	//@GeneratedValue(strategy = GenerationType.TABLE)
	@GenericGenerator(name="systemUUID",strategy="uuid")
	@GeneratedValue(generator="systemUUID")
	private String id;
	@Column(length=100)
	private String title;
	/**
	 * 附加信息，以JSON格式存储在数据库中
	 */
	//@Type(type = "StringJsonbObject")
	//@Column(name="extrain_infomation")
	//@JsonIgnore
	//private String extrainfomationJson="[]";
	@Column(updatable=false,length=19)
	private String createtime;
	@Column(length=32)
	private String createrid;
	private Boolean deleted =false;
	//@Transient
	//private Map extrainfomationMap = new HashMap();
	//以下两个参数不持久化到数据库,用于分页
//	@Transient
//	private Integer currentPage = 0;
//	@Transient
//	private Integer sizePerPage = 10;
//	@Transient
//	private Boolean paging = true;
	public String getId() {
		return Optional.ofNullable(id).orElse("");
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreaterid() {
		return createrid;
	}
	public void setCreaterid(String createrid) {
		this.createrid = createrid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
