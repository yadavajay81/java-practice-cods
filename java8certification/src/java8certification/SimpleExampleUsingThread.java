package java8certification;

public class SimpleExampleUsingThread extends Thread {
	
	public void run() {
		System.out.println("Running current Thread Name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		SimpleExampleUsingThread t1 = new SimpleExampleUsingThread();
		SimpleExampleUsingThread t2 = new SimpleExampleUsingThread();
		
		t1.start();
		t2.start();

	}

}
