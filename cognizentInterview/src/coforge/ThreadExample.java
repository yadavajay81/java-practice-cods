package coforge;

public class ThreadExample {
	public static void main(String args[]) {
		Thread t = new Thread(new MyTask());
		t.start();
	}

}

class MyTask implements Runnable{
	public void run() {
		System.out.println("Current Thread: "+Thread.currentThread().getName());
	}
}