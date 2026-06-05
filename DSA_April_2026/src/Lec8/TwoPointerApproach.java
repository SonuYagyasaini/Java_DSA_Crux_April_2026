package Lec8;

import java.util.Scanner;

public class TwoPointerApproach {
// Reversing array using two pointer approach...

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		Reverse(arr);
		Display(arr);
		System.out.println();
		ReverseWithinIndex(arr, 0 , 2);
		Display(arr);
	}

	public static void Reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	// Reverse within some specific index
	public static void ReverseWithinIndex(int[] arr, int i , int j) { 
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
