package java21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grpbyemp {
	
	

	public static void main(String[] args) {
		List<Employee> empArr = Arrays.asList(
				new Employee(1, "Ajay","sonar"),
				new Employee(2, "Ajay1","repo"),
				new Employee(3, "Ajay2","sonar"),
				new Employee(4, "Ajay3","meven"),
				new Employee(5, "Ajay4","sonar")
				
				);
		
		Map<String, List<Employee>> grpempBydep = empArr.stream()
				.collect(Collectors.groupingBy(Employee::getDep));
		
		
		grpempBydep.forEach((dep, empList)->{
			System.out.println("Department: "+dep);
			empList.forEach(System.out::println);
		});
		
		

	}

}
