import java.util.Scanner;

public class Digitsum_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        Digitsum_recursive obj = new Digitsum_recursive();
        System.out.println("Sum of digit of given number by recursive : "+(obj.digitsum(n)));
    }

    int digitsum(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10 + digitsum(n / 10));
    }
}