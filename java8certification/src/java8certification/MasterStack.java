package java8certification;

class Stack {
    int[] a;
    int top;
    int size;

    Stack() {
        size = 5; 
        a = new int[size];
        top = -1;
    }

     void push(int x) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }
        a[++top] = x;
    }
     void pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }
        top--;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return a[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class MasterStack {
    public static void main(String args[]) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();

        System.out.println(s.peek()); 
        s.pop();
        s.display(); 
        s.push(6);
        s.display(); 

        s.push(7); 

        System.out.println(s.peek()); 
    }
}

