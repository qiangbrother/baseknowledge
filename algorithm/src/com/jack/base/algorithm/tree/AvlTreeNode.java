package com.jack.base.algorithm.tree;

/**
 * @author: zq
 * @date: 2024-02-19 14:47
 * @Description:
 */

public class AvlTreeNode {

    private int value;

    private int height;

    private AvlTreeNode left;

    private AvlTreeNode right;

    public AvlTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public AvlTreeNode getLeft() {
        return left;
    }

    public void setLeft(AvlTreeNode left) {
        this.left = left;
    }

    public AvlTreeNode getRight() {
        return right;
    }

    public void setRight(AvlTreeNode right) {
        this.right = right;
    }
}
