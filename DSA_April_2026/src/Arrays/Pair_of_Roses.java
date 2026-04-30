package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while (testCases-- > 0) {
			int numOfRoses = sc.nextInt();
			int[] priceOfRoses = new int[numOfRoses];
			for (int i = 0; i < priceOfRoses.length; i++) {
				priceOfRoses[i] = sc.nextInt();
			}
			int moneyHas = sc.nextInt();
			Arrays.sort(priceOfRoses);
			PairOfRose(priceOfRoses, moneyHas);
		}
		sc.close();
	}

	public static void PairOfRose(int[] arr, int moneyHas) {
		int valueDiff = Integer.MAX_VALUE;
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == moneyHas && Math.abs(arr[i] - arr[j]) < valueDiff) {
					valueDiff = Math.abs(arr[i] - arr[j]);
					idx1 = arr[i];
					idx2 = arr[j];
				}
			}
		}

		System.out.println("Deepak should buy roses whose prices are " + idx1 + " and " + idx2 + ".");
	}
}
