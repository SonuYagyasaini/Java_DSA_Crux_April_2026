package Lec19;

public class FibonacciByRecursion {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.print(FibonacciSeries(i) + " ");
		}
	}

	public static int FibonacciSeries(int n) {
		if (n == 0 || n == 1)
			return n;

		return FibonacciSeries(n - 1) + FibonacciSeries(n - 2);
	}

}
