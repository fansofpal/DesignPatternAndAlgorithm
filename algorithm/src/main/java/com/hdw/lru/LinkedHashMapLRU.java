package com.hdw.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 使用linkedHashMap实现一个lru缓存
 * user:hudawei1
 * date:2018/8/31
 * time:18:04
 */
public class LinkedHashMapLRU extends LinkedHashMap{
    private int maxSize;


    /**
     * 指定构造方法，lru的容量不要超过map默认扩容的容量。
     * accessOrder指定为true，会对每次取出的Entry重排序，放到双向链表的末尾。
     * @param LRUSize
     */
    public LinkedHashMapLRU(int LRUSize) {
        super((int)Math.ceil(LRUSize/0.75f)+1,0.75f,true);
        this.maxSize = LRUSize;
    }


    /**
     * 重写remove方法，当map的实际容量超过lru容量时，移除双向链表头部的Entry。把最老的数据移除掉。
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size()>maxSize;
    }


    public static void main(String[] args) {
        Map<Integer,Integer> linkedHashMapLRU = new LinkedHashMapLRU(5);
        for(int i=0;i<10;i++){
            linkedHashMapLRU.put(i,i);
        }
        for(Map.Entry<Integer,Integer> entry : linkedHashMapLRU.entrySet()){
            System.out.println("LRU:"+entry);
        }
        linkedHashMapLRU.get(6);
        for(Map.Entry<Integer,Integer> entry : linkedHashMapLRU.entrySet()){
            System.out.println("LRU 重排序:"+entry);
        }

    }

}
