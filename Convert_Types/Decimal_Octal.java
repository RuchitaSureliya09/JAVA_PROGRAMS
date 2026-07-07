import java.util.Scanner;
public class Decimal_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String octal = "";

        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }

        System.out.println("Octal Equivalent = " + octal);
    }
}

