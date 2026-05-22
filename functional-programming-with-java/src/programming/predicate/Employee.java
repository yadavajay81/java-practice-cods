package programming.predicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Employee management Application using predicate
 * @author yadav
 *
 */
public class Employee {
	
	String name;
	String designation;
	double salary;
	String city;
	
	Employee(String name, String designation, double salary, String city){
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		
	}
	
	public String toString() {
		String s = String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
		return s;
	}
	

	public static void main(String[] args) {
		ArrayList<Employee> el = new ArrayList<Employee>();
		
		/*
		Employee e = new Employee("Ajay", "Se", 2000,"Delhi");
		Employee e1 = new Employee("Ram", "Dev", 1000,"Noida");
		el.add(e);
		el.add(e1);
		System.out.println(el);
		*/
		
		
		/**
		 * Add employee using method
		 */
		populate(el);
		
		System.out.println("All employee whose designation is manager: ");
		Predicate<Employee> p1 = p->p.designation.equalsIgnoreCase("Manager");
		display(p1,el);
		
		System.out.println("All Employee from  Delhi: ");
		Predicate<Employee> p2 = p->p.city.equalsIgnoreCase("Delhi");
		display(p2, el);
		
		System.out.println("All Employee whose salary is less than 20000: ");
		Predicate<Employee> p3 = p->p.salary<20000;
		display(p3, el);
		
		
		/**
		 * Join predicate
		 */
		System.out.println("All manager from Delhi to give pink slip: ");
		display(p1.and(p2), el);
		
		System.out.println("Select all employ who is manager or salary less than 20000");
		display(p1.or(p3), el);
		
		System.out.println("Select all employ who are not manager");
		display(p1.negate(), el);

	}

	private static void display(Predicate<Employee> p1, ArrayList<Employee> el) {
		
		for(Employee e:el) {
			if(p1.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("******************************************");
		
	}

	private static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Ajay", "Se", 2000,"Delhi"));
		list.add(new Employee("Ravi", "manager", 20001,"Noida"));
		list.add(new Employee("Ram", "CEO", 19000,"Hydrabad"));
		list.add(new Employee("Sandeep", "DOD", 20003,"Delhi"));
		list.add(new Employee("Ajay4", "Se", 20004,"Delhi"));
		list.add(new Employee("Ajay5", "Manager", 200012,"Delhi"));
		list.add(new Employee("Ajay6", "Se", 20005,"Delhi"));
		list.add(new Employee("Ajay7", "Se", 20006,"Delhi"));
		list.add(new Employee("Krishna", "Manager", 20007,"St. Luis"));
		list.add(new Employee("Tushar", "Manager", 20007,"Delhi"));
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, designation, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && Objects.equals(designation, other.designation)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

}
