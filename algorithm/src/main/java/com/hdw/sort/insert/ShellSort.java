package com.hdw.sort.insert;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 希尔排序：模板
 * 又名：缩小增量排序。
 * 每次确定一个增量N，根据增量分成N个数组，每个数组完成插入排序。
 * 137265
 * 增量3，故分为1 2；3 6；7 5。排序后：135267
 * user:hudawei1
 * date:2018/5/24
 * time:17:41
 */
public class ShellSort extends BaseArray{
    private static final Logger log = LoggerFactory.getLogger(ShellSort.class);



    public static void main(String[] args){
        log.info("原数组：{}",randomArrays);
        shellSort(randomArrays);
        log.info("排序后数组：{}",randomArrays);
    }


    public static void shellSort(int[] array){
        for(int pos=array.length/2;pos>0;pos=pos/2){
            //基本等同于简单插入排序
            for(int i=pos;i<array.length;i+=pos){
                int temp = array[i];
                int j = i-pos;
                while(j>=0 && temp<array[j]){
                    array[j+pos] = array[j];
                    j=j-pos;
                }
                array[j+pos] = temp;
            }
        }
    }
}
