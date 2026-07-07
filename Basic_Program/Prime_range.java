import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter two number of range : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Prime number between Range :");

        int flag;

        for(int i=n1+1;i<n2;i++){

            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag++;
                }
            }

            if(flag==0)
                System.out.println(i);
        }
    }
}
