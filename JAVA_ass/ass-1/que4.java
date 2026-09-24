import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Before Swap :");
        System.out.println("n1 : "+n1);
        System.out.println("n2 : "+n2);

        n1=(byte)n1^(byte)n2;
        n2=(byte)n1^(byte)n2;
        n1=(byte)n1^(byte)n2;

        System.out.println("After Swap :");
        System.out.println("n1 : "+n1);
        System.out.println("n2 : "+n2);
    }
}
