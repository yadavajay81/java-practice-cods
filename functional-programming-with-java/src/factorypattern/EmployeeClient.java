package factorypattern;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee em = new Javadeveloper();
		em.salary();
		
		Employee em1 = Employeefactory.getEmployee("java developer");
		em1.salary();

	}

}
