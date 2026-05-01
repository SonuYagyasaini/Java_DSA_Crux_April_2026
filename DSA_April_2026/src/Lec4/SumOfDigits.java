package Lec4;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum = 0;
		int n = 97436;
		int originalNum = n;
		while(n > 0)
		{
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		} 
		System.out.println("Sum of the digits " +originalNum + " is: "+ sum); 
	}

}
