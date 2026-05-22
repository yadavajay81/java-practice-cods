package java8certification;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
	
	private AtomicInteger balance = new AtomicInteger(0);
	
	public void deposit(int amount) {
		balance.addAndGet(amount);
		System.out.println("Deposit "+amount);
	}
	
	public void withdraw(int amount) {
		balance.addAndGet(-amount);
		System.out.println("Withdraw "+amount);
	}
	
	public int getBalance() {
		
		return balance.get();
	}

	public static void main(String[] args) throws InterruptedException {
		
		BankAccount bankAccount = new BankAccount();
		
		// Create threads for depositing and withdrawing money
		Thread depositThread = new Thread(() ->{
			for(int i=0; i<100; i++) {
				bankAccount.deposit(1);
			}
		});
		
		Thread withdrawThread = new Thread(() -> {
			for(int i=0; i<100; i++) {
				bankAccount.withdraw(1);
			}
		});
		
		// Start threads
		depositThread.start();
		withdrawThread.start();
		
		// Wait for both threads to finish
		depositThread.join();
		withdrawThread.join();
		
		System.out.println("Final balance is: "+bankAccount.getBalance());

	}

}
