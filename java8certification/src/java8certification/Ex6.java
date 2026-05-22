package java8certification;

public class Ex6 {

	public Ex6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 0, y = 10;
		try {
			y /=x;
		}
		System.out.println("/ by 0");
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
