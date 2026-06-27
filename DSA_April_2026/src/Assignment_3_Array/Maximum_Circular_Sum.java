package Assignment_3_Array;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			int total = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				total += arr[i];
			}

			int maxNormal = kadaneMax(arr);

			// All numbers are negative
			if (maxNormal < 0) {
				System.out.println(maxNormal);
				continue;
			}

			int minSubarray = kadaneMin(arr);

			int maxCircular = total - minSubarray;

			System.out.println(Math.max(maxNormal, maxCircular));
		}

		sc.close();
	}

	public static int kadaneMax(int[] arr) {
		int maxEnding = arr[0];
		int maxSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			maxEnding = Math.max(arr[i], maxEnding + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEnding);
		}

		return maxSoFar;
	}

	public static int kadaneMin(int[] arr) {
		int minEnding = arr[0];
		int minSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			minEnding = Math.min(arr[i], minEnding + arr[i]);
			minSoFar = Math.min(minSoFar, minEnding);
		}

		return minSoFar;

	}

}
