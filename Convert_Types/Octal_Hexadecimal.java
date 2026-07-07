import java.util.Scanner;

public class Octal_Hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an octal number: ");
        int octal = sc.nextInt();

        int rem = 0, decimal = 0, power = 1;

        while (octal > 0) {
            rem = octal % 10;
            decimal = decimal + rem * power;
            power = power * 8;
            octal = octal / 10;
        }

        String hex = "\0";
        int i = 0;

        while (decimal > 0) {
            rem = decimal % 16;

            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char) (rem + 55) + hex;// A,B,C,D,E,F

            decimal /= 16;

            i++;
        }

        System.out.println("Hexadecimal Equivalent = "+hex);
    }
}
