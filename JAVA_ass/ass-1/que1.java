import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total unit :");
        int u=sc.nextInt();
        
        int b = 0;

        if(u<=100)
        {
            b=(u*5);
            System.out.println("Bill : "+b);
        }
        else if(u>100 && u<=200)
        {
            b=((100*5)+(u-100)*7);
            System.out.println("Bill : "+b);
        }
        else if(u>=200)
        {
            b=((100*5)+(100*7)+(u-200)*10);
            System.out.println("Bill : "+b);
        }
    }
}