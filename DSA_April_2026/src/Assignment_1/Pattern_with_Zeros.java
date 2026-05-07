package Assignment_1;

import java.util.Scanner;

public class Pattern_with_Zeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= row) {
				if (i > 1 && i < row) {
					System.out.print("0\t");
				} else {
					System.out.print(row + "\t");
				}
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
