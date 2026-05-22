package hcl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demohclemp {

	public static void main(String[] arg) {
		
		List<Hclemp> emp = Arrays.asList(
				new Hclemp("Albert", 5002, "HR"),
				new Hclemp("Scot", 2000, "HR"),
				new Hclemp("Kris", 3000, "IT"),
				new Hclemp("Ram", 50008, "FIN"),
				new Hclemp("Shyam", 50007, "FIN")
				);
		
		
		
		List<String> empSortedBySal = emp.stream().sorted(Comparator.comparing(Hclemp::getSalary))
				.map(Hclemp::getName).collect(Collectors.toList());
		System.out.println(empSortedBySal);
		
		
		
		List<String> empName = emp.stream().filter(e-> e.getSalary() > 5000)
				.sorted(Comparator.comparing(Hclemp::getName))
				.map(Hclemp::getName)
				.collect(Collectors.toList());
		
		System.out.println(empName);
		
		
		List<Hclemp> empNameL = emp.stream().filter(e-> e.getSalary() > 5000)
				.sorted(Comparator.comparing(Hclemp::getName))
				.collect(Collectors.toList());
		
		empNameL.forEach(e -> {
			System.out.println("Employee- "+e.getName()+" Salary- "+e.getSalary());
		});
				
				
				
		
		
		List<Hclemp> empL = emp.stream().filter(e -> e.getSalary()>5000).collect(Collectors.toList());
		
		empL.forEach(e-> {
			System.out.println(e.getName());
		});
		
		
		Map<String, List<Hclemp>> hclegrp = emp.stream().collect(Collectors.groupingBy(Hclemp::getOrg));
		
		hclegrp.forEach((a, b)->{
			System.out.println("");
			System.out.println(a);
			b.forEach(e->{
				System.out.print(" "+e.getName());
			});
			System.out.println("");
		});
		
		
		
	}
}
