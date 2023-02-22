/*
 *  title: Average of array
    date: 2023-02-22 21:00:37
 */


package com.codewithamol.Day2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input n -> no of elements in array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Average-> " + getAverage(arr));

    }

    static int getAverage(int[] arr) {
        /*
         * Add all elemets and divide by number of items
         */
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int avg = sum / arr.length;
        return avg;
    }
}
