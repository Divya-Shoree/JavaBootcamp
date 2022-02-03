package com.divya;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[][] arr_2D = {
                {90, 38, 12, 39, 0, 47,-76},
                {-12, 38, 93, 91, 38},
                {-11, -19, 24, 48, 73, 99}
        };
        int[] arr = {12,1,345,21,6,78963,12,-3456};
        System.out.println("Even digit numbers in the array = "+findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if( even(num))
                count++;
        }
        return count;
    }

    //Function to check whether a number contains even digits or not.
    static boolean even(int num){
        int num_digits = digits(num);
        return num_digits%2 == 0;
    }

    //Function to find the number of digits in a number.
    static int digits(int num){
        //If number is negative, make it positive
        if(num < 0)
            num *= -1;

        if(num == 0)
            return 1;

        return (int)(Math.log10(num) + 1);
    }
}
