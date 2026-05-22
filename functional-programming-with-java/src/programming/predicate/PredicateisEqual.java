package programming.predicate;

import java.util.function.Predicate;

public class PredicateisEqual {

	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("Ajay");
		System.out.println(p.test("Ajay"));
		System.out.println(p.test("ajay"));
		
		System.out.println("************************************");
		
		Predicate<Employee> p1 = Predicate.isEqual(new Employee("Ajay", "Se", 2000,"Delhi"));
		
		Employee e1 = new Employee("Ram", "Dev", 1000,"Noida");
		Employee e2 = new Employee("Ajay", "Se", 2000,"Delhi");
		
		System.out.println(p1.test(e1));
		System.out.println(p1.test(e2));
		

	}

}
