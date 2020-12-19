package com.njtc;

import java.util.HashMap;
import java.util.HashSet;

public class algorithm_04 {
    public static void main(String[] args) {
        Solution_04 solution=new Solution_04();
        int l=solution.lengthOfLongestSubstring("dvdf");
        System.out.println(l);
    }
}

class Solution_04 {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> h=new HashMap<>();
        int position=0;
        int len=0;
        if(s==""){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                int b=i;
                i=h.get(s.charAt(i));
                h.clear();
                if(b-position>len){
                    len=b-position;
                }

                position=i+1;


            }else{
                if(i==s.length()-1){
                    if(i-position+1>len){
                        len=i-position+1;
                    }

                }
                h.put(s.charAt(i),i);
            }
        }

        return len;
    }
}
