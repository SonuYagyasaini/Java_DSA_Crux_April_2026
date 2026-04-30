package Arrays;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		B_Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "");
		}
	}
	public static void B_Sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int j = 0; j < arr.length-turn; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
	}

}
