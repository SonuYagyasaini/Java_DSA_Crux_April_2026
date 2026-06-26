package Lec8;

import java.util.Iterator;

public class Prefix_Sufix_Approach {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		Prefix_Suffix_Sum(arr);

	}

	public static void Prefix_Suffix_Sum(int[] arr) {
		// Prefix sum array including index

		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i];
		}

		// Suffix sum array including index

		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i];
		}
		for (int item : left) {
			System.out.print(item + " ");
		}

		System.out.println();

		for (int item : right) {
			System.out.print(item + " ");
		}
	}

}


//Kis Type Ke Questions Me Suffix Use Hota Hai?
//1. Product Except Self ⭐⭐⭐⭐⭐
//
//Prefix Product + Suffix Product
//
//Leetcode Famous
//
//2. Rain Water
//
//Some approaches
//
//3. Maximum Difference
//Future maximum
//
//Need suffix maximum
//
//4. Maximum Profit Stock
//
//Right side maximum
//
//5. Leaders in Array
//
//Need future maximum
