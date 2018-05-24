package com.hdw.sort.insert;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 每个节点跟前面的元素比较，如果比元素小，则插入它的位置；后面的元素依次移动一个。
 * 类似于插扑克牌
 * 插入排序（插入型）
 * user:hudawei1
 * date:2018/5/2
 * time:16:08
 */
public class InsertSort extends BaseArray{

    private static final Logger log = LoggerFactory.getLogger(InsertSort.class);


    public static void main(String[] args){
        log.info("原数组：{}",randomArrays);

        insertSort(randomArrays);
        log.info("排序后数组：{}",randomArrays);
    }

    public static void insertSort(int[] randomArrays){
        for(int i=0;i<randomArrays.length-1;i++){
            int base = randomArrays[i+1];
            for(int j=0;j<i+1;j++){
                if(base<randomArrays[j]){//如果base小于某个值，则插入该值的位置处。后面的按顺序移动。位置移动先移动尾部
                    //从尾部pos开始移动，pos-1移动到pos上，依次类推。最后base插入j的位置。
                    int pos = i+1;
                    while(pos>j){
                        randomArrays[pos] = randomArrays[pos-1];
                        pos--;
                    }
                    randomArrays[j] = base;
                    break;
                }
            }
        }
    }
}
