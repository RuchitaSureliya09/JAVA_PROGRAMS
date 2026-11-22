import java.util.Scanner;

public class Delete_ele_1Darray {
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

        System.out.println("\nEnter element that you want to delete : ");
        int ele = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < size; i++) {
            if (ele == arr[i]) {
                size--;
                for(int j=i;j<size;j++){
                    arr[j] = arr[j + 1];
                }
                flag++;
            }
        }

        if (flag == 0)
            System.out.println("Element not found!");
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + "  ");
            }
        }

    }
}
