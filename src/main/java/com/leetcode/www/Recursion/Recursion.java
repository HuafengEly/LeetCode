package com.leetcode.www.Recursion;

import java.util.Arrays;

public class Recursion {



    public static long factorial_recursion(int i){
        if(i==1){
            return 1;
        }else{
            return i*factorial_recursion(i-1);
        }
    }

    public static long factorial_loop(int i){
        long result = i;
        while(i>0){
            result *=i;
            i--;
        }
        return result;
    }

    public static long accumulation_recursion(int i){
        if(i==1){
            return 1;
        }else{
            return i+accumulation_recursion(i-1);
        }
    }

}
