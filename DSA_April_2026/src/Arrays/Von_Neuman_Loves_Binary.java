package Arrays;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] ar = new int[arraySize];
        int i;
        for (i = 0; i < arraySize; i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int w=0; w<=ar.length-1; w++)
        {
            int sum = 0;
            int Z = ar[w];
            while (Z != 0)
            {
                int count =0;
                while (Z>0)
                {
                    int rem = Z % 10;
                    sum = (int)(sum + (rem * Math.pow(2, count)));
                    Z = Z / 10;
                    count++;
                }
            }
            System.out.println(sum);
            }
    }
}
