import java.util.Scanner;

public class Decimal_Hexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String hex = "";

        while (decimal > 0) {
            int rem = decimal % 16;

            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char)(rem + 55) + hex;//A,B,C,D,E,F

            decimal /= 16;
        }

        System.out.println("Hexadecimal Equivalent = " + hex);
    }
}
