package Arrays;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); 
        reverseArray(arr);
	}
	
	public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
