
public class MyTask extends Thread {
	
	public void run() {
		
		System.out.println("Execure thread"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyTask t1 = new MyTask();
		MyTask t2 = new MyTask();
		
		t1.start();
		t2.start();

	}

}
