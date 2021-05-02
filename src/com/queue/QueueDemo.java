package com.queue;

/****
 * @author shubham panchal
 
Queue : Queue is a linear data structure which operates in a FIFO(First In First Out)
        or LILO(Last In Last Out).
         
       * It is named queue as it behaves like a real world queue. 
         example : Queue(Line) of cars in a single lane. 
       * Queue is an abstract data type with a bounded (predefined) capacity.
       * It is simple data structure that allows adding and removing elements in a particular order.
       * The order is FIFO(First In First Out) and LIFO(Last In Last Out).

--->>>> Elements are added at one end (rear end). This is called enqueue.
--->>>> Elements are removed from the other end (front/head end). This is called dequeue.

Standard queue operations : 
       1) enqueue() = Elements are added from one end(Rear back)
       2) dequeue() = Elements are removed from one end (head/end).
       3) isFull() = return true if queue is full.
       4) isEmpty() = return true if queue is empty.
       5) count() = gets count of total item in queue.

 *****/

public class QueueDemo {

	private int arr[] = new int[5];
	private int rear=-1;
	private int front=-1;
	
	public QueueDemo() {
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=0;
	     }
	}
//isEmpty
	boolean isEmpty() {
		if(rear == -1 && front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
//isFull
	boolean isFull() {
		if(rear == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
//enqueue
	void enqueue(int data) {
		if(isFull()) {
			return;
		}
		else if(isEmpty()) {
			rear++;
			front++;
			arr[rear] = data;
		}
		else {
			rear++;
		}
		arr[rear] = data;
	}
//dequeue
	int dequeue() {
		int x=0;
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return 0;
		}
		else if(front == rear) {
			x = arr[rear];
			front = -1;
			rear = -1;
			arr[front] = 0;
			return x;
		}
		else {
			x = arr[front];
			arr[front]=0;
			front++;
			return x;
		}
	}
//count
	int count() {
		return rear;
	}
//display
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("|   "+arr[i]+"   |");
		}
	}

	public static void main(String[] args) {
		QueueDemo qd = new QueueDemo();
		qd.enqueue(123);
		qd.enqueue(124);
		qd.enqueue(125);
		qd.enqueue(126);
		int deq = qd.dequeue();
		int deq1 = qd.dequeue();
		System.out.println(deq);
		System.out.println(deq1);
		qd.display();
	}

}
