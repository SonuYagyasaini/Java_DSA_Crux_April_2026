package Arrays;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		int target = sc.nextInt();
		sc.close();
		System.out.println(BinarySearch(arr, target));
	}

	private static int BinarySearch(int[] arr, int target) { 
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = Math.abs(low-high)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}

}
