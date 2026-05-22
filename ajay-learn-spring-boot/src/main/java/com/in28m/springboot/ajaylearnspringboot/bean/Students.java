package com.in28m.springboot.ajaylearnspringboot.bean;

public class Students {

	private long rollnum;
	private String name;
	private String clname;

	public Students(long rollnum, String name, String clname) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.clname = clname;
	}

	public long getRollnum() {
		return rollnum;
	}

	public String getName() {
		return name;
	}

	public String getClname() {
		return clname;
	}

	@Override
	public String toString() {
		return "Students [rollnum=" + rollnum + ", name=" + name + ", clname=" + clname + "]";
	}

}
