package com.sorting;

/**** 
 * @author shubham panchal
 Insertion Sort : Insertion sort is a simple sorting algorithm that works 
                  similar to the way you sort playing cards in your hands.
 
 Time complexity : O(n^2)
 Space complexity : O(1)
 */

public class InsertionSort {

	static int[] sort(int arr[], int size) {
        for(int i=1;i<size;i++) {
        	int temp=i;
        	for(int j=temp-1;j>=0;j--) {
        		if(arr[temp]<arr[j]) {
                    int l = arr[temp];
        			arr[temp] = arr[j];
        			arr[j] = l;       
        			temp = j;
        		}
        	}
        }
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 4, 2, 9, 0, 5, 7, 8 };
		int[] ar = sort(arr, arr.length);
		for (int arrs : ar) {
			System.out.print(arrs + " ");
		}
	}
}
