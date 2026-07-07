import java.util.Scanner;

public class Count_oddeven_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer number : ");
        int n = sc.nextInt();

        int rem = 0, ec = 0, oc = 0;

        while (n != 0) {
            rem = n % 10;

            if (rem % 2 == 0)
                ec++;
            else
                oc++;
            
            n /= 10;
        }

        System.out.println("Total odd digits : "+oc);
        System.out.println("Total even digits : "+ec);
    }
}