package Arrays;

import java.util.Scanner;

public class Running_Sum_Array {

	public static void main(String[] args) { 
		Scanner sonu = new Scanner(System.in);
		int len = sonu.nextInt();
		int[] arr = new int[len]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sonu.nextInt(); 
		}
		sonu.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Sum(arr , i) + " ");
		}
	}
	public static int Sum(int[] arr , int idx)
	{
		int i = 0;
		int sum = 0;
		while( i <= idx)
		{
			sum += arr[i];
			i++;
		}
		return sum;
	}

}
