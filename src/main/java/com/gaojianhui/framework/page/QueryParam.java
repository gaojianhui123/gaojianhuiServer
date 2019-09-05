package com.gaojianhui.framework.page;

import java.util.Optional;

public class QueryParam <T>{
	private Integer pi;
	private Integer ps;
	private SanyiPageable page ;
	private SanyiSort sort;
	private Boolean paging=true;
	private T query;
	private String sortparam;
	public SanyiPageable getPage() {
		SanyiPageable page_ =Optional.ofNullable(page).orElse(new SanyiPageable());
		return page_;
	}
	public void setPage(SanyiPageable page) {
		this.page = page;
	}
	public T getQuery() {
		return query;
	}
	public void setQuery(T query) {
		this.query = query;
	}
	public Boolean getPaging() {
		return paging;
	}
	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public SanyiSort getSort() {
		return Optional.ofNullable(sort).orElse(new SanyiSort());
	}
	public void setSort(SanyiSort sort) {
		this.sort = sort;
	}
	public Integer getPi() {
		
	
		return pi;
	}
	public void setPi(Integer pi) {
		if(pi!=null) {
			page.setCurrentPage(pi);
		}
		this.pi = pi;
	}
	public Integer getPs() {
		return ps;
	}
	public void setPs(Integer ps) {
		if(ps!=null) {
			page.setSizePerPage(ps);
		}
		this.ps = ps;
	}
	public String getSortparam() {
		return sortparam;
	}
	public void setSortparam(String sortparam) {
		if(sortparam!=null) {
			String[] sorts = sortparam.split("\\.");
			if(sorts.length>1) {
				sort.setSortName(sorts[0]);
				if (sorts[1].toUpperCase().startsWith("ASC")) {
					sort.setDirectionMethod("ASC");
				} else {
					sort.setDirectionMethod("DESC");
				}
			}
			
		}
		this.sortparam = sortparam;
	}

	

}
