package com.simplilearn.arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int i1= 10, i2 = 20, i3=30, i4 = 40, i5 = 50;
		int[] intArray = {10, 20, 30, 40, 50};
		
		//Way 1
		int[] a1 = new int[-5];
		a1[0] = 100;
		a1[1] = 200;
		for(int elt : a1) {
			System.out.println(elt);
		}
		//Way 2
		int a2[] = new int[5];
		//way 3
		int[] a3 = {1, 2, 3, 4, 5};// 5 *4 = 20
		int size = a3.length;
		for(int i = 0; i < size; i++) {
			System.out.println(a3[i]);
		}
		System.out.println(a3[5]);
		//Way 4
		int a4[] = new int[] {1, 2, 3, 4, 5};
		char chars[] = {'A', 'B'};
		
	}

}
