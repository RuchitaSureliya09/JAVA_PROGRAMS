// WAP to find weather given number is Ugly or not.
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
// Input: n = 6 Output: true Explana􀆟on: 6 = 2 × 3

import java.util.Scanner;

public class Ugly_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1)
            System.out.println("Given number is Ugly");
        else
            System.out.println("Given number is not Ugly");
    }
}
