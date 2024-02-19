package com.jack.base.algorithm.tree;

import javafx.scene.transform.Rotate;

/**
 * @author: zq
 * @date: 2024-01-24 15:44
 * @Description: 二叉搜索树
 */
public class BinarySearchTree {


    public static void main(String[] args) {
        TreeNode root = initTree();
        TreeNode search = search(3, root);
        System.out.println("查找的结果：" + search.getVal());
        insert(8, root);
        remove(8,root);
    }

    /**
     * 初始化二叉搜索树
     *
     * @return root
     */
    public static TreeNode initTree() {
        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        root.setLeft(n2);
        root.setRight(n6);
        n2.setLeft(n1);
        n2.setRight(n3);
        n6.setLeft(n5);
        return root;
    }

    /**
     * 查找
     *
     * @param num  要查找的值
     * @param root 根节点
     * @return TreeNode
     */
    public static TreeNode search(int num, TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.getVal() < num) {
                cur = cur.getRight();
            } else if (cur.getVal() > num) {
                cur = cur.getLeft();
            } else if (cur.getVal() == num) {
                return cur;
            }
        }
        return cur;
    }


    public static void insert(int num, TreeNode root) {
        //若树为空，则初始化节点
        if (root == null) {
            root = new TreeNode(num);
        }
        TreeNode cur = root;
        TreeNode pre = null;
        //查找到需要插入的节点
        while (cur != null) {
            //如果找到重复节点就返回
            if (cur.getVal() == num) {
                return;
            }
            pre = cur;
            //插入到右子树中
            if (cur.getVal() < num) {
                cur = cur.getRight();
                //插入左子树中
            } else {
                cur = cur.getLeft();
            }
        }

        //插入节点
        TreeNode node = new TreeNode(num);
        if (pre.getVal() < num) {
            pre.setRight(node);
        } else {
            pre.setLeft(node);
        }
    }

    public static void remove(int num, TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode cur = root, pre = null;
        //查询需要删除的节点
        while (cur != null) {
            if (cur.getVal() == num) {
                break;
            }
            pre = cur;
            if (cur.getVal() < num) {
                cur = cur.getRight();
            } else {
                cur = cur.getLeft();
            }
        }
        //如果没有删除节点，直接返回
        if (cur == null) {
            return;
        }
        //子系点数量=0 or 1
        if (cur.getLeft() == null && cur.getRight() == null) {
            //当子节点数量为0或者1的时候
            TreeNode child = cur.getLeft() != null ? cur.getLeft() : cur.getRight();
            //删除节点 cur
            if (cur != root) {
                if (pre.getLeft() == cur){
                   pre.setLeft(child);
                }else{
                    pre.setRight(child);
                }
            }else {
                root = child;
            }
        }else{
            //获取中序遍历中 cur的下一个节点
            TreeNode tmp = cur.getRight();
            while (tmp.getLeft() != null) {
                tmp = tmp.getLeft();
            }
            remove(tmp.getVal(),root);
            cur.setVal(tmp.getVal());
        }



    }


}
