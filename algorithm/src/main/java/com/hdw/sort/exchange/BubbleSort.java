package com.hdw.sort.exchange;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 相邻两个元素交换位置，外层从前往后，内层从后往前。
 * 冒泡排序（交换型）
 * user:hudawei1
 * date:2018/4/17
 * time:20:49
 */
public class BubbleSort extends BaseArray {
    private static final Logger log = LoggerFactory.getLogger(BubbleSort.class);


    public static void main(String[] args){
        log.info("原数组："+ Arrays.toString(randomArrays));
        bubbleSort(randomArrays);
        log.info("新数组："+Arrays.toString(randomArrays));
    }


    /**
     * 从小到大
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array){
        if(array == null || array.length == 0 || array.length == 1){
            return array;
        }
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
