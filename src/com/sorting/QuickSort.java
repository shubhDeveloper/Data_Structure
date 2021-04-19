package com.sorting;

/*****
 * @author shubham panchal
 * 
 *         Quick sort : 1) quick sort is a divide and conquer algorithm. 2) It
 *         picks an element as pivot and partition the given array around the
 *         picked pivot. 3) There are many different versions of quick sort that
 *         picked pivot in different ways. Always picked first element as pivot.
 *         Always picked last element as pivot. Picked a random element as
 *         pivot.
 * 
 *         4) Quick Sort is considered as in-place sorting algorithm. It reduced
 *         the space complexity and removes the use of the auxilary array that
 *         is used in merge sort.
 * 
 *         5) Quick Sort is one of the most efficient sorting algorithm. Time
 *         complexity :- O(nlog(n)). Space complexity :- O(log(n)).
 */

public class QuickSort {

	// partition
	int partition(int[] arr, int low, int high) {

		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}// end of partition

	// quickRecursion
	void quickRecursion(int[] arr, int low, int high) {

		int pi = partition(arr, low, high);

		if (low < pi - 1) {
			quickRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickRecursion(arr, pi, high);
		
		}
	} // End of quickRecursion

	// Print sort array
	void printArray(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	} // end of printArray

	public static void main(String[] args) {
	
		int[] arr = { 12, 33, 11, 16, 7, 3, 1 };
		int length = arr.length;

		QuickSort qs = new QuickSort();
		qs.quickRecursion(arr, 0, length - 1);
		qs.printArray(arr);
	}
}
