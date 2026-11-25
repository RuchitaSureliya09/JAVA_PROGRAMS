import java.util.Scanner;

public class Find_ele_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }

        Find_ele_recursion obj = new Find_ele_recursion();
        int ind = obj.isInArray(arr, size);

        if (ind == 0)
            System.out.println("Element not found!");
        else
            System.out.println("Found that element at " + ind + " index.");
    }

    int isInArray(int a[], int m) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter element that you want to find : ");
        int ele = sc.nextInt();
        int flag = 0, j;

        for (j = 0; j < m; j++) {
            if (ele == a[j]) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return 0;
        else
            return j;
    }
}
