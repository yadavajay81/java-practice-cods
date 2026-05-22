package com.ajay.spring_boot_mysql_crud_api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Moviesdata {
	private int page;
	
	@JsonProperty(value = "per_page")
	private int perPage;
	
	private int  total;
	
	@JsonProperty(value = "total_pages")
	private int totalPages;
	
	private List<Moviedata> data;

	public Moviesdata(int page, int perPage, int total, int totalPages, List<Moviedata> data) {
		super();
		this.page = page;
		this.perPage = perPage;
		this.total = total;
		this.totalPages = totalPages;
		this.data = data;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<Moviedata> getData() {
		return data;
	}

	public void setData(List<Moviedata> data) {
		this.data = data;
	}
	
	
	
	
	
	
	
	

}
