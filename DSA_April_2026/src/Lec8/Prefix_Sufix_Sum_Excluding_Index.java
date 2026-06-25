package Lec8;

public class Prefix_Sufix_Sum_Excluding_Index {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		Prefix_Suffix_Sum(arr);

	}

	public static void Prefix_Suffix_Sum(int[] arr) {
		// Prefix sum array excluding index

		int n = arr.length;
		int[] left = new int[n];
		left[0] = 0;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] + arr[i-1];
		}

		// Suffix sum array excluding index

		int[] right = new int[n];
		right[n - 1] = 0;
		
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i+1];
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
