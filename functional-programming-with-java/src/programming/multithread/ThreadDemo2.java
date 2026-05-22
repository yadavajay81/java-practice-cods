package programming.multithread;


/**
 * Replace inner anonymous class with lambda expression
 * @author yadav
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Chield1 Thread "+1);
			}
			for(int i=0; i<10; i++) {
				System.out.println("Chield2 Thread "+i);
			}
			for(int i=0; i<10; i++) {
				System.out.println("Chield3 Thread "+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent1 Thread "+i);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Parent2 Thread "+i);
		}
		for(int i=0; i<10; i++) {
			System.out.println("Parent3 Thread "+i);
		}
		
	}
}
