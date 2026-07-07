import java.util.Scanner;

public class Factorial_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer number :");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 0; i < n; i++) {
            fact = fact * (n - i);
        }

        System.out.println("Factorial by iterative : " + fact);
    }
}

