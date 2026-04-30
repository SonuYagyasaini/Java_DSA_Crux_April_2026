package Arrays;

import java.util.Scanner;

public class Max_Value_In_Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		int max = findMaximumValue(arr);
		System.out.println(max);
		scanner.close();
	}

	public static int findMaximumValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
