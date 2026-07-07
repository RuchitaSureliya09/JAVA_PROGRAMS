import java.util.Scanner;

public class Octal_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = 0;
        int power = 1;
        int rem;

        while (octal > 0) {
            rem = octal % 10;
            decimal += rem * power;
            power *= 8;
            octal /= 10;
        }

        System.out.println("Decimal Equivalent = " + decimal);
    }
}
