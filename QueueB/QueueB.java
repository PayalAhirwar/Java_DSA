import java.util.*;
public class QueueB {
   /* static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
    
    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    public static boolean isEmpty() {
        return rear == -1;*/
    
    /*public static void add(int data) {
        if(rear == size-1) {
            System.out.println("queue is full");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
    }
    /*
    public static int remove() {
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        for(int i=0; i<rear; i++) {
            arr[i] = arr[i+1];
        }
        rear = rear+1;
        return front;
    }
    public static int peek() {
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }
    public static boolean isfull() {
        return (rear+1) % size == front;
    }
    public static void addC(int data) {
        if(isfull()) {
            System.out.println("queue is full");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }
    public static int remove() {
        if(isEmpty()) {
            System.out.println("queue is Empty");
            return -1;
        }
        int result = arr[front];
        if(rear == front) {
            rear = front = -1;
        } else {
        front = (front+1)%size;
    }
    return result;
    }
    public static int peek() {
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }
    public static void genBinNum(Queue<Integer>q, int p) {
        Queue<Integer>
        int pow =0;
        int binNum = 0;
        for(int i=1; i<=p; i++) {
            while(i>0) {
            int rem = i%2;
            binNum = binNum + (rem + (int)Math.pow(10,pow));
            pow++;
            i=i/2;
        }
    }
    rear = rear+1;
    arr[rear] = data;
    }*/
   /* public static void reverse(Queue<Integer>q) {
        Stack<Integer> s = new Stack<>();
       int k = 6;
       for(int i=0; i<k; i++) {
        s.push(q.remove());
       }
       if(!s.isEmpty()) {
        q.add(s.pop());
       } else {
        q.add();
       }
       if(q.isEmpty()) {
        return;
       }
    }*/
  public static void maxSubArr(int arr[]) {
    Queue<Integer> q = new LinkedList<>();
    int val = 0;
    int myval = 0;
    while(!q.isEmpty()) {
        for(int i=1; i<=3; i++) {
         if(arr[i]>arr[i+1]) {
            myval = q.peek();
         }
         q.push(Math.max(val,myval));
        }
    }
  }

    
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
       // Queue q = new Queue();
        /*q.addC(1);
        q.addC(2);
        q.addC(3);*/
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(1);
        q.add(4);
        q.add(5);
        q.add(2);
        q.add(3);
        q.add(6);
        maxSubArr(arr);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
