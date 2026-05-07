package Assignment_1;

import java.util.Scanner;

public class Hollow_Diamond_Pattern_Pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;
		while (row <= n) {
			// forming star here....
			int i = 1;
			while (i <= star) {
				System.out.print("*\t");
				i++;
			}
			// forming space here....
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			// forming star here....
			int k = 1;
			if (row == 1 || row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("*\t");
				k++;
			}
			if (row < n / 2 + 1) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;

		}
	}

}
