package programming.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeSalInc {

	
	String name;
	double sal;
	
	
	
	
	public EmployeeSalInc(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}




	public static void main(String[] args) {
		ArrayList<EmployeeSalInc> em = new ArrayList<EmployeeSalInc>();
		BiFunction<String, Double,EmployeeSalInc> f= (e, s)->new EmployeeSalInc(e,s);
		em.add(f.apply("Sunny", 50000.0));
		em.add(f.apply("Bunny", 53000.0));
		em.add(f.apply("Runny", 50400.0));
		em.add(f.apply("Tunny", 55000.0));
		em.add(f.apply("Munny", 58000.0));
		
		BiConsumer<EmployeeSalInc,Double> c = (emp,i)->emp.sal=emp.sal+i;
		
		for(EmployeeSalInc e:em) {
			System.out.println(e.name+" "+e.sal);
		}
		System.out.println("****************After salary increement****************");
		
		for(EmployeeSalInc e:em) {
			c.accept(e, 500.0);
		}
		
		for(EmployeeSalInc e:em) {
			System.out.println(e.name+" "+e.sal);
		}

	}

}
