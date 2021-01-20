package com.simplilearn.search;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public int search(int[] a, int key) {
		int length = a.length;
		if(a[0] == key) return 0;
		int i = 1;
		while(i < length && a[i] <= key) {
			i = i *2;
		}
		int keyIndex = Arrays.binarySearch(a, i/2, Math.min(i, length), key);
		return keyIndex;
	}
	
	public static void main(String[] args) {
		ExponentialSearch exponentialSearch = new ExponentialSearch();
		int[] a = {2, 3, 6, 7, 9, 10, 23, 50};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an element to search");
		int input = scanner.nextInt();
		int result = exponentialSearch.search(a, input);
		if(result < 0) 
			System.out.println("Element : " + input + " not found in the given array");
		else 
			System.out.println("Element " + input + " found in the array @ index : " + result);
		scanner.close();

	}

}
