package com.divya;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 34, 39,94, 28, 83, 47, 76, 0, -22, -38, -11, 40, 68, 101};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to be found : ");
        int target = in.nextInt();
        System.out.print("Enter the staring index and the end : ");
        int start = in.nextInt();
        int end = in.nextInt();
        int res = Search(arr,target,start,end);
        if(res == -1)
            System.out.println("Element not found in the range.");
        else
            System.out.println("Element found in the range at index " + res +".\n");
    }

    static int Search(int[] arr, int target, int start, int end){
        //Empty array
        if(arr.length == 0)
            return -1;
        //Starting index cannot be greater than ending index
        if(start > end)
            return -1;
        for (int i = start; i < end; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;

    }
}
