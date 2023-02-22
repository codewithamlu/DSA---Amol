/*
 *  title: Rotate array by k elements
    date: 2023-02-22 22:20:09
 */

package com.codewithamol.Day2;

import java.util.Scanner;

public class RotateByK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input n -> no of elements in array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        sc.close();

        k %= n;
        k = k < 0 ? k + n : k;

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);

        printArray(arr);
    }

    static void reverseArray(int[] arr, int si, int ei) {
        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
