package Arrays;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int candidate = findMajorityElement(arr);

        System.out.println(candidate);
        scanner.close();
    }

    public static int findMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 1;

        // Find the majority element using Moore's Voting Algorithm
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majorityElement = arr[i];
                count = 1;
            }
        }

        // Verify the found majority element
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return majorityElement;
        } else {
            return -1; // No majority element found
        }

	}

}
