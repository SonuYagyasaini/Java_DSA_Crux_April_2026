package Assignment_1;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		;
		int row = 1;
		int space = n - 1;
		int star = 1;
		int num = 1;
		while (row <= 2 * n - 1) {
			// space forming....
			int i = 1;

			while (i <= space) {
				System.out.print("\t");
				i++;
			}

			// star forming...
			int j = 1;
			int sonu = num;
			while (j <= star) {
				System.out.print(sonu + "\t");
				if (j < star / 2 + 1) {
					sonu++;
				} else {
					sonu--;
				}
				j++;
			}
			// mirror forming...
			if (row < n) {
				space--;
				star += 2;
				num++;
			} else {
				space++;
				star -= 2;
				;
				num--;
			}

			System.out.println();
			row++;
		}

	}

}
