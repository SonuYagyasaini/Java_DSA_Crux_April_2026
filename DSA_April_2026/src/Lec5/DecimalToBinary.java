package Lec5;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n = 37;
		int sum = 0;
		int mul = 1;
		while(n > 0)
		{
			int rem = n%2;
			sum = sum+rem*mul;
			mul *= 10;
			n = n/2;
		}
		System.out.println(sum);

	}

}
