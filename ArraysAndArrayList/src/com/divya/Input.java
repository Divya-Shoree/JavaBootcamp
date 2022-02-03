package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++ ){
            arr[i] = in.nextInt();
        }
        System.out.print("The array elements are : ");
        for(int i = 0; i < n; i++ ){
            System.out.print( arr[i] + " ");
        }

        System.out.print("\nPrinting with the toString method: " );
        for(int num : arr)
            System.out.print(num + " ");

        System.out.print("\nPrinting with the toString method: " + Arrays.toString(arr));
    }
}
