package com.sanyi.framework.dto;

import java.io.Serializable;

public interface TreeNode extends Serializable{

	public String getId();
	public String getPid();
	public Integer getSortindex();
	public String getKey();
	public String getName();

}
