package com.linkedlist;

public class SinglyLinkedList<X> {
	
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

//insertAtHead
	void insertAtTail(X data) {
		Node<X> toAdd = new Node<X>(data);
		if(isEmpty()) {
			head = toAdd;
		    return;
		}
		Node<X> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
//insertAtTail	
	void insertAtHead(X val) {
		Node<X> toAdd = new Node<X>(val);
		toAdd.next = head;
		head = toAdd;
		
 	}
//deleteNode
	void deleteNode(X val) {
		Node<X> temp = head;
		if(temp.data == val) {
			temp = temp.next;
		}
		while(temp.next != null) {
			if(temp.next.data == val) {
				temp.next = temp.next.next;
				System.out.println(temp.next.data +" Deleted");
			}
			temp = temp.next;
		}
	}
//printData
	void printData() {
		Node<X> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
//updataData
	void updateData(int i,X val) {
		Node<X> temp = head;
//		Node<X> toAdd = new Node<X>(val);
	    int a=0;
		while(temp != null) {
			a++;
			if(i == a) {
				System.out.println("data changed to "+temp.data+" to "+val);
				temp.data = val;
				return;
			}
			temp = temp.next;
		}
	}
	

	public static void main(String[] args) {
       SinglyLinkedList<Integer> sl = new SinglyLinkedList<Integer>();
       sl.insertAtTail(123);
       sl.insertAtTail(124);
       sl.insertAtHead(122);
//       sl.insertAtHead("shubham");
       sl.updateData(3,12345);
       sl.printData();
	}

}
