package com.in28m.springboot.ajaylearnspringboot.versioning;

import com.in28m.springboot.ajaylearnspringboot.versioning.Name;

public class PersonV2 {
	
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonV2 []";
	}
	
	
	

}
