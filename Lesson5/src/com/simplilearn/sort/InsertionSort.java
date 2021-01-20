package com.simplilearn.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int[] arr) {
		System.out.println("Insertion sort...");
		int length = arr.length;
		for(int j = 1; j < length; j ++) {
			int temp = arr[j];
			int i = j - 1;
			while((i > -1) && arr[i] > temp) {
				arr[i + 1] = arr[i];
				i --;
			}
			arr[i + 1] = temp;
		}
	}
	
	

	public static void main(String[] args) {
		int[] arr = {25, 17, 32, 13, 2};
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Array after sorting : " + Arrays.toString(arr));

	}

}
