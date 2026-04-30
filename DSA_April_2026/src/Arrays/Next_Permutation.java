package Arrays;

import java.util.Scanner;

public class Next_Permutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        int T = scanner.nextInt(); 
        for (int i = 0; i < T; i++) { 
            int N = scanner.nextInt(); 
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            } 
            nextPermutation(arr); 
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        } 
        scanner.close();
    }

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Find the first element from the right that is smaller than the next element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no such element is found, the array is in descending order, so reverse it
        if (i < 0) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Find the smallest element to the right of arr[i] that is greater than arr[i]
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Reverse the subarray from arr[i+1] to arr[n-1]
        reverse(arr, i + 1, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

	}

}





//In this Java implementation, the nextPermutation function finds the next permutation of the input array using the following steps:
//
//Start from the right of the array and find the first element arr[i] that is smaller than the next element arr[i+1].
//If no such element is found, the array is in descending order, so reverse the array and return.
//Find the smallest element arr[j] to the right of arr[i] that is greater than arr[i].
//Swap arr[i] and arr[j].
//Reverse the subarray from arr[i+1] to arr[n-1], where n is the length of the array.
//The reverse function is used to reverse a subarray of the input array.
//
//Finally, the main loop reads the number of test cases, reads the number of digits and the array of digits for each test case, finds the next permutation using the nextPermutation function, and prints the result.
