package com.hdw.sort.exchange;

import com.hdw.sort.BaseArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 快速排序（交换型）模板
 * 6 2 3 8 9 5
 * 1.选择基准点6
 * 2.两边扫描，先从右往左扫描，交换5 2 3 8 9 6
 * 3.完成交换后，再从左往右扫描,5 2 3 6 9 8
 * 4.直到两边扫描重叠，这时基准点左侧一定都比基准点小，右侧一定都比基准点大。
 * 5.最后对两边数组递归，完成排序。
 *
 * 数据量大时有优势；在数组数量较小时，一般使用插入排序，效率较高。
 * user:hudawei1
 * date:2018/5/29
 * time:10:30
 */
public class QuickSort extends BaseArray{

    private static final Logger log = LoggerFactory.getLogger(QuickSort.class);


    public static void main(String[] args){
        log.info("原数组："+ Arrays.toString(randomArrays));
        quickSort(randomArrays,0,randomArrays.length-1);
        log.info("新数组："+Arrays.toString(randomArrays));
    }

    public static void quickSort(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int mid = sort(array,low,high);
        quickSort(array,low,mid-1);
        quickSort(array,mid+1,high);
    }

    //数组排序，返回基准点的最后位置
    public static int sort(int[] array,int low, int high){
        int base = array[low];
        while(low<high){
            //左右扫描，先从右往左扫描，遇到比base小的，完成low high交换。
            // 再从左往右扫描，遇到比base大的，完成low high交换。
            //直到最后，low high重叠，其位置就是base的位置。
            while(base<=array[high] && low<high){
                high--;
            }
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            while(base>=array[low] && low<high){
                low++;
            }
            int temp2 = array[low];
            array[low] = array[high];
            array[high] = temp2;

        }
        return low;
    }




}
