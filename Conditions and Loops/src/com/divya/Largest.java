package com.divya;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        //Find the largest of the 3 numbers
        int max = Math.max(c, Math.max(a,b));
        System.out.println("Largest number = " + max);
//        int largest = a;
//        if(b > largest)
//            largest = b;
//        if(c > largest)
//            largest = c;
//        System.out.println("Largest number = " + largest);

    }
}
