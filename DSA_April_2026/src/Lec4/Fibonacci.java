package Lec4;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5
		
		int n = 9;
		int Fnum = 0;
		int Snum = 1;
		System.out.print(Fnum + " " +Snum+" ");
		for (int i = 2; i < n; i++) {
			int temp = Fnum+Snum; 
			Fnum = Snum;
			Snum = temp;
			System.out.print(Snum+" ");
			
		}
		

	}

}
