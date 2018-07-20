package com.leetcode.www.Recursion;

public class Palindrome {

    public static boolean palindrome(String string){
        char[] str = string.toCharArray();
        int start = 0;
        int end = str.length-1;
        while (end>start){
            if (str[end]!=str[start]){
                return false;
            }else {
                end--;
                start++;
            }
        }
        return true;
    }



}
