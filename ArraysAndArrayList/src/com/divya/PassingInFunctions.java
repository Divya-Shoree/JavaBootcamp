package com.divya;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {23,34,100,15};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print("\n" + Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
