package com.simplilearn.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int[] arr) {
		System.out.println("Selection sort..");
		int length = arr.length, temp = 0;
		for(int i = 0; i < length - 1; i++) {
			for(int j = i + 1; j < length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 2, 4};
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Array after sorting : " + Arrays.toString(arr));
	}

}
