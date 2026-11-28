import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of element : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Quick_sort obj = new Quick_sort();
        obj.quicksort(a, 0, n - 1);
    }

    void quicksort(int a[], int low, int high) {
        int p;

        if (low < high) {
            p = part(a, low, high);

            quicksort(a, low, p - 1);
            quicksort(a, p + 1, high);
        }
    }

    int part(int a[], int low, int high) {
        int pivot, i, temp;

        pivot = a[high];
        i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;

                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
