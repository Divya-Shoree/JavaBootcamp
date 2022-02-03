package com.divya;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Original value : a = " + a + ",b = " + b);
        swap(a,b);
        System.out.println("After the function call : a = " + a + ",b = " + b);
    }

    static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside the function call : a = " + a + ",b = " + b);
    }
}
