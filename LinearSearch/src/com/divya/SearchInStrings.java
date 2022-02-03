package com.divya;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a string : ");
        String str = "Linear Search Algorithm - Theory + Code + Questions";
//        System.out.print("Enter a character to be searched in a string: ");
//        char c = in.next().charAt(0);
        char c = '+';
        boolean present = Search(str,c);
        if(present)
            System.out.println("Character " + c + " is present in the string.");
        else
            System.out.println("Character " + c + " is not present in the string.");

        boolean present_ele = SearchElement(str,c);
        if(present_ele)
            System.out.println("Character " + c + " is present in the string.");
        else
            System.out.println("Character " + c + " is not present in the string.");
    }

    static boolean Search(String str, char c){
        if(str.length() == 0)
            return false;
        for(int i = 0; i < str.length(); i++)
        {
            if(c == str.charAt(i))
                return true;
        }
        return false;
    }

    static boolean SearchElement(String str, char c){
        if(str.length() == 0)
            return false;
        for(char ch : str.toCharArray())
        {
            if(ch == c)
                return true;
        }
        return false;
    }
}
