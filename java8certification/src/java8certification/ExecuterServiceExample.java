package java8certification;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(500);
		
		for(int i=1; i<=500; i++) {
		executor.submit(() -> {
			System.out.println("Task 1 is running");
		});
		}
		
		for(int i=1; i<=500; i++) {
			
				System.out.println("Task 1 is running");
		
			}
		
		/*for(int i=0; i<=50; i++) {
		executor.submit(() -> {
			System.out.println("Task 2 is running");
		});
		}*/
		executor.shutdown();

	}

}
