package com.threads;
/******
 * 
 * @author shubham panchal
 
 1) What is Synchronization ?
    It is the process we control the accessability of multiple threads to a particular shared resource.
 
 2) Problems which can occur without Synchronization ?
    * Data Inconsistancy.
    * Thread Interference
 
 3) Advantages of Synchronization ?
    * No data inconsistancy problem.
    * No thread Interference.
 
 4) DisAvdvantages if Synchronization ?
    * Increases the waiting time period of threads.
    * Create Performance Problem  
 
 Types of Synchronization : 
 1) Process Synchronization.(Not present in java multithreading)      
 2) Thread Synchronization [1) Mutual Exclusive 2) Cooperation(Inter Thread communication)]
    1) Mutual Exclusive : can be achieved 3 ways . 1) By Synchronized method 2) By Synchronized Block
                                                   3) static Synchronization
    
****/

///This is the problem we face if we not use synchronization....
///DataInconsistancy.

class Book{

	int totalSeat = 10;
	synchronized public void bookSeat(int seats) { //Synchronized method
		if(totalSeat >= seats) {
			System.out.println(seats+" Seat booked...");
			totalSeat -= seats;
			System.out.println(totalSeat+ " remaining...");
		}
		else {
			System.out.println("No seats available..");
		}
	}
}

public class SynchronizationDemo extends Thread{
	static Book b;
	int seats;
	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		b = new Book();
		SynchronizationDemo sd = new SynchronizationDemo();
		sd.seats = 5;
		sd.start();
		
		SynchronizationDemo sd1 = new SynchronizationDemo();
		sd1.seats = 5;
		sd1.start();
	}
}
