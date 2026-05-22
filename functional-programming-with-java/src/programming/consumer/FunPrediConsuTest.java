package programming.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunPrediConsuTest {
	
	
	String name;
	int mark;
	
	FunPrediConsuTest(String name,int mark){
		this.name=name;
		this.mark=mark;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "name=" + name + ", mark=" + mark ;
	}





	public static void main(String[] args) {
		ArrayList<FunPrediConsuTest> l= new ArrayList<FunPrediConsuTest>();
		populate(l);
		
		Predicate<FunPrediConsuTest> p=i->i.mark>=65;
		Function<FunPrediConsuTest,String> f=i->(i.mark>=80)?"A":(i.mark>=60)?"B":(i.mark>=50)?"C":(i.mark>=40)?"D":(i.mark>=30)?"E":"F";
			
		
			Consumer<FunPrediConsuTest> c = s->{
			System.out.println(s.name);
			System.out.println(s.mark);
			System.out.println(f.apply(s));
			};
		
		for(FunPrediConsuTest st:l) {
			if(p.test(st)) {
				c.accept(st);
				System.out.println("---------------------------");
			}
			
		}
		

	}



	private static void populate(ArrayList<FunPrediConsuTest> l) {
		l.add(new FunPrediConsuTest("Bunny",45));
		l.add(new FunPrediConsuTest("Sunny",50));
		l.add(new FunPrediConsuTest("Munny",75));
		l.add(new FunPrediConsuTest("Tunny",65));
		l.add(new FunPrediConsuTest("Kunny",95));
		l.add(new FunPrediConsuTest("Runny",35));
		l.add(new FunPrediConsuTest("Aunny",25));
		l.add(new FunPrediConsuTest("Cunny",85));
		
	}

}
