package com.divya;
/* Find the first and last position of an element in a sorted array.
* If target is not found in the array, return [-1,-1]
* Must write an algorithm with O(logn) runtime complexity.
* Input nums = [5,7,7,8,8,10] target = 8
* Output = [3,4]
* */

import java.util.Arrays;
import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        //int[] arr = {-19,-17,-13,-12,-10,-8,-7,-4,0,2,4,6,9,11,12,14,19,20,36,48,69,70,73,75,81,86,91,95,98,101,105};
        int[] arr = {1,3,3,3,5,5,6,8,8,8,8,8,10};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for finding ceiling : ");
        int key = in.nextInt();
        System.out.println(Arrays.toString(searchRange(arr,key)));
    }

    static int[] searchRange(int[] arr, int key){

        int[] res = {-1,-1};
        res[0] = search(arr,key,true);
        if(res[0] != -1) {
            res[1] = search(arr, key, false);
        }
        return res;
    }

    static int search(int[] arr, int key, boolean findStartIndex){
        int low = 0;
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] < key )
                low = mid+1;
            else if(arr[mid] > key)
                high = mid -1;
            else{
                ans = mid;
                //If searching for the first occurence of the element
                if(findStartIndex)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

        }
        return ans;
    }
}
