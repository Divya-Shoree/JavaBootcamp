package com.divya;

/*
You are given an m x n integer grid accounts
where accounts[i][j] is the amount of money the ith customer has in the jth bank.
Return the wealth of the richest person/customer.

A customer's wealth is the amount of money that they have in all their bank accounts.
This richest customer is the customer that has the maximum wealth.

I/p : accounts = [[1,2,3],[3,2,1]]
o/p : 6
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6
 */
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,8},
                {3,2,1,10}
        };
        int[][] arr_2D = {
                {90, 38, 12, 39, 0, 41},
                {38, 93, 91, 38},
                {24, 48, 73, 99}
        };
        System.out.println(maxWealth(arr_2D));
    }

    static int maxWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            int row_sum = 0;
            for(int col : row){
                row_sum += col;
            }
            if(row_sum > max)
                max = row_sum;
        }
        return max;
    }
}
