package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr= {33,33,33,33,33,33,33};
        //int[] arr = {98,83,72,59,42,31,18,11,6,1};
        //int[] arr = {-19,-17,-13,-12,-10,-8,-7,-4,0,2,4,6,9,11,12,14,19,20,36,48,69,70,73,75,81,86,91,95,98,101,105};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a key to be searched : ");
        int key = in.nextInt();
        int index = binarySearch(arr,key);


        if(index == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + index);
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        boolean isAsc = false;
        if(arr[low] < arr[high])
            isAsc = true;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            if(isAsc){
                if (key > arr[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }else{
                if (key > arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

}
