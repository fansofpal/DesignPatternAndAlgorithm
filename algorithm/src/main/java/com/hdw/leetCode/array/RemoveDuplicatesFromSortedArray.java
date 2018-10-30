package com.hdw.leetCode.array;

/**
 * 有序数组去重，返回不重复的数组长度。
 * nums里面也要去重，把不重复的数字前置。
 * user:hudawei1
 * date:2018/10/30
 * time:16:56
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,1,2,2,2,3}));
    }

    /**
     * 相邻比较占位
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int pos = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[pos] = nums[i];
                pos++;
            }

        }
        return pos;
    }
}
