package Arrays;

import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		sc.close();
		System.out.println(FindIndex(arr , target)); 
	}
	public static int FindIndex(int[] arr , int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target)
			{
				return i;
			}
		} 
		return -1;
	}

}
