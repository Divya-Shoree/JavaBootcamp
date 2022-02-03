package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class DescendinglySortedArray {
    public static void main(String[] args) {
        int[] arr = {98,83,72,59,42,31,18,11,6,1};
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

    static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(key == arr[mid])
                return mid;
            else if(key > arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
