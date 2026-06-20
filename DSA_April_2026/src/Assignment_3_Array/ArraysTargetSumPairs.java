package Assignment_3_Array;

import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] + arr[j] == target) {

					if (arr[i] < arr[j]) {
						System.out.println(arr[i] + " and " + arr[j]);
					} else {
						System.out.println(arr[j] + " and " + arr[i]);
					}
				}
			}
		}

		sc.close();

	}

}
