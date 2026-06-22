package Assignment_3_Array;

import java.util.Scanner;

public class VonNeumanLovesBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int binary = sc.nextInt();

            int decimal = 0;
            int power = 0;

            while (binary > 0) {

                int digit = binary % 10;

                decimal += digit * (int)Math.pow(2, power);

                power++;

                binary /= 10;
            }

            System.out.println(decimal);
        }

        sc.close();
    }
}