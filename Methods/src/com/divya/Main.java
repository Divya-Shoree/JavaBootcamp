package com.divya;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Q: Take input of 2 numbers and print their sum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int  num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + "=" + sum);
    }
}
