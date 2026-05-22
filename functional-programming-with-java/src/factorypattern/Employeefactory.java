package factorypattern;

public class Employeefactory {
	
	public static Employee getEmployee(String empType) {
		
		if(empType.trim().equalsIgnoreCase("java developer")) {
			return new Javadeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("php developer")) {
			return new Phpdeveloper();
		}else {
			return null;
		}
	}

}
