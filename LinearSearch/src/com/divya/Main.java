package com.divya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {18, 39, 24, -72, 16, 92, -9, 101, 57, 73, 29, 18, 10, -8};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an element to be searched in the array : ");
        int num = in.nextInt();

        //Return the index of the element if present.
        int present = linearSearchIndex(arr, num);
        if(present == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element "+num+" found at index " +present +".");

        //Return the element if present.
        int ele_present = linearSearchElement(arr, num);
        if(ele_present == Integer.MAX_VALUE)
            System.out.println("Element not found.");
        else
            System.out.println(ele_present + " is present in the array.");

    }

    //search in the array : return the index if item found
    //else return -1
    static int linearSearchIndex(int[] arr, int target){
        if(arr.length == 0)
            return -1;
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    //since we are returning the value which is found, the value can be -1
    //Therefore, returning -1 can cause an error.
    //Return the max_value of the integer to differentiate between the target value as -1 and the case where the
    //target value was not found.
    static int linearSearchElement(int[] arr, int target) {
        if(arr.length == 0)
        {
            System.out.println("The array passed is empty.");
            return Integer.MAX_VALUE;
        }
        for(int num: arr){
            if(target == num)
                return num;
        }
        return Integer.MAX_VALUE;
    }
}
