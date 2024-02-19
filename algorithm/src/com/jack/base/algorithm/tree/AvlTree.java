package com.jack.base.algorithm.tree;

/**
 * @author: zq
 * @date: 2024-02-19 14:36
 * @Description: avl tree 实现
 */
public class AvlTree {

    /**
     * 获取节点的高度
     *
     * @param avlTreeNode avlTreeNode
     * @return int
     */
    public int height(AvlTreeNode avlTreeNode) {
        //空节点的高度为-1 ,叶节点高度为0
        return avlTreeNode == null ? -1 : avlTreeNode.getHeight();
    }

    /**
     * 更新节点的高度
     *
     * @param avlTreeNode avlTreeNode
     */
    public void updateHeight(AvlTreeNode avlTreeNode) {
        //节点的高度为最高子树树高度+1
        avlTreeNode.setHeight(Math.max(height(avlTreeNode.getLeft()), height(avlTreeNode.getRight())) + 1);
    }

    /**
     * 获取平衡因子 平衡因子为 f 一颗AVL树的任意系欸但的平衡因子皆满足-1<f<1
     *
     * @param avlTreeNode avlTreeNode
     * @return int
     */
    public int balanceFactor(AvlTreeNode avlTreeNode) {
        //空节点平衡因子为0
        if (avlTreeNode == null) {
            return 0;
        }
        return height(avlTreeNode.getLeft()) - height(avlTreeNode.getRight());
    }

    /**
     * 右旋操作
     *
     * @param avlTreeNode avlTreeNode
     * @return AvlTreeNode
     */
    public AvlTreeNode rightRotate(AvlTreeNode avlTreeNode) {
        AvlTreeNode child = avlTreeNode.getLeft();
        AvlTreeNode grandChild = child.getRight();
        //以child为原点，将node向右旋转
        child.setRight(avlTreeNode);
        avlTreeNode.setLeft(grandChild);
        //更新节点高度
        updateHeight(avlTreeNode);
        updateHeight(child);
        //返回旋转后子树的根节点
        return child;
    }

    /**
     * 左旋操作
     *
     * @param avlTreeNode avlTreeNode
     * @return AvlTreeNode
     */
    public AvlTreeNode leftRotate(AvlTreeNode avlTreeNode) {
        AvlTreeNode child = avlTreeNode.getRight();
        AvlTreeNode grandChild = child.getLeft();
        //以child为原点，将node向左旋转
        child.setLeft(avlTreeNode);
        avlTreeNode.setRight(grandChild);
        //更新节点高度
        updateHeight(avlTreeNode);
        updateHeight(child);
        //返回旋转后子树的根节点
        return child;
    }

    /**
     * 执行旋转操作，使该子树重新恢复平衡
     *
     * @param avlTreeNode avlTreeNode
     * @return AvlTreeNode
     */
    public AvlTreeNode rotate(AvlTreeNode avlTreeNode) {
        //获取节点node的平衡因子
        int balanceFactor = balanceFactor(avlTreeNode);
        //左偏树
        if (balanceFactor > 1) {
            if (balanceFactor(avlTreeNode.getLeft()) > 0) {
                //右旋
                return rightRotate(avlTreeNode);
            } else {
                //先左旋后右旋
                avlTreeNode.setLeft(leftRotate(avlTreeNode.getLeft()));
                return rightRotate(avlTreeNode);
            }
        }
        //右偏树
        if (balanceFactor < -1) {
            if (balanceFactor(avlTreeNode.getRight()) < 0) {
                //左旋
                return leftRotate(avlTreeNode);
            } else {
                //先右旋在左旋
                avlTreeNode.setRight(rightRotate(avlTreeNode.getRight()));
                return leftRotate(avlTreeNode);
            }
        }
        //平衡树，无需旋转
        return avlTreeNode;
    }



}
