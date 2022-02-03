package com.divya;

public class RotationCountInRotatedArray {
    public static void main(String[] args){
        //int[] arr = {7, 9, 11, 12, 5};
        int [] arr = {16,16,16,7, 9, 11, 12, 12, 15};
        int count = findPivot(arr) + 1;
        System.out.println("The array has been rotated " + count + " number of times.");
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            //Check for duplicates.
            //Case 1 : start, end and middle all are same
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //Check if these duplicates are the pivot
                //check if start is the pivot
                if (start < arr.length - 1 && arr[start] > arr[start + 1])
                    return start;
                //If start is not the pivot, skip the duplicate at start
                start++;

                //Check if end is the pivot element
                if (end > 0 && arr[end - 1] > arr[end])
                    return end - 1;
                //Else skip the duplicate
                end--;
            } else if ((arr[start] < arr[mid]) || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

}
