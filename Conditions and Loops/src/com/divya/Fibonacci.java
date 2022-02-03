package com.divya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose fibonacci sequence is desired : ");
        int num = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        int sum = f1 + f2;
        System.out.print(f1 +" " + f2 + " ");
        for(int i = 2; i <= num ; i++)
        {
            f1 = f2;
            f2 = sum;
            System.out.print(sum + " ");
            sum = f1 + f2;
        }
        System.out.println("\nSum of the fibonacci series is " + f2);
    }
}
