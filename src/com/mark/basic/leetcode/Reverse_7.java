package com.mark.basic.leetcode;

/**
 * 不太理解这个问题
 */

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Seven_Reverse {

    public static void main(String[] args) {
        int x = -1456;
        int i = reverse(x);
        System.out.printf(String.valueOf(i));
    }

    /**
     * 思路1：使用栈结构，先判断字符是否是数字，如果是则入栈，如果不是则将这个符号set到list中
     * @param x
     * @return
     */
    public static int reverse(int x) {

        int y = 0;
        while (x != 0) {
            if (y > 214748364 || y < -214748364) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }
}
