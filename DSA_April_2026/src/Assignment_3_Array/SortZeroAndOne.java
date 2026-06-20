package Assignment_3_Array;

import java.util.Scanner;

public class SortZeroAndOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sortZeroesAndOnes(arr);

		// Print the sorted array
		for (int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();

	}

	public static void sortZeroesAndOnes(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		// Use two pointers to partition the array into three sections: 0s, 1s, and
		// unsorted
		while (left < right) {
			if (arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
			}

			if (arr[left] == 0) {
				left++;
			}

			if (arr[right] == 1) {
				right--;
			}
		}
	}

	// Helper method to swap two elements in an array
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
