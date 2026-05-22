package javatest;

public class Multithreadinonepage implements Runnable{
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
		MyMultiThreading myThread = new MyMultiThreading(i);
		Thread newThread = new Thread(myThread);
				newThread.start();
		}
		
	}

	@Override
	public void run() {
		for(int i=5; i<=50; i++) {
			System.out.println(i);
		}
		  
	}

}
