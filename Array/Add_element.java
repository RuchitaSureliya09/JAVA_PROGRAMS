import java.util.Scanner;

public class Add_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("Enter element[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.print("Enter new element : ");
        int new_ele = sc.nextInt();
        System.out.print("Enter position of new element : ");
        int ele_pos = sc.nextInt();

        for (int i = arr.length - 1; i >= ele_pos; i--) {
            if (i == ele_pos)
                arr[i] = new_ele;
            else
                arr[i] = arr[i - 1];
        }

        System.out.println("After add new element Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
