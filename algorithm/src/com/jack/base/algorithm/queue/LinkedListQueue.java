package com.jack.base.algorithm.queue;

import com.jack.base.algorithm.stack.ListNode;

import java.util.LinkedList;

/**
 * @author: zq
 * @date: 2024-03-01 15:02
 * @Description: 使用linkedlist实现队列
 */
public class LinkedListQueue {

    private ListNode head, tail;
    private int size = 0;

    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    /**
     * 获取队列的大小
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 判断队列是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 入队
     *
     * @param val val
     */
    public void push(int val) {
        ListNode node = new ListNode(val);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    /**
     * 出队
     *
     * @return val
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int val = head.getVal();
        head = head.getNext();
        size--;
        return val;
    }

    /**
     * 查看队首元素
     *
     * @return val
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return head.getVal();
    }
}
