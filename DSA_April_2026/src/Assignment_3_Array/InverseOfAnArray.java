package Assignment_3_Array;

import java.util.Scanner;

public class InverseOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = Inverse(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static int[] Inverse(int[] input)
	{
		int[] ans = new int[input.length];
		for (int i = 0; i < ans.length; i++) {
			ans[input[i]] = i;
		}
		return ans;
	}

}
