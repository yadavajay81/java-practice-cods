package programming.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	
	String name;
	int mark;
	

	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}


	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		populate(s);
		
		Function<Student, String> f = st->st.mark>=80?"A":st.mark>=60?"B":st.mark>=50?"C":st.mark>=40?"D":st.mark>=30?"E":"F";
		Predicate<Student> p = sm->sm.mark>=65;
		Consumer<Student> c = cs->{
			System.out.println(cs.name);
			System.out.println(cs.mark);
			System.out.println(f.apply(cs));
		};
		
		
		for(Student stu:s) {
			if(p.test(stu)) {
				c.accept(stu);
				System.out.println("========================");
			}
			
		}

	}


	private static void populate(ArrayList<Student> s) {
		s.add(new Student("Sunny",50));
		s.add(new Student("Aunny",90));
		s.add(new Student("Bunny",40));
		s.add(new Student("Cunny",30));
		s.add(new Student("Dunny",20));
		s.add(new Student("Eunny",70));
		s.add(new Student("Funny",85));
		s.add(new Student("Hunny",95));
		s.add(new Student("Iunny",75));
		s.add(new Student("Junny",55));
		
	}

}
