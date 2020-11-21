package com.mark.basic.tree;

/**
 * 二叉树相关题目
 */
public class BinaryTree {

    BianryTreeNode root = new BianryTreeNode();

    /**
     * 问题一：查找一个二叉树中最大的元素(递归方式)
     */
    public int FindMax(BianryTreeNode root){
        int root_val, left, right, max;
        if (root != null) {
            root_val = root.getData();
            left = FindMax(root.getLeft());
            right = FindMax(root.getRight());
            //在3个值中找出最大值
            if (left > right) {
                max = left;
            }else {
                max = right;
            }
            if (root_val > max) {
                max = root_val;
            }
        }
        return 0;
    }

    /**
     * 问题二：查找一个二叉树中最大的元素(非递归方式)
     */
    public int FindMaxNoRecursion(BianryTreeNode root){
        BianryTreeNode temp;
        int max;
        LLQueue q = new LLQueue();
        q.enQueue(root);
        while (!q.isEmpty()) {
            //temp = q.de
        }

        return 0;
    }

    /**
     * 问题三：给出在二叉树中搜索某个元素的算法
     * 分析：熟悉这里适合使用二分搜索法，先和跟节点比较，然后再根据比较结果判断是在左子树比较还是右子树比较
     */
    public Boolean FindInBianryTreeUsingRecursion(BianryTreeNode root, int data){

        Boolean temp;
        //永远记住，在进行树形结构操作的时候一定先要进行判断是否是空树
        if (root == null){
            return false;
        }else {
            //判断是等于当前的跟节点
            if (data == root.getData()){
                return true;
            }else {
                temp = FindInBianryTreeUsingRecursion(root.getLeft(), data);
                if (temp != true) {
                    return temp;
                }else {
                    temp = FindInBianryTreeUsingRecursion(root.getRight(), data);

                }
            }
        }

        return false;
    }


    /**
     * 问题四：给出在二叉树中搜索某个元素的算法(非递归方式)
     */
    Boolean SearchUsingLeveOrder(BianryTreeNode root, int data){
        BianryTreeNode temp;


        return false;
    }

    /**
     * 问题五：实现一个元素插入到二叉树中的算法
     */
    public void InsertInBianryTree(BianryTreeNode root, int data){

        //需要插入，先要进行插入位置的判断，也就是还是先得进行查找操作
    }


    /**
     * 问题六：给出获取二叉树节点个数的算法
     */

    /**
     * 问题七：利用非递归的方式给出获取二叉树节点个数的算法
     */

    /**
     * 问题八：实现删除树的算法
     */


}
