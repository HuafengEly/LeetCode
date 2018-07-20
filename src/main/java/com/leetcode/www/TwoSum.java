package com.leetcode.www;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public static void main(String args[]){
        int[] nums={2,7,11,15};
        int target=9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums,target);
//        数组的输出1
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }
//        数组的输出2
//        for (int a:result
//             ) {
//            System.out.println(a);
//        }
//        数组的输出3
        System.out.println(Arrays.toString(result));

    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int n = nums.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

}
