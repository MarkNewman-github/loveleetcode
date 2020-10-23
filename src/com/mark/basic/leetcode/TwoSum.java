package com.mark.basic.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] nums =[2, 7, 11, 15];
        int target = 9;
        TwoSumFunction(nums, target);
    }

     private int[] TwoSumFunction(int[] nums, int target) {

        int[] sumNum ;
        //思路1:将nums中的每一个元素进行遍历相加，最后得到结果
        for (int i = 0; i < nums.length; i++) {
           int firstNum = nums[i];
           for (int j = i; j < nums.length; j++) {
            if(firstNum + nums[i] == target){
                sumNum[firstNum,nums[i]];
                return sumNum;
                
            } 
           }
           
        }
        return sumNum;

    } 
}
