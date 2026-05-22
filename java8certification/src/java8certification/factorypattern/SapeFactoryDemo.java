package java8certification.factorypattern;

public class SapeFactoryDemo {

	public static void main(String[] args) {
		Sape circle = SapeFactroyPattern.getSape("circle");
		circle.draw();
		
		Sape square = SapeFactroyPattern.getSape("square");
		square.draw();

	}

}
