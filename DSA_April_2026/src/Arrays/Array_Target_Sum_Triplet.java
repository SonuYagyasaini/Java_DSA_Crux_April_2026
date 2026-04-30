package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Triplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		int[] ans = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ans[0] = arr[i];
						ans[1] = arr[j];
						ans[2] = arr[k];
						Arrays.sort(ans);
						System.out.println(ans[0]+", "+ans[1]+" and "+ans[2]);
					}
				}
			}
		}
	}
}



//Optimized way given below : 

//public static void findTriplets(int[] arr, int target) {
//    HashSet<String> tripletSet = new HashSet<String>();
//    
//    // Sort the array
//    Arrays.sort(arr);
//    
//    for (int i = 0; i < arr.length - 2; i++) {
//        int left = i + 1;
//        int right = arr.length - 1;
//        
//        while (left < right) {
//            if (arr[i] + arr[left] + arr[right] == target) {
//                tripletSet.add(arr[i] + ", " + arr[left] + " and " + arr[right]);
//                left++;
//                right--;
//            } else if (arr[i] + arr[left] + arr[right] < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//    }
//    
//    for (String triplet : tripletSet) {
//        System.out.println(triplet);
//    }
//}