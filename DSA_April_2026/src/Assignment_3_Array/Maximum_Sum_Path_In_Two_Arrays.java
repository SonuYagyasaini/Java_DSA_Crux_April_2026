package Assignment_3_Array;

import java.util.Scanner;

public class Maximum_Sum_Path_In_Two_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] a = new int[n];
			int[] b = new int[m];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();

			int i = 0;
			int j = 0;

			long sum1 = 0;
			long sum2 = 0;
			long ans = 0;

			while (i < n && j < m) {

				if (a[i] < b[j]) {
					sum1 += a[i];
					i++;
				} else if (a[i] > b[j]) {
					sum2 += b[j];
					j++;
				} else {

					ans += Math.max(sum1, sum2);

					while (i < n && j < m && a[i] == b[j]) {
						ans += a[i];
						i++;
						j++;
					}

					sum1 = 0;
					sum2 = 0;
				}
			}

			while (i < n) {
				sum1 += a[i++];
			}

			while (j < m) {
				sum2 += b[j++];
			}

			ans += Math.max(sum1, sum2);

			System.out.println(ans);
		}

		sc.close();

	}

}
