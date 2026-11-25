// 1
// 1 * 1
// 1 * 3 * 1
// 1 * 3 * 5 * 3 * 1

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row(n) : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int j = 1; j <= 4 * i - 3; j++) {
                if (j % 2 != 0) {
                    System.out.print(num+" ");

                    if (j < 2 * i - 1)
                        num += 2;
                    else 
                        num -= 2;
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
