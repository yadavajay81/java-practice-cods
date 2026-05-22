package com.ajay.spring_boot_mysql_crud_api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Moviedata {
	
	@JsonProperty(value = "Title")
	private String title;
	
	@JsonProperty(value = "Year")
	private int year;
	
	private String imdbID;

	public Moviedata(String title, int year, String imdbID) {
		super();
		this.title = title;
		this.year = year;
		this.imdbID = imdbID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	
	
	
	
	
	
	

}
