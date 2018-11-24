package com.example.leecode.array;

/**
 * @author baiyun@56p2b.com
 * @date 2018/11/22/022  20:40
 */

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 *
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
public class MinSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums) {
       int l = 0;
       int r = 0;
       int sum = 0;
       int size = 0;
       while (l<=nums.length-1){
           if(r<=nums.length-1  ){
              if(r == l){
                  sum += nums[l];
              }else {
                  sum += nums[r];
              }
               if(sum >= s){
                   if(size == 0 ){
                       size = r-l+1;
                   }else if (size > r-l+1){
                       size = r-l+1;
                   }
                //   System.out.println(r-l+1);
               }
               r ++;
           }else {
               sum = 0;
               l ++;
               r = l;
           }

       }

        return size;
    }


    public static void main(String[] args) {
     //7   int[] a =  new int[]{2,3,1,2,4,3};
        int[] a =  new int[]{1,4,4};
        int i = minSubArrayLen(4, a);
//        int[] a =  new int[]{2,3,1,2,4,3};
//        int i = minSubArrayLen(7, a);
        System.out.println("i="+i);
    }
}

