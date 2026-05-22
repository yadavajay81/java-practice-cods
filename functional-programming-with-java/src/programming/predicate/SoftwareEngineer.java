package programming.predicate;

import java.util.function.Predicate;

/**
 * To check software engineer allowed in pub or not
 * @author yadav
 *
 */
public class SoftwareEngineer {
	
	String name;
	int age;
	boolean isHavingGf;
	
	SoftwareEngineer(String name, int age, boolean isHavingGf){
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
		
	}
	
	
	

	
	@Override
	public String toString() {
		return name;
	}





	public static void main(String[] args) {
		Predicate<SoftwareEngineer> allowed = se->se.age>=18 && se.isHavingGf;
		
		SoftwareEngineer[] sList = {
				new SoftwareEngineer("Sunil", 20, true),
				new SoftwareEngineer("Vikas", 15, true),
				new SoftwareEngineer("Ram", 40, false),
				new SoftwareEngineer("Shyam", 25, true),
				new SoftwareEngineer("Gopal", 30, false),
		};
		
		System.out.println("Software Engineer alowed in PUB: ");
		for(SoftwareEngineer s:sList) {
			if(allowed.test(s)) {
				System.out.println(s);
			}
		}
		

	}

}
