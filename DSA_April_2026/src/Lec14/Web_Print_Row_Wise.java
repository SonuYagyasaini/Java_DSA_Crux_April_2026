package Lec14;

import java.util.Scanner;

public class Web_Print_Row_Wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		sc.close();
		WebPrint_Col_Wise(arr);

	}
	
	public static void WebPrint_Col_Wise(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if(col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}
			else {
				for (int row = arr.length-1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

}
