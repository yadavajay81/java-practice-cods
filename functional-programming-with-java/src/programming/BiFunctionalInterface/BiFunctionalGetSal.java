package programming.BiFunctionalInterface;

import java.util.function.BiFunction;

/**
 * Gate the employ salary by passing employ and timesheet object
 * @author yadav
 *
 */

class Employee{
	int eno;
	String name;
	double dailywage;
	
	public Employee(int eno, String name, double dailywage) {
		
		this.eno = eno;
		this.name = name;
		this.dailywage = dailywage;
	}
	
}

class TimeSheet{
	int eno;
	int days;
	public TimeSheet(int eno, int days) {
		
		this.eno = eno;
		this.days = days;
	}
	
}


public class BiFunctionalGetSal {
	public static void main(String args[]) {
		Employee e = new Employee(101,"Ajay",1500);
		TimeSheet t = new TimeSheet(101,20);
		
		BiFunction<Employee,TimeSheet,Double> f = (em,et)->em.dailywage*et.days;
		
		System.out.println(f.apply(e, t));
		
	}

}
