// WAP to find a power a^b (without using power and mul􀆟plica􀆟on opera􀆟on)

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base X and powwer Y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int power = 1, sum = 0;

        for (int i = 1; i <= y; i++) {
            sum = 0;
            for (int j = 1; j <= x; j++) {
                sum += power;
            }
            power = sum;
        }

        System.out.println("Answer : "+(power));
    }
}
