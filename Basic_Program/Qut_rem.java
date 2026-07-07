// WAP to find a quo􀆟ent and reminder of 2 number (bigger number should be divided by lower
// number) and you are not allowed to use a division and quo􀆟ent operator.

import java.util.Scanner;

public class Qut_rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int big = 0, small = 0;

        if (n1 > n2) {
            big = n1;
            small = n2;
        } else {
            big = n2;
            small = n1;
        }

        int qut = 0, rem = big;

        while (rem >= small) {
            rem = rem - small;
            qut++;
        }

        System.out.println("Quotient : "+qut);
        System.out.println("Remainder : "+rem);
    }
}
