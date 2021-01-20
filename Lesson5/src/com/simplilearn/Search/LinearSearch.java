package com.simplilearn.search;

import java.util.Scanner;

public class LinearSearch {
	
	public static int search(int a[], int x) {
		int length = a.length;
		for(int i = 0; i < length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] a = {2, 3, 9, 7, 6, 10, 23, 50};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an element to search");
		int input = scanner.nextInt();
		int result = search(a, input);
		if(result < 0) 
			System.out.println("Element : " + input + " not found int the given array");
		else 
			System.out.println("Element " + input + " found in the array @ index : " + result);
		scanner.close();
	}

}
