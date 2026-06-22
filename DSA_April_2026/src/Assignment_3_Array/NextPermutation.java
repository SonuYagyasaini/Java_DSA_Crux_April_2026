package Assignment_3_Array;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		NextPermutation(arr);

	}
	
	public static void reverse(int start, int end, int[] nums) {
        while(start < end) {
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start++;
             end--;
        }
    }
    public static void NextPermutation(int[] nums) {
        int pos = -1;
        for(int i = nums.length-2; i >= 0; i--) {
            int curr = nums[i];
            int prev = nums[i+1];
            if(curr < prev) {
                pos = i;
                break;
            }
        }
        if(pos == -1) {
            // i need to reverse the whole array
            reverse(0, nums.length-1, nums);
            return;
        }
        for(int start = nums.length-1; start > pos; start--) {
            if(nums[start] > nums[pos]) {
                int temp = nums[start];
                nums[start] = nums[pos];
                nums[pos] = temp;
                break;
            }
        }
        reverse(pos+1, nums.length-1, nums);
        for(int num : nums)
        {
        	System.out.print(num+" ");
        }
    } 
}

