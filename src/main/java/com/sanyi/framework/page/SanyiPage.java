package com.sanyi.framework.page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public class SanyiPage<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	List<T> content=new ArrayList<T>(); // 分页的内容
	Long totalElements; //总条数
	Integer totalPages; //总页数

	
	public SanyiPage(){
		setContent(new ArrayList<T>());
		setTotalElements(0L);
		setTotalPages(0);
	}
	
	// 带参数的构造器
	public SanyiPage(Page<T> page){
		setContent(page.getContent());
		setTotalElements(page.getTotalElements());
		setTotalPages(page.getTotalPages());
	}
	// mybatis pageHelper 的分页
	public SanyiPage(com.github.pagehelper.Page<T> page,SanyiPageable pageable){
		if(pageable.getCurrentPage()<page.getPages()) {
			setContent(page.getResult());
		}else {
			//超过最大页码  返回空列表，与JPA Query的分页查询保持一致
			setContent(new ArrayList<T>());
		}
		setTotalElements(page.getTotal());
		setTotalPages(page.getPages());
	}
	// 带参数的构造器
	public SanyiPage(List<T> content, Pageable pageable, Long totalSize){
		setContent(content);
		setTotalElements(totalSize);
		setTotalPages(content.size() == 0 ? 1 : (int) Math.ceil((double) totalSize / (double) pageable.getPageSize()));
	}

	public List<T> getContent() {
		return content;
	}
	public void setContent(List<T> content) {
		this.content = content;
		this.totalElements=Long.valueOf(content.size()); 
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
}
