package com.mark.basic.leetcode;

import java.util.Arrays;

/**
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Nine_isPalindrome {
    /**
     * 思路：将数字的第一位和最后一位进行比较，如果不相同则说明不是回文数字
     * @param args
     */
    public static void main(String[] args) {

        int x = 1230321;
        Boolean isPalindrome_num = isPalindrome(x);
        System.out.print(isPalindrome_num);
    }

    public static boolean isPalindrome(int x) {


        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            //这一步骤是将x的最后一位持续赋值给revertedNumber
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}
