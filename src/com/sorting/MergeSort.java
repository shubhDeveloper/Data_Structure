package com.sorting;
/******
 * @author shubham panchal
 
 ** Merge Sort **
 
 Algorithm : Divide And Conquer
 
 Here's how merge sort uses divide and conquer :
 1) divide the unsorted list into n sublists, each containing 1 element.
 2) take adjacent pairs of two singleton list and merge them to form a list
    of 2 elements . n will now convert into n/2 lists of size 2.
 3) Repeat the process till a single sorted list of obtained. 
 
 *****/

class MergeSort {
	int[] array;
	int[] tempMergeArray;
	int length;
	
	public void sort(int arr[]) {
		this.array = arr;
		this.length = arr.length;
        this.tempMergeArray= new int[length];
        divideArray(0,length-1);
	}
	public void divideArray(int lowerInd , int higherInd )
	{
		if(lowerInd < higherInd) {
			int mid = lowerInd+(higherInd-lowerInd)/2;
			divideArray(lowerInd,mid);
			
			divideArray(mid+1,higherInd); 
			
			mergeArray(lowerInd,mid,higherInd);
		}
	}
	public void mergeArray(int lowerInd,int mid,int higherInd) {
		for(int i=lowerInd;i<=higherInd;i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerInd;
		int j = mid+1;
		int k = lowerInd;
		while(i<=mid && j<=higherInd) {
			if(tempMergeArray[i] <= tempMergeArray[j]) {
				array[k]=tempMergeArray[i];
				i++;
			}
			else {
				array[k] =tempMergeArray[j];
				j++;
 			}
			k++;
		}
		while(i<=mid) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}	
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 4, 2, 9, 0, 5, 7, 8 };
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
	}
}
