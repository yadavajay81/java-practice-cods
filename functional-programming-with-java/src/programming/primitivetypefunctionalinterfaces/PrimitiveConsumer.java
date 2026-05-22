package programming.primitivetypefunctionalinterfaces;

import java.util.ArrayList;
/**
 * primitive type consumer
 */
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveConsumer {

	public static void main(String[] args) {
		
		/**
		 * if input type is fixed then we can use
		 */
		IntConsumer ic = i->System.out.println(i);
		ic.accept(10);
		
		LongConsumer lc = i->System.out.println(i);
		lc.accept(10);
		
		DoubleConsumer dc = i->System.out.println(i);
		dc.accept(10);
		
		
		
		ArrayList<Employee> l= new ArrayList<Employee>();
		populate(l);
		
		ObjDoubleConsumer<Employee> ode=(e,d)->e.sal=e.sal+d;
		
		
		for(Employee e:l) {
			ode.accept(e, 500);
		}
		for(Employee e:l) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee Salary: "+e.sal);
			System.out.println();
		}
		

	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Sunny", 5100.00));
		l.add(new Employee("Bunny", 5300.00));
		l.add(new Employee("Chinny", 4500.00));
		l.add(new Employee("Ginny", 5200.00));
		l.add(new Employee("Minny", 5600.00));
		
	}

}
