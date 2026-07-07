// WAP for following Scenario.
// Given n rupees and a chocolate price of m for each chocolate, with a wrapper exchange offer of 1
// chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees.

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total money (n): ");
        int n=sc.nextInt();
        System.out.println("Enter price of one chocolate (m): ");
        int m=sc.nextInt();
        System.out.println("Enter wrappers needed for exchange (k): ");
        int k=sc.nextInt();

        int chocolates = n / m;
        int total = chocolates;
        int wrappers = chocolates;

        while (wrappers >= k)
        {
            int extra = wrappers / k;

            total += extra;
            wrappers = (wrappers % k) + extra;
        }

        System.out.println("Total chocolates you can eat : "+total);
    }
}
