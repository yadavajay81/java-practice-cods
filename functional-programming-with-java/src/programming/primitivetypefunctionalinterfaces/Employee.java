package programming.primitivetypefunctionalinterfaces;

import java.util.ArrayList;

public class Employee {
	String name;
	double sal;
	
	
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	public void populate(ArrayList<Employee> l) {
		l.add(new Employee("Sunny", 500.00));
		l.add(new Employee("Bunny", 500.00));
		l.add(new Employee("Chinny", 500.00));
		l.add(new Employee("Ginny", 500.00));
		l.add(new Employee("Minny", 500.00));
		
	}
	

}
