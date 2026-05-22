package com.letsstartcoding.springexample.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
	
	public static void main(String args[]) {
		System.out.println("I am here");
		
		List<Integer> l1 = new ArrayList<>();
		for(int i=0; i<20; i++) {
			l1.add(i);
		}
		/*List<Integer> l2 = new ArrayList<>();
		for (int j:n) {
			if(j%2==0) {
				l2.add(j);
			}
		}
		System.out.println("Filtered even numbers: "+l2);*/
		
		List<Integer> l2 = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Filtered even numbers: "+l2);
		List<Integer> l3 = l1.stream().filter(i -> i%2 == 1).collect(Collectors.toList());
		System.out.println("Filtered odd numbers: "+l3);
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println("Print through Iterator: "+it.next());
		}
		
		
	}

}
