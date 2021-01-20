package com.simplilearn.arrays;

import java.util.Arrays;

/**
 * We have an array arr[]. We need to find the sum of all the elements in the
 * range L and R where 0 <= L <= R <= n-1. 
 *
 */
public class RangeQueries {
	static int k = 2;
	static int N = 6;
	static long table[][] = new long[N][k + 1];

	/**
	 * Build sparse table, data structure to do fast queries on a static data(predefined elements and they do not change dynamically) 
	 * @param arr
	 * @param n
	 */
	static void buildSparseTable(int arr[], int n) {
		for (int i = 0; i < n; i++)
			table[i][0] = arr[i];
		for (int j = 1; j <= k; j++)
			for (int i = 0; i <= n - (1 << j); i++)
				table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
	}

	static long query(int L, int R) {
		long answer = 0;
		for (int j = k; j >= 0; j--) {
			if (L + (1 << j) - 1 <= R) {
				answer = answer + table[L][j];
				L += 1 << j;
			}
		}
		return answer;
	}

	public static void main(String args[]) {
		int arr[] = { 3, 7, 2, 5, 6, 9 };
		int n = arr.length;
		buildSparseTable(arr, n);
		System.out.println(Arrays.deepToString(table));
		System.out.println(query(2, 5));
	}

}
