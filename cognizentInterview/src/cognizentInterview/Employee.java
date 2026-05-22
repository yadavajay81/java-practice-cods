package cognizentInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	String name;
	String org;
	
	public Employee(String name,String org) {
		this.name = name;
		this.org = org;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", org=" + org + "]";
	}

	public static void main(String args[]) {
		
		List<Employee> emp = Arrays.asList(
				new Employee("Matt","sonar"),
				new Employee("Garava","sonar"),
				new Employee("Sumit","sonar"),
				new Employee("Vikas","Jfrog"),
				new Employee("Mike","Jfrog"),
				new Employee("Meshon","Codeinsights")
				);
		
		
		
		Map<String, List<Employee>> empGrpBy = emp.stream()
				.collect(Collectors.groupingBy(Employee::getOrg));
		
		//System.out.println(empGrpBy);
		
		empGrpBy.forEach((org, emp1) -> {
			System.out.println(" ");
			System.out.print(org +": ");
			emp1.stream().forEach(emp2 -> {
				System.out.print(" "+emp2.getName());
			});
			System.out.println(" ");
		});
		
		System.out.println("======org=================");
		
		
		
		
		
		System.out.println("===========Array==========");
		
		int[] a = {3,6,1,8,9,10};
		
		System.out.println(Arrays.stream(a).max().orElseThrow());
		
		
		
		Map<String, List<Employee>> empGroupByOrg = emp.stream().collect(
				Collectors.groupingBy(Employee::getOrg));
		
		empGroupByOrg.forEach((org, empList)->{
			
			//System.out.println(org+" : "+empList);
			System.out.println(org+" : "+empList);
		});
		
	}
	

}
