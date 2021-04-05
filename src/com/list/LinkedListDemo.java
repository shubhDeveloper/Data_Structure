package com.list;
public class LinkedListDemo<X> {

	Node<X> head;

	static class Node<X> {
		X data;
		Node<X> next;

		public Node(X data) {
			this.data = data;
			next = null;
		}
	}
//______________________________________________________
//isEmpty function

	boolean isEmpty() {
		return head == null;
	}

//Insert at tail-------------------------------
	void insertAtTail(X data) {
		Node<X> toadd = new Node<X>(data);
		if (isEmpty()) {
			head = toadd;
			return;
		}
		Node<X> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toadd;
	}

// Insert at head-------------------------------
	void insertAtHead(X data) {
		Node<X> addNode = new Node<X>(data);
		addNode.next = head;
		head = addNode;
	}

//Search data-----------------------------------
	boolean search(X d) {

		Node temp = head;
		while (temp != null) {
			if (temp.data == d) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

//Print data------------------------------------
	void print() {
		Node<X> temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

//Delete data-----------------------------------
	void deleteData(X val) {
		Node temp = head;
		if (temp.data == val) {
			temp = temp.next;
		}
		while (temp.next != null) {
			if (temp.next.data == val) {
				temp.next = temp.next.next;
				System.out.println(temp.next.data + " deleted");
			}
			temp = temp.next;
		}
	}

//Insert at median------------------------------
	void insertAtMedian(X val, int n) {
		int i = 1;
		Node addNode = new Node<X>(val);
		Node temp = head;
		while (temp != null) {
			if (n < 1) {
				addNode.next = head;
				head = addNode;
				return;
			}
			if (i == n) {
				addNode.next = temp.next;
				temp.next = addNode;
			}
			i++;
			temp = temp.next;
		}
	}

//print in reverse----------------------------------
	void printReverse() {
		Node temp = head;
		Node prvNode=null;
		Node currNode = temp;
	    Node nextNode;
	    
	    while(currNode != null) {
	    	nextNode = currNode.next;
	    	currNode.next = prvNode;
	    		
	    	prvNode =currNode;
	    	currNode = nextNode;
	    	System.out.println(prvNode.data);
	    }
	    
	}

//________________Stack Operations_________________________________________________
//peek function
	void peek() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println("peeked : " + temp.data);
	}

	public static void main(String ar[]) {
		LinkedListDemo<Integer> ll = new LinkedListDemo<Integer>();
		ll.insertAtTail(123);
		ll.insertAtTail(124);
		ll.insertAtTail(125);
		ll.insertAtTail(126);
		ll.insertAtTail(127);
		ll.print();
//		ll.deleteData(124);
//		ll.peek();
		System.out.println();
//		ll.insertAtMedian(12, 2);
//		ll.print();
		ll.printReverse();
//		System.out.println(ll.search(1));
	}
}
