package com.divya;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //datatype[] variable_name = new datatype[size]
        //or
        //datatype[] variable_name = {val1, val2, val3, ...}

        int[] ros; //Declaration of array. 'ros' is getting defined in the stack.
        ros = new int[5]; //Initialization : Creation of the object in the memory happens here.

        char[] arr = new char[3];
        System.out.println(arr[1]);

        String[] arr1 = new String[3];
        System.out.println(arr1[1]);

        int[] a1 = null ;
        //System.out.println(a1[0]);
    }
}
