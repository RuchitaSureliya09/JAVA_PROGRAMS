// * * * * * * *
//  *        *
//    *   *
//      *
//    *   *
//   *       *
// * * * * * * *

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        int temp = 2 * n - 1;
        int a=0;

        for (int i = 1; i <= temp; i++) {
            for (int j = 1; j <= temp; j++) {
                if (i == j || i == 1 || i == temp || j==temp-a)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            a++;
            System.out.println();
        }
    }
}
