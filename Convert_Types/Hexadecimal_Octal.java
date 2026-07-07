import java.util.Scanner;

public class Hexadecimal_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number: ");
        String hex = sc.next();

        int value = 0, decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch=hex.charAt(i);

            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else if (ch >= 'A' && ch <= 'F')
                value = ch - 'A' + 10;
            else if (ch >= 'a' && ch <= 'f')
                value = ch - 'a' + 10;

            decimal = decimal * 16 + value;
        }

        String octal = "";

        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }

        System.out.println("Octal Equivalent = " + octal);
    }
}
