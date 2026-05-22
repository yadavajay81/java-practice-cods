package factorypattern1;

public class Vechilefactory1 {
	
	public static Vechile1 getVachile(String vech) {
		
		if(vech == "Car") {
			return new Car1();
		}else if(vech == "Motercycle") {
			return new Motercycle1();
		}
		
		return null;
	}

}
