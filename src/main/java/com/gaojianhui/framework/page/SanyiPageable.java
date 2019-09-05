package com.gaojianhui.framework.page;

public class SanyiPageable {
	private Integer currentPage=0;
	private Integer sizePerPage=10;
	
	public Integer getCurrentPage() {
		
		return currentPage>0?currentPage-1:0;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getSizePerPage() {
		return sizePerPage;
	}
	public void setSizePerPage(Integer sizePerPage) {
		this.sizePerPage = sizePerPage;
	}


	

}
