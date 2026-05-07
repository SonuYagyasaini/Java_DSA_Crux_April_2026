package Assignment_1;

import java.util.Scanner;

public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int space = n / 2;
		int star = 1;
		int row = 1;

		while (row <= n) {

			// spaces
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}

			// stars
			int j = 1;
			while (j <= star) {
				System.out.print("*\t");
				j++;
			}

			System.out.println();

			// mirror logic
			if (row <= n / 2) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}

			row++;
		}

	}

}
