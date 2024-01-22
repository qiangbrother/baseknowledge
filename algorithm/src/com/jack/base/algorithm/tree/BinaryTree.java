package com.jack.base.algorithm.tree;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: zq
 * @date: 2024-01-22 10:31
 * @Description: 测试类
 */
public class BinaryTree {
    //初始化一个列表，用于保存遍历序列
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        //初始化节点
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        //插入节点
        //在n1和n2之间插入节点p
       /* TreeNode p = new TreeNode(0);
        n1.setLeft(p);
        p.setLeft(n2);*/
        //删除p节点
        /*  n1.setLeft(n2);*/

        //层序遍历
        List<Integer> levelOrder = levelOrder(n1);
        for (int i = 0; i < levelOrder.size(); i++) {
            System.out.print(levelOrder.get(i) + " ");
        }

        preOrder(n1);
        System.out.println();
        System.out.println("前序遍历：");
        list.forEach(i -> System.out.print(i + " "));
        list.clear();
        inOrder(n1);
        System.out.println();
        System.out.println("中序遍历：");
        list.forEach(i -> System.out.print(i + " "));
        list.clear();
        postOrder(n1);
        System.out.println();
        System.out.println("后序遍历：");
        list.forEach(i -> System.out.print(i + " "));

    }

    /**
     * 二叉树的层序遍历
     *
     * @param root
     * @return list
     */
    public static List<Integer> levelOrder(TreeNode root) {
        //初始化队列，加入根节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //初始化一个列表，用于保存遍历序列
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.getVal());
            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }
        return list;
    }

    /**
     * 前序遍历
     *
     * @param root
     */
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        //前序遍历规则：根节点-->左节点-->右节点
        list.add(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        //中序遍历规则：左节点-->根节点-->右节点
        inOrder(root.getLeft());
        list.add(root.getVal());
        inOrder(root.getRight());
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        //后序遍历规则：左节点-->右节点-->根节点
        postOrder(root.getLeft());
        postOrder(root.getRight());
        list.add(root.getVal());
    }


}
