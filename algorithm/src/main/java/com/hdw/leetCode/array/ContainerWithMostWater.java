package com.hdw.leetCode.array;

/**
 * 11题：数组[2,3,6,1,4] 横坐标为i，纵坐标为a[i]。 每个点对x轴做垂线，两条线和x轴围成一个平面水桶，返回能装最多水的那个桶面积。
 * 时间复杂度低于n2
 */
public class ContainerWithMostWater {


    public static void main(String[] args){
        int[] height = new int[]{1,2,4,3};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if(height==null || height.length<2){
            return 0;
        }
        int maxArea = 0;
        int i=0;
        int j = height.length-1;
        while(i<j){
            int l1 = j-i;
            int l2 = 0;
            if(height[i]<height[j]){
                l2 = height[i];
                i++;
            }else{
                l2 = height[j];
                j--;
            }
            int tempArea = l1*l2;
            if(tempArea>maxArea){
                maxArea = tempArea;
            }
        }
        return maxArea;

    }

}
