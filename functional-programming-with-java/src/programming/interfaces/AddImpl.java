package programming.interfaces;

public class AddImpl {
	public static void main(String[] args) {
		Add add = (a, b)->System.out.println("Addition " +(a+b));
		
		add.addInt(20, 30);
		add.addInt(200, 300);
	}

}
