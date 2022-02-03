package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number of rows and columns : ");
//        int num_rows = in.nextInt();
//        int num_col = in.nextInt();
//        int[][] arr =  new int[num_rows][num_col];
//        System.out.println("Enter the array elements: ");
//        for(int i = 0; i < num_rows; i++) {
//            for (int j = 0; j < num_col; j++)
//                arr[i][j] = in.nextInt();
//            System.out.println();
//        }
//        for(int i = 0; i < num_rows; i++) {
//            for (int j = 0; j < num_col; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }
//
//        for(int i = 0; i < num_rows; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        int[][] arr2D = {
                {1,2,3},
                {11,21},
                {67,78,89,91}
        };
        for(int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        for(int i = 0; i < arr2D.length; i++) {
            for(int j = 0; j < arr2D[i].length; j++)
                System.out.print(arr2D[i][j] + " ");
            System.out.println();
        }

        System.out.println("Printing 2D array using enhanced for loop.");
        for(int[] a : arr2D)
            System.out.println(Arrays.toString(a));
    }
}
