package Lec6;

import java.util.Scanner;

public class DataInput_DataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = 032;
		System.out.println(n);
		int a = sc.nextByte();
		int b = sc.nextShort();
		int c = sc.nextInt();
		String d = sc.next(); 
		sc.close();

	}

}
