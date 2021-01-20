package com.simplilearn;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] ints = new int[2][3];//2 * = 6 * 4 = 24
		ints[0][0] = 200;
		ints[0][1] = 300;
		ints[0][2] = 300;
		ints[1][0] = 400;
		ints[1][1] = 500;
		ints[1][2] = 1000;
		System.out.println("Row length : " + ints.length);
		System.out.println("Column length : " + ints[0].length);
		int size = ints.length;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < ints[i].length; j ++) {
				System.out.println("Element : " + ints[i][j]);
			}
		}
		
		int[][] ints1 = {{1, 2, 3}, {4, 5, 6}};
		//Jagged array
		int[][] ints2 = {{11, 12}, {13, 14, 15}};
		System.out.println("Row length : " + ints2.length);
		System.out.println("Column length : " + ints2[0].length);
		System.out.println("Column length : " + ints2[1].length);
	}

}
