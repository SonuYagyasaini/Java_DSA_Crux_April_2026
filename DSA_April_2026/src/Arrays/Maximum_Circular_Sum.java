package Arrays;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int textCases = sc.nextInt();
        while(textCases-->0)
        {
            int arraySize = sc.nextInt();
            int[] arr = new int[arraySize];
            for(int i=0; i<arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println(MaximumSum(arr));
        }
    }

    public static int MaximumSum(int[] arr)
    {
        int linearSum = Kadanes_Algo(arr);
        int totalSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            totalSum+=arr[i];
            arr[i] = arr[i] * -1;
        }
        totalSum += Kadanes_Algo(arr);
        return Math.max(linearSum , totalSum);
    }

    public static int Kadanes_Algo(int[] arr)
    {
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0; i<arr.length; i++)
        {
             curr+= arr[i];
             ans = Math.max(ans , curr);
             if(curr<0)
             {
                 curr = 0;
             }
        }
        return ans;

	}

}
