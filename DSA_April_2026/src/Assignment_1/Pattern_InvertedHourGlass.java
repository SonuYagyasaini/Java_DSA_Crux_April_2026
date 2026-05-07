package Assignment_1;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = 2 * n - 1;

		while (row <= 2 * n + 1) {

			// left star forming.....
			int i = 1;
			int num = n;
			while (i <= star) {
				System.out.print(num + " ");
				num--;
				i++;
			}

			// spaces forming here....
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// right star forming...
			int k = 1;
			int val = num + 1;
			while (k <= star) {
				// avoid duplicate center row
				if (row == n + 1 && k == 1) {
					val++;
					k++;
					continue;
				}
				System.out.print(val + " ");
				val++;
				k++;
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
