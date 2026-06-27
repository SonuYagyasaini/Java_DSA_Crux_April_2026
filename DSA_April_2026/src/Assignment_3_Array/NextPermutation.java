package Assignment_3_Array;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();

		nextPermutation(nums);
	}

	static void reverse(int left, int right, int[] nums) {

		while (left < right) {

			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
	}

	static void nextPermutation(int[] nums) {

		int pos = -1;

		// Step 1 : Find Pivot
		for (int i = nums.length - 2; i >= 0; i--) {

			if (nums[i] < nums[i + 1]) {
				pos = i;
				break;
			}
		}

		// Step 2 : If no pivot
		if (pos == -1) {

			reverse(0, nums.length - 1, nums);

			for (int x : nums)
				System.out.print(x + " ");

			return;
		}

		// Step 3 : Find next greater element
		for (int i = nums.length - 1; i > pos; i--) {

			if (nums[i] > nums[pos]) {

				int temp = nums[i];
				nums[i] = nums[pos];
				nums[pos] = temp;
				break;
			}
		}

		// Step 4 : Reverse suffix
		reverse(pos + 1, nums.length - 1, nums);

		for (int x : nums)
			System.out.print(x + " ");
	}
}
