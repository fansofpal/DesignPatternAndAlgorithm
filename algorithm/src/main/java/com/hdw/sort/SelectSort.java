package com.hdw.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.hdw.sort.BaseArray.randomArrays;

/**
 * 简单选择排序
 * 每次循环记录最小的位置，完成交换。
 * user:hudawei1
 * date:2018/5/4
 * time:9:41
 */
public class SelectSort {
    private static final Logger log = LoggerFactory.getLogger(SelectSort.class);

    public static void main(String[] args){
        log.info("原数组：{}",randomArrays);
        selectSort(randomArrays);
        log.info("排序后数组：{}",randomArrays);

    }


    public static void selectSort(int[] randomArrays){

        for(int i=0;i<randomArrays.length-1;i++){
            int pos = i;
            int min = randomArrays[i];
            for(int j=i+1;j<randomArrays.length;j++){
                if(randomArrays[j]<min){
                    min = randomArrays[j];
                    pos = j;
                }
            }
            //找到了最小值，则交换位置
            if(pos != i){
                int temp = randomArrays[pos];
                randomArrays[pos] = randomArrays[i];
                randomArrays[i] = temp;
            }
        }

    }
}
