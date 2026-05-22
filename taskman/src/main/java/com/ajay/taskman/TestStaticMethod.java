package com.ajay.taskman;

public class TestStaticMethod {
	
	public static String name = "";
	
	static {
		System.out.println("I am in static block");
		name = "Ajay";
	}

	public static void main(String[] args) {
		
		System.out.println("I am in main method " +name);

	}

}
