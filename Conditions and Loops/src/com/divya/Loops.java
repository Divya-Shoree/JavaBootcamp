package com.divya;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //Print numbers from one to 5
        System.out.print("Printing numbers using for loop : ");
        for(int i=1; i <= 5; i++)
            System.out.print(i + " ");

        System.out.print("\nPrinting numbers using while loop : ");
        int num = 1;
        while(num < 6) {
            System.out.print(num + " ");
            num++;
        }

        System.out.print("\nPrinting numbers using do while loop : ");
        num = 1;
        do{
            System.out.print(num + " ");
            num++;
        }while(num < 6);

        System.out.println("\nUser input. Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }
}
