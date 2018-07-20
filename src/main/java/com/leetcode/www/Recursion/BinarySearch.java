package com.leetcode.www.Recursion;

public class BinarySearch {

    public static int binarySearch(int[] array,int low,int high,int target){
        if (low<=high){
            int mid = (low + high )>>1;
            if (array[mid]==target){
                return mid+1;
            }else if (array[mid]>target){
                return binarySearch(array,low,mid-1,target);
            }else {
                return binarySearch(array,mid+1,high,target);
            }
        }
        return -1;
    }

    public static int binarySearch_loop(int[] array,int low,int high,int target){
        while(low<=high){
            int mid = (low + high)>>1;
            if (array[mid]==target){
                return mid+1;
            }else {
                if(array[mid]<target){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;

    }


}
