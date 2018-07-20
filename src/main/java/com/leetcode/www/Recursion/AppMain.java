package com.leetcode.www.Recursion;

import java.util.Arrays;



public class AppMain {

    public static void main(String args[]){
        int n;
        n=12;
//        Recursion recursion = new Recursion();
//        long[] result_r = new long[4];
//        result_r[0] = recursion.factorial_recursion(n);
//        result_r[1] = recursion.factorial_loop(n);
//        result_r[0] = recursion.accumulation_recursion(n);
//        System.out.println(Arrays.toString(result_r));

//        FibonacciSequence fibonacciSequence = new FibonacciSequence();
//        long[] result_f = new long[4];
//        result_f[0] = fibonacciSequence.fibonacci_recursion(n);
//        result_f[1] = fibonacciSequence.fibonacci_recursion_optimize(1,1,n);
//        result_f[2] = fibonacciSequence.fibonacci_loop(n);
//        System.out.println(Arrays.toString(result_f));

//        PascalTriangle pascalTriangle = new PascalTriangle();
//        long[] result_p = new long[4];
//        result_p[0] = pascalTriangle.pascalTriangle_recursion(5,2);
//        result_p[1] = pascalTriangle.pascalTriangle_loop(5,2);
//        result_p[2] = pascalTriangle.pascalTriangle_array(5,2);
//        System.out.println(Arrays.toString(result_p));
//
//        Palindrome palindrome = new Palindrome();
//        boolean isPalin = palindrome.palindrome("abcdcba");
//        System.out.println(isPalin);

//        BinarySearch binarySearch = new BinarySearch();
//        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        int result = binarySearch.binarySearch_loop(array,0,19,11);
//        System.out.println(result);

        HanoiTower hanoiTower = new HanoiTower();
        hanoiTower.hanoiTower_recursion(10,'A','B','C');

    }

}
