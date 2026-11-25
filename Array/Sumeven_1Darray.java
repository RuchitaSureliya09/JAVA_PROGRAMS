import java.util.Scanner;

public class Sumeven_1Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element["+i+"] : ");
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                sum += arr[i];
        }

        System.out.println("Sum of even number into 1D Array : " + sum);
    }
}