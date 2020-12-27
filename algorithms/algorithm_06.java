package com.njtc;

public class algorithm_06 {
    public static void main(String[] args) {
        Solution_06 solution=new Solution_06();
        String result = solution.longestPalindrome("");
        System.out.println(result);

    }
}

class Solution_06 {
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(!(s.charAt(i) == s.charAt(s.length()-1-i))){
                return "0";
            }
        }

        return "1";
    }
}
