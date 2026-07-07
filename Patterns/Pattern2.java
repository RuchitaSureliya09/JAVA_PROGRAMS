// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of row(n) : ");
        int n = sc.nextInt();
        int temp=n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 2 * temp - 1; j > 0; j--) {
                System.out.print("*");
            }
            temp--;

            System.out.println();
        }
    }
}
