package programming.BiFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 * Pass student name and rollnumber and create 
 * student object;
 * @author yadav
 *
 */
public class BiFunctionExStu {
	
	String name;
	int roll;
	

public BiFunctionExStu(String name, int roll) {
	super();
	this.name = name;
	this.roll = roll;

	}

	

public static void main(String[] args) {
	ArrayList<BiFunctionExStu> s= new ArrayList<BiFunctionExStu>();
		BiFunction<String, Integer, BiFunctionExStu> f=(a,b)->new BiFunctionExStu(a,b);
		
		s.add(f.apply("Ajay", 20));
		s.add(f.apply("Ajay1", 21));
		s.add(f.apply("Ajay2", 22));
		s.add(f.apply("Ajay3", 23));
		s.add(f.apply("Ajay4", 24));
		
		
		for(BiFunctionExStu k:s) {
			System.out.println("Student Name: "+k.name+" And Roll number: "+k.roll);
		}
	
	}




}
