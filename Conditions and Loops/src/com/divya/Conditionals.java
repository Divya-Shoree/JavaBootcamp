package com.divya;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        if(salary > 10_000)
            System.out.println("You can be sanctioned with a loan");
        else
            System.out.println("Sorry, but you do not qualify for a loan");

    }
}
