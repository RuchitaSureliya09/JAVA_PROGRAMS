import java.util.Scanner;

class Bank_details {
    int acc_no;
    double balance;
    private int pin;

    void setter(int a,double b,int p) {
        acc_no=a;
        balance=b;
        pin=p;
    }

    void getter(int a,int p) {
        if(pin==p && acc_no==a) {
            System.out.println("Account no. : "+acc_no);
            System.out.println("Balance : "+balance);
        }
        else {
            System.out.println("Invalid Details !");
        }
    }
}

public class Bank_acc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Bank_details b1=new Bank_details();
        Bank_details b2=new Bank_details();

        b1.setter(9000,2000000.0,1600);
        b2.setter(8000,400000.0,6502);

        System.out.println("You Want to check balance Please Enter Account no & Pin :");

        System.out.println("For Account b1 :");
        b1.getter(sc.nextInt(), sc.nextInt());
        System.out.println("For Account b2 :");
        b2.getter(sc.nextInt(), sc.nextInt());
    }
}
