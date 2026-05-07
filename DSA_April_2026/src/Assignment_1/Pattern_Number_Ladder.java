package Assignment_1;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int num = 1;
		while (row <= n) {
			int i = 1;
			while (i <= row) {
				System.out.print(num + "\t");
				num++;
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
