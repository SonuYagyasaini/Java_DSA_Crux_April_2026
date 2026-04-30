package Arrays;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int testCases  = sc.nextInt();
        while(testCases-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for(int i = 0; i<arr1.length; i++)
            {
                arr1[i] = sc.nextInt();
            }
            for(int j = 0; j<arr2.length; j++)
            {
                arr2[j] = sc.nextInt();
            }
            System.out.println(MaximumSumPath(arr1 , arr2));
        }
    }

    public static int MaximumSumPath(int[] arr1 , int[] arr2)
    {
        int ans = 0;
        int sum1 = 0;
        int sum2 = 0;

        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                j++;
            }
            else
            {
                int total1 = 0;
                for(int k =sum1; k<=i; k++)
                {
                    total1+= arr1[k];
                }
                int total2 = 0;
                for(int k =sum2; k<=j; k++)
                {
                    total2+= arr2[k];
                }
                ans = ans+Math.max(total1 , total2);
                i++;
                j++;
                sum1 = i;
                sum2 = j;
            }
        }
                int total1 = 0;
                for(int k =sum1; k<arr1.length; k++)
                {
                    total1+= arr1[k];
                }
                int total2 = 0;
                for(int k =sum2; k<arr2.length; k++)
                {
                    total2+= arr2[k];
                }
                ans = ans+Math.max(total1 , total2);
                return ans;

	}

}
