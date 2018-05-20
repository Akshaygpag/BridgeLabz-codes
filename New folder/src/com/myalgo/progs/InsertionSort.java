package com.myalgo.progs;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 2, 7, 9, 3, 1 };
		printArray(a);
		for (int i = 0; i < a.length - 1; i++) {

			int j = i + 1;
			System.out.println("i : " + i + " j : " + j);

			if (a[i] > a[j]) {

				swapTillFits(a, i, j);
				System.out.println("Value after swap i :" + i);
			}

		}
		printArray(a);
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for (int i : a) {

			System.out.print(i + " ");

		}
		System.out.println();

	}

	private static void swapTillFits(int[] a, int i, int j) {

		while (j != 0) {
			if (a[i] > a[j]) {

				swap(a, i, j);
				i--;
				j--;

			} else {
				break;
			}

		}

	}

	private static void swap(int[] a, int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
