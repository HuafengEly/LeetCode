package com.leetcode.www.Recursion;

public class FibonacciSequence {

    /**
     * 斐波那契数列经典递归
     * @param n
     * @return
     */
    public static int fibonacci_recursion(int n){
        if(n == 1||n == 2){
            return 1;
        }else{
            return fibonacci_recursion(n-1)+fibonacci_recursion(n-2);
        }
    }

    /**
     * 斐波那契改进递归
     * O(n)
     * @param first
     * @param second
     * @param n
     * @return
     */
    public static int fibonacci_recursion_optimize(int first,int second,int n){
        if(n==1){
            return first;
        }else{
            if(n==2){
                return second;
            }else{
                if(n==3){
                    return first+second;
                }else {
                    return fibonacci_recursion_optimize(second,second+first,n-1);
                }
            }
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci_loop(int n){
        int result = -1;
        if (n==1||n==2){
            return 1;
        }else{
            int first = 1;
            int second = 1;
            for(int i=3;i<=n;i++){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci_array(int n){
        int[] array = new int[n];
        array[0] = array[1] = 1;
        for(int i=3;i<+n;i++){
            array[i-1] = array[i-2]+array[i-3];
        }
        return array[n-1];
    }

}
