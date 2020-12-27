package com.njtc.ten_sort_algorithm;


import org.junit.Test;

public class B_SelectionSort {
    public int[] selectionSort(int[] arr){
        int temp;

        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        return arr;
    }
    @Test
    public void test(){
        int[] ints = selectionSort(new int[]{5, 9, 6, 3, 7});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
