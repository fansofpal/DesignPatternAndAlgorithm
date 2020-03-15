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
    static int targetNum = 11;


    public static void binarySearch(){
//        int[] orderedArrays = new int[]{0,1,2,3};
        log.info("原数组：{}",Arrays.toString(orderedArrays));
//        int targetPos = search(0,orderedArrays.length-1,orderedArrays);
        int targetPos = search3(orderedArrays,targetNum,0,orderedArrays.length-1);
        log.info("目标值的位置：{}",targetPos);

    }

    public static int search(int low,int high,int[] orderedArrays){
        if(orderedArrays[low] > targetNum || orderedArrays[high] < targetNum || low >= high){
            return -1;
        }
        int mid = (low + high)/2;
        if(orderedArrays[mid] > targetNum){
            high = mid;
            return search(low,high-1,orderedArrays);
        }else if(orderedArrays[mid] < targetNum){
            low = mid;
            return search(low+1,high,orderedArrays);
        }else{
            return mid;
        }
    }

    /**
     * 分治算法示例
     * 0、边界条件
     * 1、分解
     * 2、解决
     * 3、合并结果
     * @param low
     * @param high
     * @param orderedArrays
     * @return
     */
    public static int search2(int low,int high,int[] orderedArrays){
        //1.边界条件，递归中止条件。这里触碰到边界条件，如果使用>号，说明没找到结果，返回-1.
        //如果使用>=号，需要判断当=号成立时，是否满足结果。
        if(low>=high){
            if(orderedArrays[low] == high){
                return low;
            }else{
                return -1;
            }
        }
        //2.分解。通过分解来寻找结果。
        int mid = (low+high)/2;
        int result;
        //3.解决。如果找到结果，则返回结果；否则继续分解。
        if(orderedArrays[mid] == targetNum){
            result = mid;
        }else if(orderedArrays[mid] > targetNum){
            result = search2(low,mid-1,orderedArrays);
        }else{
            result = search2(mid+1,high,orderedArrays);
        }
        //3.合并结果. 拿到执行结果后，应该做合并操作。这里不用合并，直接返回结果。
        return result;
    }

    public static int search3(int[] array, int targetNum, int low, int high){
        if(array == null || array.length == 0){
            return -1;
        }
        while(low <= high){
            int mid = (low + high)/2;
            if(array[mid] > targetNum){
                high = mid - 1;
            }else if(array[mid] < targetNum){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }




    public static void main(String[] args){
        binarySearch();
    }


}
