package Assignment_3_Array;

import java.util.Scanner;

public class AlexGoesShopping {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int [] arr = new int [n];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i]=sc.nextInt();
	        }
	        int q = sc.nextInt();
	        while(q-- >0) {
	            int money = sc.nextInt();
	            int units =sc.nextInt();
	            if(ispossible(arr, money, units)==true) {
	                System.out.println("Yes");
	            }
	            else {
	                System.out.println("No");
	            }
	        }
	        sc.close();
	    }
	    public static boolean ispossible(int []arr,int money,int units) {
	        int count=0;
	        for (int i = 0; i < arr.length; i++) {
	            if(money%arr[i]==0) {
	                count++;
	            }
	        }
	        return count>=units;

	}

}

