package com.divya;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
 //       Scanner in = new Scanner(System.in);
 //       System.out.print("Enter a number : ");
 //       int num = in.nextInt();
        //Print all the 4 digit armstrong numbers
        for(int i = 1000; i < 10000; i++)
            isArmstrong(i);
    }

    static void isArmstrong(int num){
        int rem = 0;
        int n = num;
        int new_num = 0;
        int power_4 = 0;
        while(num > 0){
            rem = num % 10;
            power_4 = rem*rem*rem*rem;
            new_num += power_4;
            num = num/10;
        }
        if(new_num == n)
            System.out.println(n + " is an Armstrong Number");
//        else
//            System.out.println("Not an Armstrong Number.");
    }
}
