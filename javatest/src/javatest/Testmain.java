package javatest;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=5;i++) {
		MyMultiThreading myThread = new MyMultiThreading(i);
		Thread newThread = new Thread(myThread);
				newThread.start();
				System.out.println(newThread.isAlive());
				
				try {
					newThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
