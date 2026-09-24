import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size m :");
        int m = sc.nextInt();

        int arr[] = new int[m];

        Array obj = new Array();
        arr = obj.allocateArray(arr, sc);

        System.out.print("Array : ");
        obj.print(arr);

        System.out.println("Sum : " + obj.sumArr(arr));
        System.out.println("Multipy : " + obj.multiplyArr(arr));

        int[] rev = obj.reverseArr(arr);
        System.out.print("Reverse : ");
        obj.print(rev);

        System.out.println("Average : " + obj.averageArr(arr));
        System.out.println("Largest element : " + obj.largeElement(arr));
        System.out.println("Smallest element : " + obj.smallElement(arr));

        int[] sort1 = obj.incrementSort(arr);
        System.out.print("Increment Sorted Array : ");
        obj.print(sort1);

        int[] sort2 = obj.decrementSort(arr);
        System.out.print("Decrement Sorted Array : ");
        obj.print(sort2);

    }// main

    int[] allocateArray(int[] arr, Scanner sc) {
        int i;

        for (i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        return arr;

    }// allocate main array element

    void print(int[] arr) {
        int i;

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

    }// print of array

    public int sumArr(int[] arr) {
        int i, sum = 0;

        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
        
    }// sum of array element

    public int multiplyArr(int[] arr) {
        int i, mul = 1;

        for (i = 0; i < arr.length; i++) {
            mul = mul * arr[i];
        }
        return mul;
    }// multiply of array element

    public int[] reverseArr(int[] arr) {
        int i;
        int[] rev = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }// reverse array

    public float averageArr(int[] arr) {
        int i, sum = 0;
        float avg;

        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = (float) sum / arr.length;
        return avg;
    }// average of array element

    public int largeElement(int[] arr) {
        int i, max = arr[0];

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }// largest element of array

    public int smallElement(int[] arr) {
        int i, min = arr[0];

        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }// smallest element of array

    public int[] incrementSort(int[] arr) {
        int i, j, temp;
        int sort1[] = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            sort1[i] = arr[i];
        }

        for (i = 0; i < sort1.length - 1; i++) {
            for (j = i + 1; j < sort1.length; j++) {
                if (sort1[i] > sort1[j]) {
                    temp = sort1[i];
                    sort1[i] = sort1[j];
                    sort1[j] = temp;
                }
            }
        }
        return sort1;
    }// Increment sorted array

    public int[] decrementSort(int[] arr) {
        int i, j, temp;
        int sort2[] = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            sort2[i] = arr[i];
        }

        for (i = 0; i < sort2.length - 1; i++) {
            for (j = i + 1; j < sort2.length; j++) {
                if (sort2[i] < sort2[j]) {
                    temp = sort2[i];
                    sort2[i] = sort2[j];
                    sort2[j] = temp;
                }
            }
        }
        return sort2;
    }// decrement sorted array
}// class