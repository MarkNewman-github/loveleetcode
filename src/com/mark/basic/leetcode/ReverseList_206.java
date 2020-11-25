package com.mark.basic.leetcode;

import java.util.List;

/**
 *
 * @author mark
 */
public class ReverseList_206 {

    public static void main(String[] args) {

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = null;

        while (cur != null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            cur = nextTemp;
        }

        return pre;
    }

    public static ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head = null;
        return p;
    }
}
