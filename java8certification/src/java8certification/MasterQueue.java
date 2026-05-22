package java8certification;

class Queue {
    int front, rear;
    int[] arr;
    int size;

        Queue() {
        front = rear = -1;
        size = 5; 
        arr = new int[size];
    }

     void enqueue(int a) {
        if (rear == size - 1) {
            System.out.println("Queue is full. Cannot add " + a);
            return;
        }
        if (front == -1) front = 0; 
        arr[++rear] = a;
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot remove elements.");
            return;
        }
        front++; 
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class MasterQueue {
    public static void main(String[] args) {
        Queue ob = new Queue();
        
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        
        ob.display();

        ob.dequeue();
        ob.dequeue();

        ob.display();
    }
}
