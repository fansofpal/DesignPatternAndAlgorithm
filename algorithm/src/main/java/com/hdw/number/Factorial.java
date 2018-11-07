package com.hdw.number;

/**
 * 求阶乘
 * user:hudawei1
 * date:2018/11/7
 * time:10:34
 */
public class Factorial {

    public static void main(String[] args){
        System.out.println(factorial(5));
    }


    public static int factorial(int number){
        //1.边界条件。触碰边界条件时，返回对应结果。
        if(number < 2){
            return 1;
        }
        //2.算法公式。该数字阶乘 = 数字本身*数字-1的阶乘
        int result = number * factorial(number-1);
        return result;
    }
}
