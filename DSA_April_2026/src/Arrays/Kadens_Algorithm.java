package Arrays;

import java.util.Scanner;

public class Kadens_Algorithm {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(GetMaxSubArraySum(arr));
	}
	
	public static int GetMaxSubArraySum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { 
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

}
