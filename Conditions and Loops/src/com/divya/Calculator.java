package com.divya;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        //Take input from user till user doesn't press x or X
        while(true){
            System.out.print("Enter an operator : ");
            //Take the operator as input
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op=='/' || op=='%'){
                //input 2 numbers
                System.out.print("Enter 2 numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+')
                    res = num1 + num2;
                else if(op == '-')
                    res = num1 - num2;
                else if(op == '*')
                    res = num1 * num2;
                else if(op == '/'){
                    if(num2 != 0)
                        res = num1 / num2;
                }
                else
                    res = num1 % num2;
                System.out.println("Result = " + res);
                }
            else if(op == 'x' || op == 'X')
                break;
            else{
                System.out.println("Invalid operator!");
            }
        }
    }
}
