import java.util.Scanner;

public class Right_rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        int nums[] = new int[n+1];

        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Before Rotate Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + "  ");
        }

        System.out.print("\nEnter number of rotation (non-negative) : ");
        int k = sc.nextInt();
        int m = 0;

        for (int i = 1; i <= k; i++) {
            for (int j = n - 1; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[m] = nums[n];
        }

        System.out.println("After Rotate Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + "  ");
        }
    }
}
