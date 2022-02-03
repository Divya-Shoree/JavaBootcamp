package com.divya;

import java.util.Scanner;

public class FindInMountainArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,3,1};
        int[] arr = {0,5,3,1};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a key of your choice: ");
        int key = in.nextInt();
        int peak = peakElement(arr);
        int index = -1;
        //Find the lowest index of the element in mountain array.
        if(arr[peak] == key)
            index = peak;
        else
            index = binarySearch(arr,key,0, peak-1,true);
        if(index == -1)
            index = binarySearch(arr,key,peak+1,arr.length-1,false);
        if(index == -1)
            System.out.println("Element not found.");
        else
            System.out.println("1st occurance of the element is at index = "+index);

    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    static int binarySearch(int[] arr, int key, int start, int end, boolean isAsc){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key > arr[mid]) {
                if(isAsc){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            else if(key < arr[mid]) {
                if(isAsc){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }
            else
                return mid;
        }
        return -1;
    }
}
