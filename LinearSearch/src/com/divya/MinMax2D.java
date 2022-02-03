package com.divya;

import java.util.Arrays;

public class MinMax2D {
    public static void main(String[] args) {
        int[][] arr = {
                {90, 38, 12, 39, 0, 47,-76},
                {-12, 38, 93, 91, 38},
                {-11, -19, 24, 48, 73, 99}
        };
        System.out.println("Max array element = " + Max(arr) + " at index = " + Arrays.toString(MaxValIndex(arr)));
        System.out.println("Min array element = " + Min(arr) + " at index = " + Arrays.toString(MinValIndex(arr)));
    }

    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row: arr){
            for(int col : row){
                if(col > max)
                    max = col;
            }
        }
        return max;
    }

    static int[] MaxValIndex(int[][] arr){
        int max = Integer.MIN_VALUE;
        int[] ans = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    static int Min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] row: arr){
            for(int col : row){
                if(col < min)
                    min = col;
            }
        }
        return min;
    }

    static int[] MinValIndex(int[][] arr){
        int min = Integer.MAX_VALUE;
        int[] ans = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
