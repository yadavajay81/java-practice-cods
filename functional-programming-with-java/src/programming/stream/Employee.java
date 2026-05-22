package programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		populate(e);
		
		
		
		
		List<Employee> nl=e.stream().filter(i->i.salary>500).collect(Collectors.toList());
		
		
		
		
		
		
		
		
		
		List<Employee> filteredEmp = e.stream().filter(i->i.salary>20).collect(Collectors.toList());
		filteredEmp.stream().forEach(s-> System.out.println("This New "+s));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<Employee> el = e.stream().filter(q->q.salary>2000).collect(Collectors.toList());
		
		
		el.stream().forEach(w->System.out.println(w));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<Employee> ne= e.stream().filter(s->s.salary>2000).collect(Collectors.toList());
		
		System.out.println(ne);
		
		ne.stream().forEach(e1->System.out.println(e1));
		
		//sorting using stream
		List<Employee> e1=e.stream().sorted((e3,e4)->(e3.salary>e4.salary)?-1:(e3.salary>e4.salary)?1:0).collect(Collectors.toList());
		
		System.out.println(e1);

	}

	private static void populate(ArrayList<Employee> e) {
		e.add(new Employee("Sunny", 2000));
		e.add(new Employee("cunny", 1000));
		e.add(new Employee("Bunny", 4000));
		e.add(new Employee("Munny", 3000));
		e.add(new Employee("kunny", 1500));
		
	}

}
