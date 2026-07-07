import java.util.Scanner;

public class Minmax_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of value that you want for operation : ");
        int n = sc.nextInt();

        System.out.print("Enter value 1 : ");
        int num = sc.nextInt();

        int max = num, min = num, sum = num;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            num = sc.nextInt();

            if (num > max)
                max = num;
            else if (num < min)
                min = num;

            sum += num;
        }
        double avg = (double) sum / n;

        System.out.println("Maximum number : " + max);
        System.out.println("Minimum number : " + min);
        System.out.println("Average of numbers : " + avg);
    }
}
