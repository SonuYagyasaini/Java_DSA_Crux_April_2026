package Lec4;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int n = 5;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if(n%i == 0) {
				count++;
				break;
			}
		}
		if(count >= 1) {
			System.out.println("Not prime.");
		}
		else {
			System.out.println("prime.");
		}

	}

}
