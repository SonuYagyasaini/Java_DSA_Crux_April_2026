package Arrays;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		if (testCase >= 1 && testCase <= 1000) {
			while (testCase-- > 0) {
				int c1 = sc.nextInt();
				int c2 = sc.nextInt();
				int c3 = sc.nextInt();
				int c4 = sc.nextInt();
				if (c1 >= 1 && c1 <= 1000 && c2 >= 1 && c2 <= 1000 && c3 >= 1 && c3 <= 1000 && c4 >= 1 && c4 <= 1000) {
					int n = sc.nextInt();
					int m = sc.nextInt();
					if (n >= 1 && n <= 1000 && m >= 1 && m <= 1000) {
						int[] rick = new int[n];
						int[] cab = new int[m];
						for (int i = 0; i < rick.length; i++) {
							rick[i] = sc.nextInt();
						}
						for (int i = 0; i < cab.length; i++) {
							cab[i] = sc.nextInt();
						}
						int totalCostRick = 0, totalCostCab = 0, min_cost = 0;
						for (int i = 0; i < n; i++) {
							totalCostRick = totalCostRick + Math.min(c1 * rick[i], c2);
							totalCostRick = Math.min(totalCostRick, c3);
						}
						for (int i = 0; i < m; i++) {
							totalCostCab = totalCostCab + Math.min(c1 * cab[i], c2);
							totalCostCab = Math.min(totalCostCab, c3);
						}
						int cost = 0;
						cost = totalCostRick + totalCostCab;
						min_cost = Math.min(c4, cost);
						System.out.println(min_cost);
					}
				}
			}
		}

	}

}
