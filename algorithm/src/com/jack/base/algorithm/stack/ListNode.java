package com.jack.base.algorithm.stack;

/**
 * @author: zq
 * @date: 2024-02-29 15:52
 * @Description: 链表节点
 */
public class ListNode {

    private int val;

    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
