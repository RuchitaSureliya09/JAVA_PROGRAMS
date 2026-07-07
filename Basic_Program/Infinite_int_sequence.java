// Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, ...]
// Input: n = 11
// Output: 0
// Explana􀆟on: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.

import java.util.Scanner;

public class Infinite_int_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long digits = 1;
        long count = 9;
        long start = 1;

        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n - 1) / digits;
        int index = (int) ((n - 1) % digits);

        String s = Long.toString(number);

        System.out.println(s.charAt(index));
    }
}
