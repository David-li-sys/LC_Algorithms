package com.njtc;

import java.util.Arrays;

public class algorithm_05 {
    public static void main(String[] args) {
        Solution_05 solution=new Solution_05();
        int[] a= {};
        int[] b= {};
        double result=solution.findMedianSortedArrays(a,b);
        System.out.println(result);
    }
}

class Solution_05 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length==0 && nums2.length==0){
            return  0.00000;
        }

        int len=nums1.length+nums2.length;

        int[] one;
        int[] two;

        if(nums1.length >= nums2.length){
            one=nums1;
            two=nums2;
        }else{
            one=nums2;
            two=nums1;
        }
        int[] nums=new int[len];

        for(int i=0;i<len;i++){
            if(i<one.length){
                nums[i]=one[i];
            }else{
                nums[i]=two[i%nums1.length];
            }
        }
        Arrays.sort(nums);
        if(len%2 != 0){
            return nums[len/2];
        }else{
            return (double)(nums[len/2-1]+nums[len/2])/2;
        }

    }
}
