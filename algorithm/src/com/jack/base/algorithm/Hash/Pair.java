package com.jack.base.algorithm.Hash;

/**
 * @author: zq
 * @date: 2024-07-03 16:18
 * @Description: 键值对
 */
public class Pair {

    public int key;
    public String val;

    public Pair(int key, String val) {
        this.key = key;
        this.val = val;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
