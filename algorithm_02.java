package com.njtc;

import java.util.HashMap;

public class algorithm_02 {
    public static void main(String[] args) {
        Solution_02 solution=new Solution_02();
        int nums[]={2,7,11,15};
        int result[]=solution.twoSum(nums,9);
        for (int i : result) {
            System.out.println(i);
        }

    }
}

class Solution_02 {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                result[0]=hash.get(nums[i]);
                result[1]=i;
            }
            hash.put(target-nums[i],i);
        }
        return result;
    }
}
