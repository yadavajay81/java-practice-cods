package ab00463240.day1.innerclass;

public class BankAccount {

 private String accountNumber;
 private String accountHolder;
 private double balance;

 
 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Current Balance: $" + balance);
 }

 // Inner class: Transaction
 public class Transaction {

     // Deposit money
     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount; // accessing outer class member directly
             System.out.println("Deposited $" + amount + " successfully.");
             System.out.println("Updated Balance: $" + balance);
         } else {
             System.out.println("Invalid deposit amount.");
         }
     }

     // Withdraw money
     public void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount; // accessing outer class member directly
             System.out.println("Withdrew $" + amount + " successfully.");
             System.out.println("Updated Balance: $" + balance);
         } else {
             System.out.println("Insufficient funds or invalid amount.");
         }
     }
 }

 // Main method for demonstration
 public static void main(String[] args) {
     BankAccount account = new BankAccount("123456789", "Ajay Bahadur", 1000.0);
     account.displayAccountDetails();

     // Creating an object of inner class Transaction
     BankAccount.Transaction transaction = account.new Transaction();

     System.out.println("\n--- Performing Transactions ---");
     transaction.deposit(500.0);
     transaction.withdraw(200.0);
     transaction.withdraw(1500.0); // should show insufficient funds
 }
}

