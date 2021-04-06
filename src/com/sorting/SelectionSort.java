package com.sorting;
/***** 
 * @author shubham panchal
 
 * Selection sort : The selection sort is a combinations of searching and sorting algo.
 * **
 * It sorts an array by repeatedly finding the minimum element ( considering ascending order )
 * from unsorted part and puting it at the bigning.
 * **
 * In every iteration of selection sort the minimum element ( considering ascending order ) 
 * from unsorted sub array is picked and moved to sorted sub array.
 
 *****/
public class SelectionSort {

	static int[] sort(int[] arr, int size) {
		int min, temp = 0;
		for (int i = 0; i < size; i++) {
			min=i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}  
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 6, 4, 2, 9, 0, 5, 7, 8 };
		int[] ar = sort(arr, arr.length);
		for (int arrs : ar) {
			System.out.print(arrs+" ");
		}

	}
}
