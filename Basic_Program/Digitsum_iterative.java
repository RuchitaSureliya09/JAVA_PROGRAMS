import java.util.Scanner;

public class Digitsum_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        int sum = 0, rem = 0;

        while (n != 0) {
            rem = n % 10;
            sum += rem;
            n /= 10;
        }

        System.out.println("Sum of digit of given number by ietrative: " + sum);
    }
}
