package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class ElementPositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-19,-17,-13,-12,-10,-8,-7,-4,0,2,4,6,9,11,12,14,19,20,36,48,69,70,73,75,81,86,91,95,98,101,105};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for finding ceiling : ");
        int key = in.nextInt();
        int index = search(arr,key);
        if(index == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element at index = "+ index);
    }

    /* Take the first n elements of the sorted infinite array.
       If the arr[n] element > target, take the next n elements
       Else run binary search on these selected array elements.
     */
    static int search(int[] arr, int key){
         int start = 0;
         int end = 1;
         while(key > arr[end]){
                 start = end + 1;
                 end = end * 2;
                 //for avoiding exception. this will not be a case with true infinite array.
                 if(end >= arr.length){
                     end = arr.length - 1;
                     break;
                 }
         }

         int index = binarySearch(arr,key,start,end);
         return index;
    }

    static int binarySearch(int[] arr, int key, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key)
                return mid;
            else if(key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
