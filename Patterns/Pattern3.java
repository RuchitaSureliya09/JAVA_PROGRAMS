// *********
// **** ****
// ***   ***
// **     **
// *       *

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of row(n) : ");
        int n = sc.nextInt();
        int temp = n;

        for (int i = 0; i < 2 * temp - 1; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = n - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
