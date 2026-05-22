package ab00463240.day1.enumassment;


public class Order {

 // Enum to represent order status
 public enum OrderStatus {
     PLACED, SHIPPED, DELIVERED, CANCELLED
 }

 // Private fields (Encapsulation)
 private int orderId;
 private String customerName;
 private double amount;
 private OrderStatus status; // Using Enum

 // Constructor
 public Order(int orderId, String customerName, double amount) {
     this.orderId = orderId;
     this.customerName = customerName;
     this.amount = amount;
     this.status = OrderStatus.PLACED; // default status
 }

 // Getter methods
 public int getOrderId() {
     return orderId;
 }

 public String getCustomerName() {
     return customerName;
 }

 public double getAmount() {
     return amount;
 }

 public OrderStatus getStatus() {
     return status;
 }

 // Method to update order status
 public void updateStatus(OrderStatus newStatus) {
     // Prevent invalid transitions (optional advanced logic)
     if (this.status == OrderStatus.CANCELLED) {
         System.out.println("❌ Cannot change status. Order already cancelled.");
     } else if (this.status == OrderStatus.DELIVERED) {
         System.out.println("✅ Order already delivered. Status cannot be changed.");
     } else {
         this.status = newStatus;
         System.out.println("Order status updated to: " + newStatus);
     }
 }

 // Display order details
 public void displayOrderDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Customer Name: " + customerName);
     System.out.println("Amount: $" + amount);
     System.out.println("Current Status: " + status);
 }

 // Main method for demonstration
 public static void main(String[] args) {
     Order order1 = new Order(101, "Ajay Bahadur", 299.99);
     order1.displayOrderDetails();

     System.out.println("\n--- Updating Order Status ---");
     order1.updateStatus(OrderStatus.SHIPPED);
     order1.updateStatus(OrderStatus.DELIVERED);
     order1.updateStatus(OrderStatus.CANCELLED); // should show blocked transition

     System.out.println("\n--- Final Order Details ---");
     order1.displayOrderDetails();
 }
}
