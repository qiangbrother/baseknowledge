package com.jack.base.algorithm.stack;

import java.util.ArrayList;

/**
 * @author: zq
 * @date: 2024-02-29 17:09
 * @Description: ArrayList实现的栈
 */
public class ArrayListStack {

    private ArrayList<Integer> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void push(int num) {
        stack.add(num);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return stack.get(stack.size() - 1);
    }

    public int[] toArray() {
        int[] arr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }

}
