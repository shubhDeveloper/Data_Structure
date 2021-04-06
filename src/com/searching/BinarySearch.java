package com.searching;

/*******
 * 
 * intervel search & decrease and concure algo.
 * 
 * Binary Search: Search a sorted array by repeatedly dividing the search
 * interval in half. Begin with an interval covering the whole array. If the
 * value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half. Otherwise narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 * 
 * Time complexity : O(Log n)
 * 
*******/

public class BinarySearch {

	static boolean search(int[] arr, int data) {

		int l1 = 0;
		java.util.Arrays.sort(arr); // sort array
		int l2 = arr.length - 1;
		int mid = l1 + l2 / 2;
		while (l1 <= l2) {
			if (arr[mid] == data) {
				return true;
			} else if (arr[mid] < data) {
				l1 = mid + 1;
			} else {
				l2 = mid - 1;
			}
			mid = (l1 + l2) / 2;
		}
		return false;
	}

	public static void main(String[] args) {
            		int arr[] = { 1, 8, 4, 7, 9, 2222, 6, 52, 66, 77, 88, 99, 100 };
		boolean b = search(arr, 2222);
		System.out.println(b);
	}

}
