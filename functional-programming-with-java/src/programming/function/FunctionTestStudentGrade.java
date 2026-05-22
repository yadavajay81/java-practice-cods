package programming.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTestStudentGrade {

	
	String name;
	int mark;
	
	FunctionTestStudentGrade(String name, int mark){
		this.name = name;
		this.mark = mark;
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<FunctionTestStudentGrade> l = new ArrayList<FunctionTestStudentGrade>();
		populate(l);
		
		Function<FunctionTestStudentGrade, String> sd = s->{
			int mark = s.mark;
			if(mark>=80) {
				return "A[Distinction]";
			}else if(mark>=60) {
				return "B[First]";
			}else if(mark>=50) {
				return "C[Second]";
			}else if(mark>=30) {
				return "D[Third]";
			}else {
				return "E[Failed]";
			}
			
		};
		
		/**
		 * we can use terneary operator
		 */
		Function<FunctionTestStudentGrade, String> s1 = s2->(s2.mark>=80)?"A[Distinction]":(s2.mark>=60)?"B[First]":
			(s2.mark>=50)?"C[Second]":(s2.mark>=30)?"D[Third]":"E[Failed]";
		
		
		
		for(FunctionTestStudentGrade st:l) {
			System.out.println("Student Name: "+st.name);
			System.out.println("Student Mark: "+st.mark);
			System.out.println("Student Grade: "+s1.apply(st));
			System.out.println();
		}
		
		
		/**
		 * Use predicate write student whose mark is greater than 60
		 */
		Predicate<FunctionTestStudentGrade> p = s3->s3.mark>=60;
		
		for(FunctionTestStudentGrade st:l) {
			if(p.test(st)) {
			System.out.println("Student Name: "+st.name);
			System.out.println("Student Mark: "+st.mark);
			System.out.println("Student Grade: "+s1.apply(st));
			System.out.println();
			}
		
		}

	}



	private static void populate(ArrayList<FunctionTestStudentGrade> l) {
		l.add(new FunctionTestStudentGrade("Ram", 80) );
		l.add(new FunctionTestStudentGrade("Shyam", 95) );
		l.add(new FunctionTestStudentGrade("Mohan", 65) );
		l.add(new FunctionTestStudentGrade("Rohan", 25) );
		l.add(new FunctionTestStudentGrade("Raman", 55) );
		l.add(new FunctionTestStudentGrade("Manan", 42) );
		
	}

}
