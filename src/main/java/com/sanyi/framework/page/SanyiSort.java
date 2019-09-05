package com.sanyi.framework.page;

import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

public class SanyiSort {
	private String sortName;
	private String directionMethod;
	public String getSortName() {
		return Optional.ofNullable(sortName).orElse("createtime");
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public Direction getDirection() {
		if(directionMethod==null) {
			return Direction.DESC;
		} else if(directionMethod.toUpperCase().startsWith("ASC")) {
			return Direction.ASC;
		}else {
			return Direction.DESC;
		}
		
	}
	public String getDirectionMethod() {
		return directionMethod;
	}
	public void setDirectionMethod(String directionMethod) {
		this.directionMethod = directionMethod;
	}

	

	

}
