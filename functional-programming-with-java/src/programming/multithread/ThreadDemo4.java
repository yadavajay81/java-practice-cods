package programming.multithread;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread t = new Thread(()->{
		
			for(int i=1;i<=1000;i++) {
				System.out.println("Chield thread "+i);
			}
			
		});
		
		t.start();
		
		for(int i=1;i<=1000;i++) {
			System.out.println("Parrent thread "+i);
		}

	}

}
