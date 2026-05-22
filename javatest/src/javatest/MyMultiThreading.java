package javatest;

public class MyMultiThreading implements Runnable{
	
	private int threadNumber;
	public MyMultiThreading(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		
		//System.out.println("print multi thred: "+threadNumber);
		
		for(int i=1; i<=5; i++) {
		System.out.println(i +" From Thread Number: "+threadNumber);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
