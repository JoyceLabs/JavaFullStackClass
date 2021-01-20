package com.simplilearn.arrays;

import java.util.Arrays;

public class KthSmallest {

	int find(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println("After sort : ");
		display(arr);
		return arr[k - 1];
	}

	public static void main(String[] args) {
		KthSmallest kthSmallest = new KthSmallest();
		int arr[] = { 12, 3, 5, 7, 4, 19, 26 };
		display(arr);
		int result = kthSmallest.find(arr, 7);
		System.out.println("Result : " + result);
	}

	private static void display(int[] arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
