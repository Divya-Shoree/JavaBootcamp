package com.divya;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {90, 38, 12, 39, 0, 47},
                {-12, 38, 93, 91, 38},
                {-11, -19, 24, 48, 73}
        };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to be found : ");
        int target = in.nextInt();
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    //Return the start and the end index of the element found.
    static int[] Search(int[][] arr, int target){
        if(arr.length == 0)
            return new int[]{-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(target == arr[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
