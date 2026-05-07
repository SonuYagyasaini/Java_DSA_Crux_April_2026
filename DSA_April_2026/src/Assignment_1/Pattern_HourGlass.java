package Assignment_1;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 0;
		int space = 0;
		int star = 2 * n + 1;

		while (row <= 2 * n) {

			// spaces
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// numbers
			int val = n - space;

			int j = 1;
			while (j <= star) {

				System.out.print(val + " ");

				// decreasing till middle
				if (j <= star / 2) {
					val--;
				}
				// increasing after middle
				else {
					val++;
				}

				j++;
			}
			// mirror logic
			if (row < n) {
				space++;
				star -= 2;
			} else {
				space--;
				star += 2;
			}
			System.out.println();
			row++;
		}

	}

}
