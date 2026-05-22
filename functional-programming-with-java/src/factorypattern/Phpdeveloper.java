package factorypattern;

public class Phpdeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Php developer salary: ");
		return 90000;
	}

}
