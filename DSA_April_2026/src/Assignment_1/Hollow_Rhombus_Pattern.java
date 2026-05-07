package Assignment_1;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = n;
		int row = 1;
		while (row <= n) {
			// forming space here...
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			// forming star here...
			int j = 1;
			while (j <= star) {
				if (j == 1 || j == star || row == 1 || row == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
		}

	}

}
