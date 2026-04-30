package Arrays;

import java.util.Scanner;

public class Arrays_Selection_Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int N = scanner.nextInt(); 
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		} 
		selectionSort(arr); 
		for (int num : arr) {
			System.out.println(num + " ");
		} 
		scanner.close();
	}
	public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
