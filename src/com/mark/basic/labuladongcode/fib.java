package com.mark.basic.labuladongcode;

/**
 * 斐波那契数列
 */
public class fib {


    public static void main(String[] args) {
        int n = 20;
        System.out.println(fibTest(n));
    }

    public static int fibTest(int n){

        if (n == 1 || n == 2) {
            return 1;
        }
        return fibTest(n-1) + fibTest(n-2);
    }
    
}
