package programming.multithread;

/***
 * inner anonymous class example
 * @author yadav
 *
 */

public class ThreadingDemo {

	
	
	public static void main(String[] args) {
		
		 
		Runnable r = new Runnable() {
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Chield "+i);
			}
		}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent "+i);
		}

	}

}
