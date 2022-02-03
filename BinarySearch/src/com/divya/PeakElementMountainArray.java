package com.divya;

public class PeakElementMountainArray {
    public static void main(String[] args) {
       int[] arr = {3,4,5,1};
       // int[] arr = {0,1,3,4,5,6,9,19,8,7,5,2,1};
        //int[] arr = {1,2,1};
        int index = binarySearch(arr);
        if(index != -1)
            System.out.println("The peak array element is "+arr[index]);
    }


    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if((arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid + 1]))
                return mid;
            else if(arr[mid] < arr[mid-1])
                end = mid - 1;
            else
                start = mid + 1;

        }

        return start;
    }

//    static int binarySearch(int[] arr){
//        int start = 0;
//        int end = arr.length -1;
//        while(start < end){
//            int mid = start + (end-start)/2;
//            if(arr[mid] > arr[mid + 1]){
//                //We are in the descending part of the array.
//                //This may be the answer but look at the left side.
//                //Since this can be the answer therefore end = mid and end != mid -1
//                end = mid;
//            }else {
//                start = mid + 1;
//            }
//        }
//        //In the end, start == end and pointining to the largest number
//        return start;
//    }
}
