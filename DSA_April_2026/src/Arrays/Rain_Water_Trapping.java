package Arrays;

import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            // Read the number of towers
            int N = scanner.nextInt();
            
            // Read the heights of the towers
            int[] heights = new int[N];
            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }
            
            // Calculate the water collected
            int waterCollected = calculateWaterCollected(heights);
            
            // Print the result
            System.out.println(waterCollected);
        }

        scanner.close();
    }

    public static int calculateWaterCollected(int[] heights) {
        int left = 0, right = heights.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterCollected = 0;

        while (left < right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    waterCollected += leftMax - heights[left];
                }
                left++;
            } else {
                if (heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    waterCollected += rightMax - heights[right];
                }
                right--;
            }
        }
        
        return waterCollected;

	}

}
