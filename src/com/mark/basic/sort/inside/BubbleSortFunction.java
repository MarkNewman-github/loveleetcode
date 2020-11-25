package com.mark.basic.sort.inside;


/**
 * 冒泡排序算法
 * 时间复杂度为O(n^2)
 * @author mark
 */
public class BubbleSortFunction {

    public static void main(String[] args) {
        int[] sort = {2,4,1,7,9,5,3,6,8};
        int[] afSort = bubbleSort(sort);
        for (int i = 0; i < afSort.length; i++) {
            System.out.print(afSort[i]);
        }
    }

    public static int[] bubbleSort(int[] sort){

        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j+1]){
                    int temp = sort[j+1];
                    sort[j+1] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        return sort;
    }
}
