package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_AggresiveCow_Spoj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while (testCase-- > 0) {
			int len = sc.nextInt();
			int cows = sc.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			MaxDistance(arr , cows);
		}
		sc.close();
	}
	
	//Ques: https://www.spoj.com/problems/AGGRCOW/
	
	public static void MaxDistance(int[] arr , int cows) {
		int ans = 0;
		int low = 0;
		int high = arr[arr.length-1] - arr[0];
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(isPossible(arr , cows , mid) == true) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid - 1;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean isPossible(int[] stall , int cows , int mid){
		int cow = 1;
		int pos = stall[0];
		for (int i = 0; i < stall.length; i++) {
			if(stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow == cows) {
				return true;
			}
		}
		return false;
	}
}


