package Lec8;

import java.util.Scanner;

public class FindNumberLinearSearch {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int[] arr =  {3 , 5 , 6, 2 , 4 , 16 , 7 ,8 , 9};
		int item = 7;
		System.out.println();
		//Display(arr); 
		System.out.println(LinearSearch(arr , item));
		System.out.println(FindMax(arr));
	}
	
	public static void Display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int LinearSearch(int[] arr , int item)
	{
		for (int i = 0;  i < arr.length; i++) {
			if(arr[i] == item)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int FindMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
}
