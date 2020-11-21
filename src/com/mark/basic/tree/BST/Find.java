package com.mark.basic.tree.BST;

public class Find {

    BinarySearchTreeNode FindNode(BinarySearchTreeNode root, int data){
        if (root == null) {
            return null;
        }
        if (data < root.getData()){
            return FindNode(root.getLeft(), data);
        }else {
            return  FindNode(root.getRight(),data);
        }
    }

    BinarySearchTreeNode FindNodeWithOutRecursion(BinarySearchTreeNode root, int data){
        if (root == null) {
            return null;
        }
        while (root != null) {
            if (data == root.getData()){
                return root;
            }else if(data > root.getData()){
                root = root.getRight();
            }else {
                root = root.getLeft();
            }
        }
        return null;
    }

    /**
     * 在二叉查找树中寻找最小元素
     */
    BinarySearchTreeNode FindMin(BinarySearchTreeNode root){
        if (root == null) {
            return null;
        }
        if (root.getLeft() == null) {
            return root;
        } else {
            return FindMin(root.getLeft());
        }

    }

    /**
     * 在二叉查找树中寻找最小元素(非递归方式)
     */
    BinarySearchTreeNode FindMinWithOutRecursion(BinarySearchTreeNode root){
        if (root == null) {
            return null;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    /**
     * 在二叉查找树中寻找最大元素
     */
    BinarySearchTreeNode FindMax(BinarySearchTreeNode root){
        if (root == null) {
            return null;
        }
        if (root.getRight() == null) {
            return root;
        } else {
            return FindMin(root.getRight());
        }

    }

    /**
     * 在二叉查找树中寻找最大元素(非递归方式)
     */
    BinarySearchTreeNode FindMaxWithOutRecursion(BinarySearchTreeNode root){
        if (root == null) {
            return null;
        }
        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root;
    }

}
