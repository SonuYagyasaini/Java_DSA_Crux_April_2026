package Assignment_3_Array;

import java.util.Scanner;

public class Von_Loves_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			String binary = sc.next();

			int decimal = 0;

			for (int i = 0; i < binary.length(); i++) {
				decimal = decimal * 2 + (binary.charAt(i) - '0');
			}

			System.out.println(decimal);
		}

		sc.close();

	}

}
