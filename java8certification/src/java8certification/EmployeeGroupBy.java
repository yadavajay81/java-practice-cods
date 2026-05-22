package java8certification;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
	
}

public class EmployeeGroupBy {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(1, "Alice", "HR"),
	            new Employee(2, "Bob", "Engineering"),
	            new Employee(3, "Charlie", "HR"),
	            new Employee(4, "David", "Engineering"),
	            new Employee(5, "Eve", "Finance")
				
				);
		
		Map<String, List<Employee>> egrpD = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		egrpD.forEach((dep, emplist) -> {
			System.out.println("DepartMent: "+dep);
			emplist.forEach(System.out::println);
			System.out.println("======================================================");
		});
		
		System.out.println("================================================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<String, List<Employee>> empGroupByDepartment = 
				emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		
		System.out.println(empGroupByDepartment);
		
		
		
		
		empGroupByDepartment.forEach((department, emplist) -> {
			System.out.println("Department: "+department);
			emplist.forEach(System.out::println);
			System.out.println("========================");
		});
		
	}

}
