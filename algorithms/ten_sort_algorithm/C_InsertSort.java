package com.njtc.ten_sort_algorithm;

import org.junit.Test;

public class C_InsertSort {

    public int[] insertSort02(int[] arr){


        for(int i=1;i<arr.length;i++){
            int preIndex= i-1;
            int current = arr[i];
            while(preIndex >= 0 && arr[preIndex] >current){
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] =current;
        }
        return arr;
    }
    @Test
    public void test(){
        C_InsertSort insertSort=new C_InsertSort();
        int[] ints = insertSort.insertSort02(new int[]{3, 2, 1,6,7,1});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}

