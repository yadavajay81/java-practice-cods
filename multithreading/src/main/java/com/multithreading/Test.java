package com.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=1;
		//tk(k);
		//System.out.println(tk(k));
		
		List<String> motsList = new ArrayList<String>();
		motsList.add("Ram");
		tk(motsList);
		
		System.out.println(motsList);

	}
	
	
	
	public static  void tk(List<String> motsList) {
		motsList.add("Ajay");
		
	}

}
