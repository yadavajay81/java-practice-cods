package programming.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Employee salary Increment by 477 whose salary is less than 3500
 * @author yadav
 *
 */
public class EmployeeSalaryIncreement {
	
	String name;
	double salary;
	
	EmployeeSalaryIncreement(String name, double salary){
		this.name = name;
		this.salary = salary;
		
	}
	

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + "";
	}


	public static void main(String[] args) {
		ArrayList<EmployeeSalaryIncreement> e = new ArrayList<EmployeeSalaryIncreement>();
		
		populate(e);
		
		Predicate<EmployeeSalaryIncreement> p = sl->sl.salary<3500;
		
		Function<ArrayList<EmployeeSalaryIncreement>, ArrayList<EmployeeSalaryIncreement>> f =emp->{
			
			ArrayList<EmployeeSalaryIncreement> ne = new ArrayList<EmployeeSalaryIncreement>();
			
			for(EmployeeSalaryIncreement ns:emp) {
				
				if(p.test(ns)) {
					ne.add(new EmployeeSalaryIncreement(ns.name, ns.salary+477));
				}else {
				
				ne.add(new EmployeeSalaryIncreement(ns.name, ns.salary));
				}
				
			}
			
			return ne;
			
		};
		System.out.println("Epmloyee new Salary: "+f.apply(e));
		System.out.println("**************************");
		
		
		Function<EmployeeSalaryIncreement,EmployeeSalaryIncreement> f1=e1->{
			e1.salary=e1.salary+477;
			return e1;
		};
		
		System.out.println("Epmloyee Salary without increement "+e);
		
		ArrayList<EmployeeSalaryIncreement> nse = new ArrayList<EmployeeSalaryIncreement>();
		
		for(EmployeeSalaryIncreement q:e) {
			
			if(p.test(q)) {
				f1.apply(q);
				nse.add(q);
			}
		}
		System.out.println("Epmloyee Salary after increment ");
		System.out.println(e);
		System.out.println("Epmloyee whose Salary increemented ");
		System.out.println(nse);

	}

	private static void populate(ArrayList<EmployeeSalaryIncreement> e) {
		e.add(new EmployeeSalaryIncreement("Sunny", 2000));
		e.add(new EmployeeSalaryIncreement("Vunny", 1500));
		e.add(new EmployeeSalaryIncreement("Cunny", 3500));
		e.add(new EmployeeSalaryIncreement("kunny", 2500));
		e.add(new EmployeeSalaryIncreement("Tunny", 4000));
		e.add(new EmployeeSalaryIncreement("Runny", 21000));
		
	}

}
