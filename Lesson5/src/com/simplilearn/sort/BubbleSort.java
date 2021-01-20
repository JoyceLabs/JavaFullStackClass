package com.simplilearn.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr) {
		System.out.println("bubble sort...");
		int length = arr.length, temp = 0;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length -1; j ++) {
				if(arr[j] > arr[j + 1]) {//1st - arr[0] > arr[1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {25, 17, 32, 13, 2};
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Array after sorting : " + Arrays.toString(arr));

	}

}
