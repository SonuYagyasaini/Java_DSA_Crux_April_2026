package Lec5;

import java.util.*;

public class GenericConversion {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int n = sc.nextInt();
			System.out.println("enter source");
	        int source = sc.nextInt();
	        System.out.println("enter destination");
	        int dest = sc.nextInt(); 
	        int sum = 0;
	        int mul = 1;
	        while (n > 0) {
	            int rem = n % dest;     
	            sum = sum + rem * mul; 
	            mul *= source;             
	            n = n / dest;            
	        }

	        System.out.println(sum);

	}

}
