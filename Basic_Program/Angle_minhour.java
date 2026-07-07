import java.util.Scanner;

public class Angle_minhour { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter hour and minute : ");
        int h=sc.nextInt();
        int m=sc.nextInt();

        int m_h=(6*m);
        int h_h=(int) ((int)(30*h)+(0.5*m));
        int angle=h_h-m_h;

        if (angle>180)
            System.out.println("Angle : "+(360-angle));
        else
            System.out.println("Angle : "+angle);
    }
}
