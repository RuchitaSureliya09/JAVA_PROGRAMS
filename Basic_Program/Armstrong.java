import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        int temp1 = n, temp2 = n, rem = 0, count = 0, sum = 0;

        while (temp1 != 0) {
            count++;
            temp1 /= 10;
        }

        temp1 = n;

        while (temp1 != 0) {
            rem = temp1 % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= rem;
            }

            sum += power;
            temp1 /= 10;
        }

        if (sum == temp2)
            System.out.println("Given number is Armstrong");
        else
            System.out.println("Given number is not Armstrong");
    }
}