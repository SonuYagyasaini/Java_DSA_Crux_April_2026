package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(sc.nextInt(), 2);
		}
		sc.close();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
