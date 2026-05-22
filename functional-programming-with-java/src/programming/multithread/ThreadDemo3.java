package programming.multithread;

/**
 * Use lambda expression in place of runnable functional interface
 * @author yadav
 *
 */

public class ThreadDemo3 {
	
	public static void main(String[] args) {
		Thread t = new Thread(
				()->{
					for(int i=0; i<10; i++) {
						System.out.println("Chield Thred "+i);
					}
				});
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent Thred "+i);
		}
	
	
	
	Thread n= new Thread(()->{
		for(int i=0; i<=5; i++) {
			System.out.println("Chield thread");
		}
		
	});
	n.start();
	for(int i=0; i<10; i++) {
		System.out.println("Parent Thred "+i);
	}
	
	}

}
