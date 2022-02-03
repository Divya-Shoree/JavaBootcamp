package com.divya;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println("num = " + num);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b * c;
        //float f = 0.70896f * a;
        System.out.println("int d = " + d);
        System.out.println("float = " + 0.70896f * a);

//        byte e = (byte) (a * b * c);
//        System.out.println("e = " + e);
//
//        int num = 'a';
//        System.out.println(num);

        System.out.println(" float - int + double = " + (8.0976f - 20 + 67.987697987));

    }
}
