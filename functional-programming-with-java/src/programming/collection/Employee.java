package programming.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Employee {
	
	
	Integer eno;
	String ename;
	
	Employee(Integer eno, String ename){
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString() {
		return eno+" : "+ename;
	}
	
	

	public static void main(String[] args) {
		Employee e = new Employee(100, "Ajay");
		System.out.println(e);
		
		
		
		
		
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		
		e1.add(new Employee(100, "Ajay"));
		e1.add(new Employee(10, "Mamta"));
		e1.add(new Employee(1000, "Srishti"));
		e1.add(new Employee(20, "Shreya"));
		e1.add(new Employee(50, "Shreyas"));
		e1.add(new Employee(103, "Priya"));
		e1.add(new Employee(1005, "Pari"));
		
		System.out.println("Before sort: "+e1);
		
		
		
		Collections.sort(e1, (e2,e3)->(e2.eno>e3.eno)?-1:(e2.eno<e3.eno)?1:0);
		
		System.out.println("After custom sort dec: "+e1);
		
		
       // Collections.sort(e1, (e2,e3)->(e2.eno>e3.eno)?1:(e2.eno<e3.eno)?-1:0);
        
        Collections.sort(e1, (e2,e3)->-(e2.eno).compareTo(e3.eno));
        
        
		
		System.out.println("After custom sort asc: "+e1);
		
		
		//filter employ whose empno is less than 500
		
		List<Employee> p = e1.stream().filter(p1->p1.eno<500).collect(Collectors.toList());
		System.out.println("After Filter : "+p);
		
		
		List<Employee> ns = e1.stream().filter(t1->t1.ename.toLowerCase().contains("s")).collect(Collectors.toList());
		System.out.println("Employee that contain S in name-> "+ns);
		
		
		
		

	}

}
