package com.divya;

import java.util.Scanner;

public class Main {

    static int num_searches = 0;
    public static void main(String[] args) {
	// write your code here
        int[] arr = {-19,-17,-13,-12,-10,-8,-7,-4,0,2,4,6,9,11,12,14,19,20,36,48,69,70,73,75,81,86,91,95,98,101,105};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an element to be searched in the array : ");
        int key = in.nextInt();

        if(binarySearch(arr,key,0,arr.length -1) != -1)
            System.out.println("Element present at index " +binarySearch(arr,key,0,arr.length));
        else
            System.out.println("Element not present in the array.");
        System.out.println("Array size : " + arr.length+ ".\nNumber of searches done: " + num_searches);
    }

    static int binarySearch(int[] arr, int key, int low, int high){
        num_searches++;
        if(low > high)
            return -1;
        int mid = (high )/2 + (low )/2;
        if(key == arr[mid])
            return mid;
        else if(key > arr[mid])
            return binarySearch(arr,key,mid+1,high);
        else
            return binarySearch(arr,key,low,mid-1);
    }
}
