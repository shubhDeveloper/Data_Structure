package com.sorting;

/****
 * @author shubham panchal 
 * 
 * Bubble sort : Bubble sort is a simple sorting algorithm this sorting
 *               algorithm is comparison based algorithm in which each 
 *               pair of adjacent elements is not in order. 
 *               This algorithm is not suitable for large data sets as 
 *               its average and worst case complexity are of O(n^2) 
 *               where n is number of items.
 ****/
public class BubbleSort {

	static int[] sort(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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
