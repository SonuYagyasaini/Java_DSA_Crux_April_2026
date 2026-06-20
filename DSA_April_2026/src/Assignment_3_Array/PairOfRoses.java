package Assignment_3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int money = sc.nextInt();

			Arrays.sort(arr);

			int left = 0;
			int right = n - 1;

			int rose1 = 0;
			int rose2 = 0;

			while (left < right) {

				int sum = arr[left] + arr[right];

				if (sum == money) {

					rose1 = arr[left];
					rose2 = arr[right];

					left++;
					right--;
				} else if (sum < money) {
					left++;
				} else {
					right--;
				}
			}

			System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");

			System.out.println();
		}

		sc.close();

	}

}
