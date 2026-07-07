// Write a program to take 2 numbers from user and find out the distance between them. (How to
// compute distance: If number is 10 and 18 then 10 in binary 1010 and 18 in binary is 10010 and
// distance is 2 means total number of bits that needs to be changed when 10 is converted into 18
// or 18 is converted into 10, do not convert the number into binary)

import java.util.Scanner;

public class Distance_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int distance = n1 ^ n2;
        int count = 0;

        while (distance > 0) {
            if (distance % 2 == 1)
                count++;

            distance /= 2;
        }

        System.out.println("Distance between numbers : "+count);
    }
}