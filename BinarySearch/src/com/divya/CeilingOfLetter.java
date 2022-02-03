package com.divya;

//Given a character array 'letters' sorted in non-decreasing order and a character
//'target', return the smallest character in the array that is larger than the target.
//The letters wrap around => target == 'z' and letters = ['a','b'], the answer is 'a'
public class CeilingOfLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char key = 'a';
        int index = CeilingChar(letters,key);
//        if(index == -1)
//            System.out.println("Ceiling of letter '"+key+"' doesn't exist in letters array.");
//        else
        System.out.println("Ceiling of letter '"+key+"' is '"+letters[index]+"'");

        index = FloorChar(letters,key);
//        if(index == -1)
//            System.out.println("Floor of letter '"+key+"' doesn't exist in letters array.");
//        else
            System.out.println("Floor of letter '"+key+"' is '"+letters[index]+"'");

    }

    static int CeilingChar(char[] arr, char key) {
        int low = 0;
        int high = arr.length - 1;

//        if(key > arr[arr.length-1])
//            return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
//            if (key == arr[mid])
//                return mid;
            if(key < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
//        if(low >= arr.length)
//            low = 0;
        return low%arr.length;
    }

    static int FloorChar(char[] arr, char key) {
        int low = 0;
        int high = arr.length - 1;

//        if(key < arr[0])
//            return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
//            if (key == arr[mid])
//                return mid;
            if(key < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        if(high < 0)
            high = arr.length-1;
        return high;
    }

}
