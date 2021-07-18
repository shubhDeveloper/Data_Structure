package com.threads;
/**********
 * 
 * @author shubham panchal
   1) JVM provides the priorities to each thread and according to these priorities JVM allocates the processor.
   2) Priorities are represents in the form of integer value which range from 1 - 10.
     * 1 - MIN_PRIORITY 
       5 - NORM_PRIORITY 
       10 - MAX_PRIORITY
     * Below are not the priorities 
     * 0, <1, >10
   3) Methods :
     * public final void setPriority(int value);
     * public final int geyPriority();                     
   4) Priorities are inherited from parent thread.
   5) By default main thread priority is 5  


 *///////
public class ThreadPriorities extends Thread{

	public void run() {
		System.out.println("child thread Prioriry : "+Thread.currentThread().getPriority()); // priority 1
	}
	
	public static void main(String[] args) {
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());  //priority 1
		ThreadPriorities thread = new ThreadPriorities();
		thread.start();

	}

}
