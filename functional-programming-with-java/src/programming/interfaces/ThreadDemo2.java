package programming.interfaces;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=1; i<=10; i++) {
				System.out.println("Lambda: Chield Thread");
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Lambda: Parent Thread");
		}

	}

}
