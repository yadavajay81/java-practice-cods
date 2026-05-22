package programming.multithread;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Thread t = new Thread(()->{
			for(int i=0; i<=100;i++) {
				System.out.println("Chield Thread: "+i);
			}
		});
		t.start();
		for(int i=0; i<=100;i++) {
			System.out.println("Parrent Thread: "+i);
		}
		
	
	System.out.println("===============================================");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<=10;i++) {
				System.out.println("Process Chield class");
				
			}
		});
		t1.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Process Parrent class");
			
		}
	}

}
