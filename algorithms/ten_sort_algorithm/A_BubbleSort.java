package com.njtc.ten_sort_algorithm;

import org.junit.Test;

public class A_BubbleSort {

    public int[] bubbleSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if( arr[j] > arr[j+1] ){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    @Test
    public void test(){
        int[] ints = bubbleSort(new int[]{1, 2, 9, 7});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
