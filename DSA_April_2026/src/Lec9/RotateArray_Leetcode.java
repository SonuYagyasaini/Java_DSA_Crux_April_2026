package Lec9;

import java.util.Iterator;

public class RotateArray_Leetcode {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		RotateArray(input, k);

	}

//	public static void RotateArray(int[] arr, int k) {     TLE dega leetcode pe not optimised
//		int n = arr.length;
//		k = k % n;
//		for (int i = 1; i <= k; i++) {
//			int item = arr[n - 1];
//			for (int j = n - 2; j >= 0; j--) {
//				arr[j + 1] = arr[j];
//			}
//			arr[0] = item;
//		} 
//		for (int i : arr) {
//			System.out.print(i + " ");
//		} 
//	}

	public static void RotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// startin ke n-k element reverse karna hai
		Reverse(arr, 0, n - k - 1); // op : 4 3 2 1 5 6 7

		// last ke K element reverse karna hai
		Reverse(arr, n - k, n-1); // op: 4 3 2 1 7 6 5

		//
		Reverse(arr, 0, n - 1);   //op : 5 6 7 1 2 3 4

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
