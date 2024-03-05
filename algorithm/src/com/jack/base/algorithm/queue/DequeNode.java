package com.jack.base.algorithm.queue;

/**
 * @author: zq
 * @date: 2024-03-05 11:09
 * @Description:  双向队列节点
 */
public class DequeNode {

    private int val;
    private DequeNode next;
    private DequeNode prev;

    public DequeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DequeNode getNext() {
        return next;
    }

    public void setNext(DequeNode next) {
        this.next = next;
    }

    public DequeNode getPrev() {
        return prev;
    }

    public void setPrev(DequeNode prev) {
        this.prev = prev;
    }
}
