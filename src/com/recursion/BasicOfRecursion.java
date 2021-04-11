package com.recursion;

/***** 
 * @author shubham panchal
 
 # RECURSION :- A function that calls itself is known as recursive function. And this 
                technique is known as recursion. Recursion is the process of repeating
                items in a self similar way.
                
                * This enables the function to repeat itself several times outputing the 
                result and the end of each iteration.
                
                * The recursion continues until some condition is met to prevent it.
                
# ADVANTAGES & DISADVANTAGES OF RECURSIVE FUNCTION :-
                * Recursion makes program elegant and cleaner. Most of the algorithm can
                  be defined recursively which makes it easier to visualize and prove.
                
                * If the speed of the program is vital then you should avoid using recursion 
                  Recursion use more memory and are generally slow insted you can use loops.
                
                * For the most part recursion is slower and takes up more of the stack as well
                  The main advantage of recursion is that for programs like tree traversal it 
                  make the algorithm a little easier of more elegant.   
 */

public class BasicOfRecursion {
	
   public static int sumOfN(int n) {
	   
	   if(n==0) {
		    System.out.println("return 0");
    		return 0;  	
	   }
	   
	   else {
		    System.out.println("value of n : "+n);
    		return n+sumOfN(n-1);
    	}
	   
    }
    public static void main(String[] args) {
	   int sum = sumOfN(5);
	   System.out.println(sum);
	}

}
