package Arrays;

import java.util.Scanner;

public class Sorting_In_Linear_Time {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		sortColors(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void sortColors(int[] arr) 
	{
		 int lo = 0;  
	        int hi = arr.length - 1;   
	        int mid = 0;   
	        while (mid <= hi) 
	        { 
	            if (arr[mid] == 0)
	            { 
	                int temp = arr[lo];
	                arr[lo] = arr[mid];
	                arr[mid] = temp; 
	                lo++; 
	                mid++;
	            } else if (arr[mid] == 1) 
	            { 
	                mid++;
	            } 
	            else 
	            {  
	                int temp = arr[hi];
	                arr[hi] = arr[mid];
	                arr[mid] = temp; 
	                hi--; 
	            }
	        }
    }
}
