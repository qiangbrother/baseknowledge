package com.jack.base.algorithm.queue;

/**
 * @author: zq
 * @date: 2024-03-05 11:07
 * @Description: 双向队列
 */
public class LinkedListDeque {

    /**
     * 头节点
     */
    private DequeNode head;

    /**
     * 尾节点
     */
    private DequeNode tail;

    /**
     * 双向队列长度
     */
    private int queueSize;

    public LinkedListDeque() {
        this.head = null;
        this.tail = null;

    }

    /**
     * 获取队列长度
     *
     * @return int
     */
    public int size() {
        return queueSize;
    }

    /**
     * 判断队列是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * 入队
     *
     * @param val     val
     * @param isFront 是否添加队列头部
     */
    public void push(int val, boolean isFront) {
        DequeNode node = new DequeNode(val);
        //如果队列为空，则头节点和尾节点都指向node
        if (isEmpty()) {
            head = node;
            tail = node;
        } else if (isFront) {
            //将node添加到队列头部
            head.setPrev(node);
            node.setNext(head);
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        queueSize++;
    }

    /**
     * 从队列头部添加元素
     *
     * @param val
     */
    public void pushFirst(int val) {
        push(val, true);
    }

    /**
     * 从队列尾部添加元素
     *
     * @param val
     */
    public void pushLast(int val) {
        push(val, false);
    }

    public int pop(boolean isFront) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("队列为空");
        }
        int val;
        //队首出队操作
        if (isFront) {
            val = head.getVal();
            //删除节点
            DequeNode next = head.getNext();
            if (next != null) {
                next.setPrev(null);
                head.setNext(null);
            }
            head = next;
            //队尾出队操作
        } else {
            val = tail.getVal();
            DequeNode prev = tail.getPrev();
            if (prev != null) {
                prev.setNext(null);
                tail.setPrev(null);
            }
            tail = prev;
        }
        queueSize--;
        return val;
    }

    /**
     * 队列头部出队
     * @return int
     */
    public int popFirst() {
        return pop(true);
    }

    /**
     * 队列尾部出队
     * @return int
     */
    public int popLast() {
        return pop(false);
    }

    /**
     * 队列头部出队
     * @return int
     */
    public int peekFirst(){
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("队列为空");
        }
        return head.getVal();
    }

    /**
     * 队列尾部出队
     * @return int
     */
    public int peekLast(){
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("队列为空");
        }
        return tail.getVal();
    }

}
