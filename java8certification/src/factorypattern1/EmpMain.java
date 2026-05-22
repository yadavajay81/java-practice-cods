package factorypattern1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Ajay", 500),
				new Employee("Ajay1", 5300),
				new Employee("Ajay2", 8500),
				new Employee("Ajay3", 1500),
				new Employee("Ajay4", 5000)
				);
		
		List<Employee> semp = employees.stream()
				.filter(e-> e.getSalary()>1000)
				.collect(Collectors.toList());
		semp.forEach(s->System.out.println(s.getName()));
		
		
		
		employees.stream()
	    .filter(emp -> emp.getSalary() > 5500)
	    .map(Employee::getName)
	    .sorted()
	    .forEach(System.out::println);

		

	}
	
	
}
