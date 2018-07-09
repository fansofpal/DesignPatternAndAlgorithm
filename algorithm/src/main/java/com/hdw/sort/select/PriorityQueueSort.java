package com.hdw.sort.select;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;

/**
 * priorityQueue实现的topK问题
 * 内部实现了小顶堆
 * user:hudawei1
 * date:2018/7/9
 * time:14:32
 */
public class PriorityQueueSort extends BaseArray{
    private static final Logger log = LoggerFactory.getLogger(PriorityQueueSort.class);

    public static void main(String[] args){
        log.info("原数组：{}",randomArrays);
        priorityQueueSort(randomArrays);
    }


    public static void priorityQueueSort(int[] array){
        PriorityQueue priorityQueue = new PriorityQueue();
        for(int i=0;i<array.length;i++){
            priorityQueue.add(array[i]);
        }

        while(priorityQueue.size()>0){
            int result = (int)priorityQueue.poll();
            log.info("弹出数字："+result);
        }

    }


}
