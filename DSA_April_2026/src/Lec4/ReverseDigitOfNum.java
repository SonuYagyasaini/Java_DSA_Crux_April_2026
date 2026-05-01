package Lec4;

public class ReverseDigitOfNum {

	public static void main(String[] args) {
		int rev = 0;
		int n = 97436; 
		while(n > 0)
		{
			int rem = n%10;
			rev = (rev*10) + rem; // rem ko dahai banake rem jod rahe
			n = n/10;
		} 
		System.out.println(rev); 

	}

}
