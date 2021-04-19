package com.threads;
/****
 * 
 * @author shubham panchal

   * In this post we will understand the second method by performing multithreading by Implementing 
     the Runnable Interface. 
 */
public class UsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My therad "+Thread.currentThread().getName());
		}	
	}
	
    public static void main(String[] args) {
	    UsingRunnableInterface runnable = new UsingRunnableInterface();
    	Thread th = new Thread(runnable);
    	th.start();
    	for(int i=1;i<=5;i++) {
    		System.out.println("Main thread "+Thread.currentThread().getId());
    	}
	}
}
