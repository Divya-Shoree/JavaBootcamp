package com.divya;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String g = greet();
        System.out.println(g);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.nextLine();
        System.out.print("Enter a greeting: ");
        String greeting = in.nextLine();
        String g1 = greetWithArgs(name,greeting);
        System.out.println(g1);
    }

    static String greet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.nextLine();
        System.out.print("Enter a greeting: ");
        String greeting = in.nextLine();
        return("Hi " + name + "! "+ greeting);

    }

    static String greetWithArgs(String name, String greet){
        return("Hi " + name + "! "+ greet);
    }
}
