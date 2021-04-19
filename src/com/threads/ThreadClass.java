package com.threads;
/****
 * 
 * @author shubham panchal
  
 * Thread Class vs Runnable Interface : 
 * 
1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support 
   multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt 
   methods like yield(), interrupt() etc. that are not available in Runnable interface. 
 
****/



public class ThreadClass extends Thread {

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("My thread "+Thread.currentThread().getName()+" is running state");
		}
	}
	
	public static void main(String[] args) {
		ThreadClass th = new ThreadClass();
        th.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main thread "+Thread.currentThread().getId()+" is running state");
		}
	}
}
