import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
        System.out.println("Enter your mark of 3 subject :");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int sum=0;
        float per=0;

        if(m1>=40 && m2>=40 && m3>=40)
        {
            sum=m1+m2+m3;
            per=(float)sum/3;
            System.out.println("Percentage : "+per);

            if(per>=70)
                System.out.println("Student get a First division");
            else if(per<70 && per>=50)
                System.out.println("Student get a Second division");
            else if(per<50 && per>=35)
                System.out.println("Student get a Third division");
            else if(per<35)
                System.out.println("Fail!");
        }
        else
        {
            System.out.println("Fail!");
        }
    }
}