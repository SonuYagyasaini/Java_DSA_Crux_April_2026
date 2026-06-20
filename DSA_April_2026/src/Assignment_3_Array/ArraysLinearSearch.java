package Assignment_3_Array;

import java.util.Scanner;

public class ArraysLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
