package com.leetcode.www.Recursion;

import java.util.Arrays;

public class PascalTriangle {

    public static int pascalTriangle_recursion(int x,int y){
        if(y<=x && y>=0){
            if(y==1||y==x){
                return 1;
            }else {
                return pascalTriangle_recursion(x-1,y-1)+pascalTriangle_recursion(x-1,y);
            }
        }else {
            return -1;
        }
    }

    public static int pascalTriangle_loop(int x,int y){
        int[] result = new int[(x+1)/2];
        result[0]=1;
        for (int i=3;i<=x;i++){
            if (i%2==1) {
                result[i / 2 ] = result[i / 2-1] * 2;
            }
            for (int j=i/2-1;j>=1;j--){
                result[j] = result[j]+result[j-1];
            }
        }
        if (y<=(x+1)/2){
            return result[y-1];
        }else {
            return result[x-y];
        }
    }

    public static int pascalTriangle_array(int x,int y) {
        int[][] result = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                }
            }
        }
        return result[x - 1][y - 1];
    }

}
