package programming.interfaces;

public class ThreadWithLambda {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Chield class");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=5; i++) {
			System.out.println("p1 class");
		}
		for(int i=0; i<=5; i++) {
			System.out.println("p2 class");
		}
		for(int i=0; i<=5; i++) {
			System.out.println("p3 class");
		}

	}

}
