package programming.interfaces;

public class IntCalculation {

	public static void main(String[] args) {
		CalInterface ci = (a,b)->{
		System.out.println("Addition: "+(a+b));	
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		};
		
		ci.calculation(50, 10);

	}

}
