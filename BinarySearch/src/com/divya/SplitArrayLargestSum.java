package com.divya;
import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args){
        int[] nums = {2,3,1,10};
        System.out.print("Enter the number of partitions:");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(splitArray(nums,m));

    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = nums.length -1;

        //Logic :
        //Case 1: If the number of partitions = number of array elements, the largest sum = largest element
        //Case 2: If the number of partitions = 1 i.e., the whole array is to be considered
        // Using linear search, find the max element of the array.
        for(int i = 0; i < nums.length -1; i++) {
            start = Math.max(start, nums[i]);
            //End will be maximum value possible which will be the sum of the entire array elements.
            end += nums[i];
        }

        // We now have a sorted array of sums.
        // We will now apply binary search to find the answer.
        while(start < end){
            int mid = start + (end - start)/2;
            //Try for the middle as potential answer
            //Calculate the number of pieces the array can be divided into with the middle as max sum
            int sum = 0;
            int pieces = 1;
            for(int a: nums){
                if(sum + a > mid){
                    //You cannot add this in this subarray, make new one.
                    sum = a;
                    pieces ++;
                }else{
                    sum += a;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return start; //or end as start == end
    }
}
