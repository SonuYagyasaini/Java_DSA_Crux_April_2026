package Assignment_1;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;
		int row = 1;
		while (row <= n) {
			// forming space here....
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// forming star here....
			int j = 1;
			int prakatHo = row;
			while (j <= star) {
				System.out.print(prakatHo + "\t");
				if (j < star / 2 + 1) { // changing on middle column
					prakatHo++;
				} else {
					prakatHo--;
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			star += 2;
		}

	}

}
