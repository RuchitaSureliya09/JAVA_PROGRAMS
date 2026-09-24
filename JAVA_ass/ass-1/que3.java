import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter bill amount :");
        int b=sc.nextInt();
        double dis=0;
        double bill=0;

        if(b>=5000)
        {
            dis=(float)b*0.2;
            bill=b-dis;
            bill=bill+(bill*0.05);
            System.out.println("Final Bill : "+bill);
        }
        else if(b<5000 && b>=3000)
        {
            dis=(float)b*0.1;
            bill=b-dis;
            bill=bill+(bill*0.05);
            System.out.println("Final Bill : "+bill);
        }
        else
        {
            bill=b+((float)b*0.05);
            System.out.println("Final Bill : "+bill);
        }
    }
}
