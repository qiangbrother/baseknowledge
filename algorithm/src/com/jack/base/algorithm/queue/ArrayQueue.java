package com.jack.base.algorithm.queue;

/**
 * @author: zq
 * @date: 2024-03-01 15:24
 * @Description: 基于环形数组实现的队列
 */
public class ArrayQueue {
    /**
     * 用于存储队列元素的数组
     */
    private int[] nums;

    /**
     * 队列头
     */
    private int head;

    /**
     * 队列大小
     */
    private int queueSize;

    public ArrayQueue(int capacity) {
        nums = new int[capacity];
        queueSize = 0;
        head = 0;
    }

    /**
     * 获取队列容量
     * @return int
     */
    public int capacity() {
        return nums.length;
    }

    /**
     * 获取队列的长度
     * @return int
     */
    public int size() {
        return queueSize;
    }

    /**
     * 判断队列是否为空
     * @return boolean
     */
    public boolean isEmpty() {
        return queueSize == 0;
    }

    /**
     * 入队
     * @param val
     */
    public void push(int val) {
        if (queueSize == capacity()) {
            throw new RuntimeException("队列已满");
        }
        //通过取余操作实现rear插入到数组尾部
        int rear = (head + queueSize) % capacity();
        nums[rear] = val;
        queueSize++;
    }

    /**
     * 出队
     * @return int
     */
    public int pop() {
        int val = peek();
        head = (head + 1) % capacity();
        queueSize--;
        return val;
    }

    /**
     * 查看队列头部元素
     * @return int
     */
    public int peek() {
        if (queueSize == 0) {
            throw new RuntimeException("队列为空");
        }
        int rear = (head + queueSize - 1) % capacity();
        return nums[rear];
    }
}
