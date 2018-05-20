package com.myalgo.progs;

public class MergeSort {
	static int [] finaldata;
	public static void main(String[] args) {
		int a[] = { 0, 2, 3, 5, 7, 3 };
		finaldata=new int[a.length];
		mergeSort(a);

	}

	private static void mergeSort(int[] a) {

		System.out.println("Starting the  sorting using merge sort");

		mergeDivide(a, 0, a.length - 1);
		System.out.println("Stopped the sorting completed");

	}

	private static void mergeDivide(int[] a, int low, int high) {
		// THIS METHOD WILL TAKE THE ARRAY AND RECURSSIVE CALL THE MERGE METHOD TO SORT
		// THE DATA GIVE

		if (low < high) {

			int mid = low + (high - low) / 2;

			mergeDivide(a, low, mid - 1);
			mergeDivide(a, mid, high);

			mergeBack(a,low,high);
			
		}

	}

	private static void mergeBack(int[] a, int low, int high) {
		// MERGE THE ARRAYS BACK TOGETHER
		
		
		
		
		
	}

}
