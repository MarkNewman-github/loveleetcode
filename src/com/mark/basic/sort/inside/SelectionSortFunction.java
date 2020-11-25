package com.mark.basic.sort.inside;

/**
 * 选择排序
 * 时间复杂度为O(n^2)
 * @author mark
 *
 * 其实就是寻找最小的数
 */
public class SelectionSortFunction {

    public static void main(String[] args) {

        int[] sort = {2,4,1,7,9,5,3,6,8};
        int[] afsort = selectionSort(sort);
        for (int i = 0; i < afsort.length; i++) {
            System.out.print(afsort[i]);
        }

    }

    public static int[] selectionSort(int[] sort){

        int temp,midNum;
        for (int i = 0; i < sort.length -1; i++) {
            midNum = i;
            for (int j = i + 1; j < sort.length ; j++) {
                if (sort[j] < sort[midNum]){
                    midNum = j;
                }
            }
            temp = sort[i];
            sort[i] = sort[midNum];
            sort[midNum] = temp;
        }


        return sort;
    }
}
