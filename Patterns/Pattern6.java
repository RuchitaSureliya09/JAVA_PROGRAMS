// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of row(n) : ");
        int n = sc.nextInt();
        int temp=2*n-1;

        for (int i = 0; i < temp; i++) {
            for (int j = 0; j < temp; j++) {
                int minDist = Math.min(Math.min(i, j), Math.min(temp - 1 - i, temp - 1 - j));

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }
}
