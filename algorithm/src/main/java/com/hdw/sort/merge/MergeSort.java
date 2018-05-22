package com.hdw.sort.merge;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 归并排序
 * 先通过二分思想将大数组拆分成无数小数组，完成小数组排序。再将有序的小数组两两合并。
 * 模板
 * user:hudawei1
 * date:2018/5/9
 * time:10:34
 */
public class MergeSort extends BaseArray {
    private static final Logger log = LoggerFactory.getLogger(MergeSort.class);


    public static void main(String[] args){
        log.info("原数组：{}", Arrays.toString(randomArrays));
        sort(BaseArray.randomArrays,0,BaseArray.randomArrays.length-1);
        log.info("排序后数组：{}", Arrays.toString(randomArrays));

    }

    public static void merge(int[] a,int low, int mid, int high){
        int[] temp = new int[high-low+1];
        //数据分成两部分，比较
        int leftStart = low;
        int rightStart = mid+1;
        int tempPos = 0;//临时数组的起始值是0
        //
        while(leftStart<=mid && rightStart<=high){
            if(a[leftStart]<=a[rightStart]){
                temp[tempPos++] = a[leftStart++];
            }else{
                temp[tempPos++] = a[rightStart++];
            }
        }
        //将剩余的部分挪到临时数组中
        while(leftStart<=mid){
            temp[tempPos++] = a[leftStart++];
        }
        while (rightStart<=high){
            temp[tempPos++] = a[rightStart++];
        }

        //修改原数组a
        for(int i=0;i<temp.length;i++){
            a[low++] = temp[i];
        }

    }

    public static void sort(int[] array,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            //左递归
            sort(array,low,mid);
            //右递归
            sort(array,mid+1,high);
            //左右合并
            merge(array,low,mid,high);

        }

    }

}
