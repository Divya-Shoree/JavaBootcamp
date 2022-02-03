package com.divya;

import org.jetbrains.annotations.NotNull;

public class Overloading {
    public static void main(String[] args) {
        fun(98);
        fun("Call String");
        int s = sum(9,3,1,6,1);
        System.out.println(s);
        s = sum();
        System.out.println(s);

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum(int a, int b){
        System.out.println("Running sum function with 2 arguments");
        return (a+b);
    }

    static int sum(int a, int b, int c){
        System.out.println("Running sum function with 3 arguments");
        return(a+b+c);
    }

    static int sum(int @NotNull ...v){
        System.out.println("Running sum function with variable number of arguments");
        int s = 0;
        for(int i = 0; i < v.length; i++)
            s += v[i];
        return s;
    }
}
