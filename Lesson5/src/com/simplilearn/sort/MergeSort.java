package com.simplilearn.sort;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] arr, int n) {
		if (n == 1) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = arr[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(arr, l, r, mid, n - mid);
	}
	
	public static void merge(int[] arr, int[] l, int[] r, int low, int high) {
		int i = 0, j = 0, k = 0;
		while (i < low && j < high) {
			if (l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
				k++;
			} else {
				arr[k] = r[j];
				k++;
				j++;
			}
		}
		while (i < low) {
			arr[k] = l[i];
			k++;
			i++;
		}
		while (j < high) {
			arr[k++] = r[j];
			k++;
			j++;
		}
	}
		
	
	public static void main(String[] args) {
		int a[] = {12, 11, 13, 7, 6, 14};
		System.out.println("Merge sort....");
		System.out.println("Before sorting : " + Arrays.toString(a));
		mergeSort(a, a.length);
		System.out.println("After sorting : " + Arrays.toString(a));
	}

}
