import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        int binary = sc.nextInt();

        int rem = 0, decimal = 0, base = 1;

        while (binary > 0) {
            rem = binary % 10;
            decimal = decimal + rem * base;
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal Equivalent ="+decimal);
    }
}
