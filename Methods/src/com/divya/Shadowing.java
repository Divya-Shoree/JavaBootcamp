package com.divya;

public class Shadowing {
    static int x = 234;
    public static void main(String[] args) {
        System.out.println(x);
        int x ; //the class variable at line 4 is shadowed by this
        // System.out.println(x); //scope will begin when the value is initialized
        x = 39;
        System.out.println(x);
        func();
    }

    static void func()
    {
        System.out.println(x);
    }
}
