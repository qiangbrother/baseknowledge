package com.jack.base.algorithm.tree;

/**
 * @author: zq
 * @date: 2024-01-22 10:27
 * @Description: 二叉树节点
 */
public class TreeNode {

    /**
     * 节点值
     */
    private int val;

    /**
     * 左子结点引用
     */
    private TreeNode left;

    /**
     * 右子结点引用
     */
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
