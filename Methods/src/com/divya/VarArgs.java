package com.divya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,3,4,5,98,99);
        System.out.println();
        multiple(1,3, "Divya","Thejas","Kunal");
    }

    static void func(int ...v){
        System.out.println(Arrays.toString(v));
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
