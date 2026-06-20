package Assignment_3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSumTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		int[] ans = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ans[0] = arr[i];
						ans[1] = arr[j];
						ans[2] = arr[k];
						Arrays.sort(ans);
						System.out.println(ans[0] + ", " + ans[1] + " and " + ans[2]);
					}
				}
			}
		}

	}

}
