package programming.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeRecords {
	
	int eno;
	String ename;
	float salary;
	
	
	EmployeeRecords(int eno, String ename, float salary){
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		
	}

	public String toString() {
		return eno+":"+ename+":"+salary;
	}
	
	
	public static void main(String[] args) {
		ArrayList<EmployeeRecords> e = new ArrayList<EmployeeRecords>();
		
		
		e.add(new EmployeeRecords(10,"Ajay", (float) 200.98));
		e.add(new EmployeeRecords(5,"Ajay", (float) 2020.98));
		e.add(new EmployeeRecords(100,"Ajay", (float) 300.95));
		e.add(new EmployeeRecords(20,"Ajay", (float) 400.98));
		e.add(new EmployeeRecords(40,"Ajay", (float) 200.98));
		
		Collections.sort(e,(s1,s2)->(s1.salary>s2.salary)?1:(s1.salary<s2.salary)?-1:0);
		
		System.out.println("Employee After Sorting: "+e);
		
	}
}
