package Assignment_1;

import java.util.Scanner;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int Fnum = 0;
		int Snum = 1;
		while (row <= n) {
			// forming star here...
			int i = 1;
			while (i <= row) {
				System.out.print(Fnum + "\t");
				int temp = Fnum + Snum;
				Fnum = Snum;
				Snum = temp;
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
