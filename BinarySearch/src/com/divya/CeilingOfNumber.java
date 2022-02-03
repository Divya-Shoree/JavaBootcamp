package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        //int[] arr= {33,33,33,33,33,33,33};
        //int[] arr = {98,83,72,59,42,31,18,11,6,1};
        int[] arr = {-19,-17,-13,-12,-10,-8,-7,-4,0,2,4,6,9,11,12,14,19,20,36,48,69,70,73,75,81,86,91,95,98,101,105};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for finding ceiling : ");
        int key = in.nextInt();

        //Find the ceiling of a number
        //ceiling is a number equal to or greater than the given number
        int index = CeilingOfNumber(arr,key);
        if(index == -1)
            System.out.println("Ceiling not present in the array.");
        else
            System.out.println("Ceiling =  " + arr[index]);

        //Find the floor of a number
        //floor of a number is a number less than or equal to it
        index = FloorOfNumber(arr,key);
        if(index == -1)
            System.out.println("Floor not present in the array.");
        else
            System.out.println("Floor =  " + arr[index]);
    }
    static int CeilingOfNumber(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        if(key > arr[arr.length-1])
            return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            else if(key < arr[mid])
                high = mid -1;
            else
                    low = mid + 1;
            }
        return low;
    }

    static int FloorOfNumber(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        if(key < arr[0])
            return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            else if(key < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        return high;
    }

}
