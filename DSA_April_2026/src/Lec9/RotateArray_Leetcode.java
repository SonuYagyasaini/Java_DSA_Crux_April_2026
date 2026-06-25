package Lec9;

import java.util.Iterator;

public class RotateArray_Leetcode {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11 };
		int k = 3;
		RotateArray(input, k);

	}

	public static void RotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for (int i = 1; i <= k; i++) {
			int item = arr[n - 1];
			for (int j = n - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = item;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
