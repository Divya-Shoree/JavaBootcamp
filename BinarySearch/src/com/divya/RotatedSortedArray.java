package com.divya;
import java.util.*;

public class RotatedSortedArray {
    public static void main(String[] args) {
        //int[] arr = {4,5,6,3,2,1,0};
        //int[] arr = {3,4,5,6,7,0,1,2};
        int[] arr={5,5,1,3,5,5};//,15,15,15,15,24,32,32};
       // int[] arr = {5,1,3};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a key to be searched: ");
        int key = in.nextInt();
        System.out.println("Element found at index: "+RBS(arr,key));
    }

    static int RBS(int[] arr, int key){
        int pivot = findPivot(arr);
        //int index = -1;
        //Array is not rotated
        if(pivot == -1)
            return binarySearch(arr,key,0, arr.length-1);
        if(arr[pivot] == key)
            return pivot;
        if(key >= arr[0])
            return binarySearch(arr,key,0,pivot-1);
        else
            return binarySearch(arr,key,pivot+1, arr.length-1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
