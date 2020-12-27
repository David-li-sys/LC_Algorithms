package com.njtc.ten_sort_algorithm;

import org.junit.Test;

public class D_ShellSort {
    public int[] shellSort(int[] arr){
        int len = arr.length;
        int d = (int) Math.floor(arr.length/2);
        for(int i = d; i>0; i= (int) Math.floor(i/2)){
            for(int j=i;j<len;j++){
                int current = arr[j];
                int preIndex = j-i;
                while(preIndex>=0 && current < arr[preIndex]){
                    arr[preIndex+i] = arr[preIndex];
                    preIndex = preIndex - i;
                }
                arr[preIndex+i]=current;
            }
        }
        return arr;
    }

    @Test
    public void test(){
        D_ShellSort shellSort=new D_ShellSort();
        int[] ints = shellSort.shellSort(new int[]{5, 9, 6, 3, 7,6,1});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}


