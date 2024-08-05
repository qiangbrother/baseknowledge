package com.jack.base.algorithm.Hash;

/**
 * @author: zq
 * @date: 2024-01-22 10:27
 * @Description: Hash链式寻址
 */
public class HashMapChaining {
    /**
     * 键值对数量
     */
    int size;

    /**
     * 哈希容量
     */
    int capacity;

    /**
     * 触发扩容的负载因子阈值
     */
    double loadFactor;

    /**
     * 扩容倍数
     */
    int extendRatio;


}
