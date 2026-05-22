package programming.function;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * Get the total monthly salary of all employee
 * @author yadav
 *
 */
public class Employee {
	
	
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		populate(e);
		
		Function<ArrayList<Employee>,Double> f = s->{
			double total=0;
			
			for(Employee emp:s) {
				total = total+emp.salary;
			}
			
			return total;
		};

		
		System.out.println("Total Salary: "+ f.apply(e));
		
	}


	private static void populate(ArrayList<Employee> e) {
		e.add(new Employee("Ram", 2200.00));
		e.add(new Employee("Shyam", 2000.88));
		e.add(new Employee("Gautam", 1000));
		e.add(new Employee("Mohan", 30000));
		e.add(new Employee("Rohan", 49893));
		e.add(new Employee("Sohan", 5632));
		e.add(new Employee("Kishore", 1298));
		
		
	}

}
