package com.hdw.sort.insert;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单插入
 * 模板
 * 例：135264
 * 思路：1. 从第二位开始循环
 * 2. 2不要从前往后比较，将2直接插入3 5之前，会导致3 5顺序后移1位。而移位应该从后面开始移动。
 * 3. 建议2从后往前比较。比5小，则5后移1位；比3小，则3后移1位；比1大，则不动。最后把2插入3移动后的空位上。
 * 4. 一次遍历即可。
 * user:hudawei1
 * date:2018/5/23
 * time:9:45
 */
public class InsertSort2 extends BaseArray{
    private static final Logger log = LoggerFactory.getLogger(InsertSort2.class);



    public static void main(String[] args){
        log.info("原数组：{}",randomArrays);
        insertSort(randomArrays);
        log.info("排序后数组：{}",randomArrays);
    }


    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }



}
