package programming.methodrefrenceandconstructorrefrencedoubblecolon;

/**
 * Create multithread by simple class implementation or 
 * using lambda expression or
 * by method refrence 
 * @author yadav
 *
 */
public class MultiThread {
	/**
	 * run method have same argument as m1 method 
	 * so we can use m1 method by refrence for run
	 */
	public void m1() {
		for(int i=1; i<=10; i++) {
			System.out.println("By Method Refrence Chield thread");
		}
	}
	

	public static void main(String[] args) {

		/**
		 * by lambda expression
		 */
		
		Runnable r = ()->{
			for(int i=1; i<=10; i++) {
				System.out.println("Lambda Expression Chield thread");
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Lambda Expression Parrent thread");
		}
		
		System.out.println("=====================Thread by Method Reference=======");
		
		/**
		 * thread by Method Reference
		 * 
		 */
		
		MultiThread m = new MultiThread();
		Runnable r1 = m::m1;
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i=1; i<=10; i++) {
			System.out.println("By Method Reference Parrent thread");
		}

	}

}
