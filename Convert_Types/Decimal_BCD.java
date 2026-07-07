import java.util.Scanner;

public class Decimal_BCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number");
        int n = sc.nextInt();

        int temp = n, rev = 0;

        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }

        System.out.print("BCD Equivalent = ");

        while (rev > 0) {
            int digit = rev % 10;

            switch (digit) {
                case 0:
                    System.out.print("0000 ");
                    break;
                case 1:
                    System.out.print("0001 ");
                    break;
                case 2:
                    System.out.print("0010 ");
                    break;
                case 3:
                    System.out.print("0011 ");
                    break;
                case 4:
                    System.out.print("0100 ");
                    break;
                case 5:
                    System.out.print("0101 ");
                    break;
                case 6:
                    System.out.print("0110 ");
                    break;
                case 7:
                    System.out.print("0111 ");
                    break;
                case 8:
                    System.out.print("1000 ");
                    break;
                case 9:
                    System.out.print("1001 ");
                    break;
            }

            rev /= 10;
        }
    }
}
