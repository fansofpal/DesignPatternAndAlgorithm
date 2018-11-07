package com.hdw.leetCode.array;

/**
 * 经典问题：最大子数组
 * O(n)和O(nlogn)解法
 *
 * user:hudawei1
 * date:2018/10/31
 * time:16:57
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }


    /**
     * O(n)解法
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int num : nums){
            maxSum = Math.max(num,maxSum+num);
            max = Math.max(max,maxSum);
        }

        return max;

    }

    /**
     * O(nlogn)解法
     * 分治解法
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        return maxSub(0,nums.length-1,nums);

    }

    public static int maxSub(int low,int high,int[] nums){
        //1.边界条件。触发边界时，数组只有一个数字，说明最大子数组的和肯定是这个数字本身,返回这个数字。
        if(low>=high){
            return nums[low];
        }
        //2.分解。
        int mid = (low + high)/2;
        //3.解决。如果最大子数组的和一定在mid的两侧，则问题已经简化为寻找数组的最大值。
        // 对左右两侧的数组分别递归，再返回两者比较大的那个数字即可。
        int subLeftMax = maxSub(low,mid-1,nums);
        int subRightMax = maxSub(mid+1,high,nums);
        //还有一种可能，就是最大子数组包含了mid。需要使用mid向做叠加，获得最大值。再使用这个最大值，从mid向右做叠加。
        //最终获得的值即为第三种情况的最大值。 最终返回结果需要比较这三种情况的最大值，再返回。
        int leftMax = nums[mid];
        int t = leftMax;
        for(int i=mid-1;i>=low;i--){
            t = t + nums[i];
            leftMax = Math.max(leftMax,t);
        }
        int rightMax = leftMax;
        t = rightMax;
        for(int i=mid+1;i<=high;i++){
            t = t + nums[i];
            rightMax = Math.max(rightMax,t);
        }

        //4. 合并。比较这三种情况的最大值，返回最大的那个。
        return Math.max(rightMax,Math.max(subLeftMax,subRightMax));

    }
}
