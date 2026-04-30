package Lec1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the number ");
			int num = sc.nextInt();
			if(num >= 400 && num <= 500)
			{
				System.out.println("Car");
			}
			else if(num >= 85 && num <= 105)
			{
				System.out.println("Bike");
			}
			else if(num >= 13 && num <= 205)
			{
				System.out.println("Kurkure");
			}
			else
			{
				System.out.println("Happy Birthday!!");
			} 
		} 
		
	}

}
