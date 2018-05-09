package com.hdw.sort.merge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 归并排序简化版
 * 先完成两个有序数组的合并。
 * user:hudawei1
 * date:2018/5/9
 * time:10:45
 */
public class SortedArrayMerge {
    private static final Logger log = LoggerFactory.getLogger(SortedArrayMerge.class);


    public static final int[] arrayA = new int[]{1,3,6,7,11,15};

    public static final int[] arrayB = new int[]{2,4,5,9,17,18};


    public static int[] merge(int[] arrayA,int[] arrayB){
        int[] temp = new int[arrayA.length + arrayB.length];
        int posA = 0;
        int posB = 0;
        int pos = 0;
        while(posA<arrayA.length && posB < arrayB.length){
            if(arrayA[posA]<arrayB[posB]){
                temp[pos] = arrayA[posA];
                posA++;
            }else{
                temp[pos] = arrayB[posB];
                posB++;
            }
            pos++;
        }
        if(posA<arrayA.length){
            for(int i=posA;i<arrayA.length;i++){
                temp[pos++] = arrayA[i];
            }
        }else{
            for(int i=posB;i<arrayB.length;i++){
                temp[pos++] = arrayB[i];
            }
        }
        return temp;

    }


    public static void main(String[] args){
        int[] result = merge(arrayA,arrayB);
        log.info("结果：{}", Arrays.toString(result));
    }


}
