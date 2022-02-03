package com.divya;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 34, 39,94, 28, 83, 47, 76, 0, -22, -38, -11, 40, 68, 101, -60};
        System.out.println("Minimum element in the array is : " + MinEnhanced(arr));
        System.out.println("Minimum element in the array is : " + Max(arr));
    }

    static int Min(int[] arr){
        int min_num = arr[0];
        if(arr.length == 0)
            return Integer.MIN_VALUE;
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] < min_num)
                min_num = arr[i];
        }
        return min_num;
    }

    static int MinEnhanced(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min)
                min = num;
        }
        return min;
    }

    static int Max(int[] arr){
        int max_num = arr[0];
        if(arr.length == 0)
            return Integer.MIN_VALUE;
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] > max_num)
                max_num = arr[i];
        }
        return max_num;
    }
}


