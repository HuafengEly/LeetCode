package com.leetcode.www.Recursion;

public class HanoiTower {

    static int n = 0;

    public static void hanoiTower_recursion(int level,char from,char inter,char to){
        System.out.println("begin");
        if(level==1){
            System.out.println("if");
            System.out.println("第"+(++n)+"次移动，将"+level+"号从"+from+"移动到"+to);
        }else {
            hanoiTower_recursion(level-1,from,to,inter);
            System.out.println("else1");
            System.out.println("第"+(++n)+"次移动，将"+level+"号从"+from+"移动到"+to);

            hanoiTower_recursion(level-1,inter,from,to);
            System.out.println("else2");
        }
        System.out.println("end");
    }

    public static void main(String args[]){
        hanoiTower_recursion(3,'A','B','C');
    }



}
