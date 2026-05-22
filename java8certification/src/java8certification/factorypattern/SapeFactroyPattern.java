package java8certification.factorypattern;

public class SapeFactroyPattern {
	
	public static Sape getSape(String str) {
		
		if(str.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(str.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

}
