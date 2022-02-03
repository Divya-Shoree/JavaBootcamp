package com.divya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
//        ArrayList<Integer> list = new ArrayList<>(10);
//        char option = 'y';
//        while(option == 'y'){
           Scanner in = new Scanner(System.in);
//            System.out.print("Add a value to the array list : ");
//            list.add(in.nextInt());
//            System.out.print("Enter 'y' to continue and any other character to stop adding more items : ");
//            option = in.next().charAt(0);
//        }
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        //Scanner in = new Scanner(System.in);
//        for(int i = 0; i < 10; i++){
//            //System.out.println("Add a number to the list : ");
//            list.add(i);
//        }
//        System.out.println(list);
//        System.out.println(list.contains(8));
//        list.set(0,8);
//        System.out.println(list.contains(8));
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//
//        System.out.println("\nPrinting elements of the list using enhanced for loop");
//        for(int i : list)
//            System.out.print(i + " ");
//
//        System.out.println("\nPrinting elements of the list using for loop");
//        for(int i = 0; i < list.size(); i++)
//            System.out.print(list.get(i) + " ");

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++)
            list.add(new ArrayList<>());

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                list.get(i).add(in.nextInt());

        }

        System.out.println(list);
    }
}
