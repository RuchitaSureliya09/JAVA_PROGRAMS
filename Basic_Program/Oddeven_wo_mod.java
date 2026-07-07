import java.util.Scanner;

public class Oddeven_wo_mod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        if((n & 1) == 0)
            System.out.println("Given number is even");
        else
            System.out.println("Given number is odd");
    }
}