import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of element : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }

        System.out.println("\nAfter Insertion Sort :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
