package java8certification;

import java.util.ArrayDeque;
import java.util.Deque;

public class SerialGCExample {
	public static void main(String[] args) {
        System.out.println("Starting Serial GC Example...");

        // Enable Serial GC via JVM options
        // Example JVM command: java -XX:+UseSerialGC SerialGCExample

        // Simulate memory usage with object creation
        for (int i = 0; i < 1_000_000; i++) {
            String data = "Object-" + i;
            System.out.println("Data: "+data);
            data = null; // Make the object eligible for garbage collection
            System.out.println("Data: "+data);
        }

        System.out.println("Finished creating objects.");

        // Request garbage collection explicitly
        System.gc();

        System.out.println("Garbage collection completed.");
        
        
        
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("B");
        deque.addFirst("A");
        deque.addLast("C");
        deque.addLast("D");
        System.out.println(deque); // Output: [A, B]
    }

}
