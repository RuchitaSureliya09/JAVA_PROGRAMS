import java.util.Scanner;

public class Factorial_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer number :");
        int n = sc.nextInt();

        Factorial_recursive obj = new Factorial_recursive();
        System.out.println("Factorial by recursive : " + obj.factorial(n));
    }

    int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * (factorial(n - 1));
    }
}
