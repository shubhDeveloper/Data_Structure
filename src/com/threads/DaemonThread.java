package com.threads;
/*******
 * 
 * @author shubham panchal
 
 Daemon thread : 1) Which run in the background of other thread.
                    Use : It provides service to the thread.
                    Example : Garbage collector,spelling checker etc.
                 *  Methods : 
                             1) public final void setDaemon(boolean b);
                             2) public final boolean isDaemon();         
                 3) Its life depends on another thread.         
 */
public class DaemonThread extends Thread {
	
	public void run(){
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread");
		}
		else {
			System.out.println("not Daemon... ");	
		}
	}
	
	public static void main(String[] args) {
		DaemonThread daemon = new DaemonThread();		
		daemon.setDaemon(true);
		daemon.start();
	}

}
