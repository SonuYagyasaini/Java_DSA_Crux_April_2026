package Arrays;

import java.util.Scanner;

public class Sort_just_Zeroes_and_Ones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Read the input size N
        int N = scanner.nextInt();

        // Read the array of 0s and 1s
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array using the Dutch National Flag algorithm
        sortZeroesAndOnes(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void sortZeroesAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Use two pointers to partition the array into three sections: 0s, 1s, and unsorted
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
