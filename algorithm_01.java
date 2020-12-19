package com.njtc;

import java.util.Arrays;
import java.util.List;

public class algorithm_01 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        char c=solution.findTheDifference("abcd","abcde");
        System.out.println(c);
    }
}

class Solution {
    public char findTheDifference(String s, String t) {
//        char ss[]=s.toCharArray();
//        char ts[]=t.toCharArray();
//
//        int a=0;
//        int b=0;
//
//        for (char c : ss) {
//            a+=c;
//        }
//        for (char c : ts) {
//            b+=c;
//        }


        char[] charArr = s.concat(t).toCharArray();
        char res = 0;
        for (char c : charArr) {
            res ^= c;
            System.out.println(res);
        }
        return res;





//        return (char)(b-a);
    }

    public void twoSum(int[] nums, int i) {
    }
}
