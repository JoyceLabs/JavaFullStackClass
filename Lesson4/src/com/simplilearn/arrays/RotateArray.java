package com.simplilearn.arrays;

public class RotateArray {

	private static int[] rotate(int[] input, int k) {
		int size = input.length;
		int[] result = new int[size];
		for(int i = 0; i < k; i++) {
			result[i] = input[size - k + i]; // 7 
		}
		int j = 0;
		for(int i = k; i < size; i++) {
			result[i] = input[j];
			j++;
		}
		return result;
		//System.arraycopy(result, 0, input, 0, size);
	}
	
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int[] result = rotate(input, 2);
		display(result);
	}
	
	private static void display(int[] arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}


}
