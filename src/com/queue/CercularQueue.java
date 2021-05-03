package com.queue;

public class CercularQueue {

	private int arr[] = new int[5];
	private int rear = -1;
	private int front = -1;
	int itemCount=0;

	public CercularQueue() {
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=0;
	     }
	}
//isEmpty
	boolean isEmpty() {
		if (rear == -1 && front == -1) {
			return true;
		} else {
			return false;
		}
	}
//isFull
	boolean isFull() {
		if ((rear+1)%arr.length == front) {
			return true;
		} else {
			return false;
		}
	}
//enqueue
	void enqueue(int data) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			rear++;
			front++;
			arr[rear] = data;
		} else {
			rear = (rear+1)%arr.length;
			arr[rear] = data;
		}
		itemCount++;
	}

//dequeue
	int dequeue() {
		int x = 0;
		if (isEmpty()) {
			System.out.println("Queue is empty...");
			return 0;
		} else if (front == rear) {
			x = arr[rear];
			front = -1;
			rear = -1;
			itemCount++;
			arr[front] = 0;
			return x;
		} else {
			x = arr[front];
			arr[front] = 0;
			itemCount++;
			front = (front+1)%arr.length;
			return x;
		}
	}

//count
	int count() {
		return itemCount;
	}

//display
	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("|   " + arr[i] + "   |");
		}
	}

	public static void main(String[] args) {
         CercularQueue cq = new CercularQueue();
         cq.enqueue(123);
         cq.enqueue(1234);
         cq.enqueue(12);
         cq.enqueue(12345);
         cq.enqueue(1);
         cq.dequeue();
         cq.enqueue(99);
         cq.display();
         
	}

}
