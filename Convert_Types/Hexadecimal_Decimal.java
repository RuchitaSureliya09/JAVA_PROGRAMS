import java.util.Scanner;

public class Hexadecimal_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();

        int decimal = 0, value;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);

            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else if (ch >= 'A' && ch <= 'F')
                value = ch - 'A' + 10;
            else
                value = ch - 'a' + 10;

            decimal = decimal * 16 + value;
        }

        System.out.println("Decimal Equivalent = " + decimal);
    }
}