package Arrays;

import java.util.Scanner;

public class Product_Array_Except_Self {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long p[] = exceptself(a);
		for (int i = 0; i < n; i++) {
			System.out.print(p[i] + " ");
		}
	}

	public static long[] exceptself(int a[]) {
		long left[] = new long[a.length];
		long right[] = new long[a.length];
		left[0] = 1;
		right[a.length - 1] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * a[i - 1];
		}
		for (int i = a.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * a[i + 1];
		}
		long prod[] = new long[a.length];
		for (int i = 0; i < prod.length; i++) {
			prod[i] = left[i] * right[i];
		}
		return prod;
	}
}