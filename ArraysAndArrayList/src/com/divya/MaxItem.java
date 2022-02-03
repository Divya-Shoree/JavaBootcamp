package com.divya;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        for(int i = 0; i < 10; i++){
            arr[i] = in.nextInt();
        }

        //Find max array element
        int max = max(arr);
        if(max != -1)
            System.out.println("Max array element = " + max);


        // Max item in range
        int b = 0, e = 0;
        System.out.println("Enter the start and end of the range : ");
        b = in.nextInt();
        e = in.nextInt();
        max = max_range(arr, b, e);
        if(max != -1)
            System.out.println("Max array element withing range = " + max);

        //Reverse the array
        reverse(arr);
    }

    static int max(int[] arr)
    {
        //Corner case:
        if(arr.length == -1){
            System.out.println("Array is empty");
            return -1;
        }

        //find max element
        int max = arr[0];
        for(int num : arr){
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    static int max_range(int[] arr, int start, int end)
    {
        //Corner case:
        if(arr.length == -1){
            System.out.println("Array is empty");
            return -1;
        }

        if(start < 0 || end >= arr.length)
        {
            System.out.println("Index out of bounds.");
            return -1;
        }

        if(start > end){
            System.out.println("Starting index cannot be greater than ending index.");
            return -1;
        }

        int max = arr[start];
        for(int i = start+1; i <=end; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr){
        int s = 0, e = arr.length -1;
        int temp = 0;
//        for(int i = s; i < arr.length /2; i++){
//            temp = arr[i];
//            arr[i] = arr[e];
//            arr[e] = temp;
//            e--;
//        }

        while(s < e){
            swap(arr, s, e);
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
