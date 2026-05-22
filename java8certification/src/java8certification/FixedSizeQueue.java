package java8certification;

import java.util.Queue;
import java.util.ArrayDeque;

public class FixedSizeQueue {
    private Queue<Integer> queue;
    private int capacity;

    public FixedSizeQueue(int capacity) {
        this.queue = new ArrayDeque<>(); 
        this.capacity = capacity;
    }

    public void enqueue(int element) {
        if (queue.size() < capacity) {
            queue.add(element);
            System.out.println("Added: " + element);
        } else {
            System.out.println("Queue is full! Cannot add: " + element);
        }
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        } else {
            System.out.println("Queue is empty! Nothing to remove.");
        }
    }

    public void displayQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        FixedSizeQueue fixedQueue = new FixedSizeQueue(3);

        fixedQueue.enqueue(10);
        fixedQueue.enqueue(20);
        fixedQueue.enqueue(30);
        fixedQueue.enqueue(40); 

        fixedQueue.displayQueue();

        fixedQueue.dequeue();
        fixedQueue.dequeue();

        fixedQueue.displayQueue();
    }
}
