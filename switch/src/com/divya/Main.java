package com.divya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String fruit = in.next();
        switch(fruit){
            case "Apple":
                System.out.println("An apple a day keeps the doctor away!");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Banana":
                    System.out.println("Full of Potassium");
                    break;
            case "Pineapple":
                System.out.println("Good for cold and cough");
                break;
            default:
                System.out.println("It's good to eat a fruit daily!");
        }

        //Enhanced Switch
        System.out.print("Enter your holiday destination spot : ");
        String destination = in.next();
        switch (destination){
            case "Ooty" -> System.out.println("Beautiful hill station in the south of India!");
            case "Leh" -> System.out.println("The majestic Himalayas are a must see for travel enthusiasts!");
            case "Kanya kumari" -> System.out.println("Watch the Indian Ocean and the Bay of Bengal meet.");
            case "Darjaling" -> System.out.println("See the beauty of the mountains from the toy train");
            default -> System.out.println("Traveling can nourish the soul. Have a safe and joyous trip.");
        }

        System.out.print("Enter a number to know the equivalent day of the week : ");
        int day  = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number");
        }

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }

    }
}
