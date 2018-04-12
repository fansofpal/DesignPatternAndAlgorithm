package com.hdw.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 二分查找
 * user:hudawei1
 * date:2018/4/12
 * time:16:39
 */
public class BinarySearch extends BaseArray{
    private static final Logger log = LoggerFactory.getLogger(BinarySearch.class);
    static int targetNum = 50;


    public static void binarySearch(){
        log.info("原数组：{}",Arrays.toString(orderedArrays));
        int targetPos = search(0,orderedArrays.length-1,orderedArrays);
        log.info("目标值的位置：{}",targetPos);

    }

    public static int search(int low,int high,int[] orderedArrays){
        int pos = -1;
        if(high-low==1){
            return pos;
        }
        int mid = (low + high)/2;
        if(orderedArrays[mid] > targetNum){
            high = mid;
            pos = search(low,high,orderedArrays);
        }else if(orderedArrays[mid] < targetNum){
            low = mid;
            pos = search(low,high,orderedArrays);
        }else{
            return mid;
        }
        return pos;
    }




    public static void main(String[] args){
        binarySearch();
    }


}
