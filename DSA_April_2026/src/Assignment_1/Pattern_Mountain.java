package Assignment_1;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = 2 * n - 3;

		while (row <= n) {
			int i = 1;
			int num = 1;
			while (i <= star) {
				System.out.print(num + "\t");
				num++;
				i++;
			}

			// spaces
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}

			// star forming
			int k = star;
			if (row == n) {
				k = star - 1; // center duplication avoid
			}

			while (k >= 1) {
				System.out.print(k + "\t");
				k--;
			}

			System.out.println();

			// mirror logic
			if (row <= n) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}

			row++;
		}

	}

}
