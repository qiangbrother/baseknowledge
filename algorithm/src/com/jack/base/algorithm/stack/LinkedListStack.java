package com.jack.base.algorithm.stack;

/**
 * @author: zq
 * @date: 2024-02-29 15:50
 * @Description: 用于链表实现栈
 */
public class LinkedListStack {

    /**
     * 栈头
     */
    private ListNode stackHead;

    /**
     * 栈大小
     */
    private int stackSize;

    /**
     * 获取栈大小
     */
    public int size() {
        return stackSize;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return stackSize == 0;
    }

    /**
     * 入栈
     *
     * @param num num
     */
    public void push(int num) {
        ListNode node = new ListNode(num);
        if (isEmpty()) {
            stackHead = node;
        } else {
            node.setNext(stackHead);
            stackHead = node;
        }
        stackSize++;
    }

    /**
     * 出栈
     *
     * @return int
     */
    public int pop() {
        int val = peek();
        stackHead = stackHead.getNext();
        stackSize--;
        return val;
    }

    /**
     * 获取栈顶元素
     *
     * @return int
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return stackHead.getVal();
    }

    /**
     * 转换成数组
     *
     * @return int[]
     */
    public int[] toArray() {
        int[] arr = new int[stackSize];
        ListNode node = stackHead;
        for (int i = 0; i < stackSize; i++) {
            arr[i] = node.getVal();
            node = node.getNext();
        }
        return arr;
    }

}
