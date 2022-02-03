package com.divya;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int [] arr = {1,3,4,2,5,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
        String name = changeName("iron man");
        System.out.println(name);
    }

    static void change(int[] nums){
        nums[0] = 99;
    }

    static String changeName(String name)
    {
        name.toUpperCase();
        return name;
    }
}
