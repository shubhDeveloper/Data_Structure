package com.searching;
/*Sequential Search-------

Linear Search = Linear search is a very basic and simple search algorithm. 
In Linear search, we search an element or value in a given array by traversing
the array from the starting, till the desired element or value is found.

Time complexity : O(n)

*/

public class LinearSearch {
	static boolean search(int arr[], int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		boolean b = search(arr, 12);
		System.out.println(b);

	}
}
