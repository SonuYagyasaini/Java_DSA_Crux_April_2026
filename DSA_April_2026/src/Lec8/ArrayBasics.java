package Lec8; 
import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} 
		System.out.println();
		Display(arr);
		System.out.println();
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr , 0 , 1);
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static void Display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Swap(int[] arr , int a , int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
