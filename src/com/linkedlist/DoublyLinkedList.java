package com.linkedlist;

/******
  
 * @author shubham panchal
 
         Singly LinkedList : A doubly linked list is different from a singly
         linked list in a way that each node has an extra pointer that points
         to the previous node together with the next pointer and data similar
         to singly linked list.
  
 ******/

class Node {
	public int data;
	Node next;
	Node prev;

	Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
}

public class DoublyLinkedList {

	public Node head;
	
//isEmpty function
	boolean isEmpty() {
		return head == null;
	}

//insertAtTail
	void insertAtTail(int val) {

		if (head == null) {
			insertAtHead(val);
			return;
		}

		Node toAdd = new Node(val);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		toAdd.prev = temp;
	}

//InsertAtHead
	void insertAtHead(int val) {
		Node toAdd = new Node(val);
		toAdd.next = head;
		if (head != null) {
			head.prev = toAdd;
		}

		head = toAdd;
	}

//deleteAtHead
	void deleteAtHead() {
		Node toDelete = head;
		head = head.next;
		head.prev = null;

	}

//delete
	void delete(int key) {

		if (key == 1) {
			deleteAtHead();
			return;
		}

		Node temp = head;
		int count = 1;

		while (temp != null && count != key) {
			temp = temp.next;
			count++;
		}

		temp.prev.next = temp.next;

		if (temp.next != null) {
			temp.next.prev = temp.prev;
		}
	}

//display
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
//printReverse(Example of previous node)
	void printReverse() {
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		while(temp.prev != null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.print(temp.data);
		
	}

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertAtTail(1);
		dl.insertAtTail(2);
		dl.insertAtTail(3);
		dl.insertAtTail(4);
		dl.insertAtTail(5);
//		dl.display();
//		dl.delete(2);
		dl.display();
		dl.printReverse();
//		System.out.println(dl.isEmpty());
	}

}
