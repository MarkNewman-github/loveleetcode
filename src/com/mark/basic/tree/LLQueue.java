package com.mark.basic.tree;

import java.lang.Object;


/**
 * 链表队列
 */
public class LLQueue<LLNode> {

    private LLNode frontNode;

    private  LLNode rearNode;

    LLQueue(){
        this.frontNode = null;
        this.rearNode = null;
    }

    public static LLQueue creatQueue(){
        return new LLQueue();
    }

    public boolean isEmpty(){
        return (frontNode == null);
    }

    public void enQueue(BianryTreeNode data){

    }
}
