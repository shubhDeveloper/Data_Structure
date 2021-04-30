package com.stack;

/*****
 * 
 * @author shubham panchal
 
 Stack : stack is linear data structure which operates in LIFO (Last In First Out) 
         or FILO (First In Last Out).
         
         * It is named stack as it behaves like a real world stack,
         For Example : a deck of cards or a pile of plates, etc.
         
         * stack is an abstract data type with a bounded (Predefined) capacity.
         
         * It is a simple data structure that allow adding and removing elements
           in particular order.
         
         * The order may be LIFO (Last In First Out) or FIFO(First In First Out).
  
 Operations : 
         * push() : Items are added on top of the stack.
         * pop() : Item are removed from top of the stack.
         * isEmpty() : Tells if the stack is empty or not.
         * isFull() : Tells if the stack is full.
         * peek() : Access the item at the i position.
         * count() : get the number of item in the stack.
         * change() : Change the item at the i position.
         * display() : Display all item in the stack.            
 */


class StackUsingArray {
    
	static private int top=-1;
	static private int[] arr = new int [5];
	
	public StackUsingArray() {
		for(int i=0;i<5;i++) {
			arr[i] = 0;
		}
	}
//	isEmpty
	static boolean isEmpty() {
		if(top == -1) 
			return true;
		else
			return false;
	}
//	isFull
	static boolean isFull() {
		if(arr[4] != 0) 
			return true;
		else
			return false;
	}
//	push
	static void push(int data) {
		if(isFull()) {
			System.out.println("stack overflow....");
			return;
		}
		else {
			top++;
			arr[top] = data;
			System.out.println(data+" pushed..");
		}
	}
//	pop
	static int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty....");
			return 0;
		}
		else {
			int popValue = arr[top];
			arr[top] = 0;
			top--;
			System.out.println(popValue+ " poped");
			return popValue;
		}
	}
//	peek
	static int peek() {
		if(isEmpty()) {
			System.out.println("Nothing to peek....");
			return 0;
		}
		else {
			int peekVal = arr[top];
			System.out.println(peekVal+" peeked");
			return peekVal;
		}
	}
//	count
	static int count() {
		if(isEmpty()) {
			System.out.println("stack overflow....");
			return 0;
		}
		else {
			int c = top+1;
			System.out.println(c+" count");
			return c;
		}
	}
//	change
	static void change(int index,int data) {
		if(isEmpty()) {
			System.out.println("stack is empty...");
		}
		else {
		    arr[index] = data;
		    System.out.println(data+" changed");
		}
	}
//	display
	static void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty...");
			return;
		}
		else {
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println("|   "+arr[i]+"   |");
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2;i<arr.length+2;i++) {
			push(i);
		}
		pop();
		pop();
		peek();
		count();
		change(1 , 123);
		display();
	}
}
