package com.mark.basic.s01;

public class Fib {

    /**
     * 求斐波那契数列的第n项
     * 0，1，1，2，3，5，8，13....
     */

    /**
     * 方法1：
     * 采用递归的方式进行计算，时间复杂度
     * @param n
     * @return
     */
    public static int fib(int n){

        if (n <= 1) {
            return n;
        }
        int num = fib(n-1) + fib(n-2);

        return num;
    }


    /**
     * 方法2：
     * 采用循环的方式获取n-1和n-2
     * @param n
     */
    public static int fib2(int n){

        if (n <= 1){
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 0; i < n-1; i++) {

            int sum = first + second;
            first = second;
            second = sum;

        }

        return second;
    }


    public static void main(String[] args) {
        int n = fib2(10);
        System.out.print(n);
    }
}
