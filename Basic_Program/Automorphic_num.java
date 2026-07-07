// WAP to find weather given number is Automorphic or not.
// An automorphic number is a number whose square ends with the same digits as the number itself.
// For example, 5 is automorphic because 5² = 25, which ends in 5.
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76.

import java.util.Scanner;

public class Automorphic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number :");
        int n = sc.nextInt();

        int sqr = n * n, temp = n, digit = 1;

        while (temp > 0) {
            digit = digit * 10;
            temp = temp / 10;
        }

        if(sqr % digit == n)
            System.out.println("Given number is Automorphic");
        else
            System.out.println("Given number is not Automorphic");
    }
}
