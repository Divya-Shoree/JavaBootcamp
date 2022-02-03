package com.divya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        while(true){
            int s = sum();
            if(s > 100)
                break;
        }

    }

    /*
        Function to print and return the sum of 2 integers
     */
    static int sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int  num2 = in.nextInt();
        int s = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + s);
        return s;
    }
}
