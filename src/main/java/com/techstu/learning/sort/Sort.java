package com.techstu.learning.sort;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class Sort {
    @Bean
    public Sort getSort(){
        return new Sort();
    }
    public void test(){
        int[] array=new int[8];
        Sort sort=new Sort();
        fillArray(array);
        System.out.println("快速排序前："+ Arrays.toString(array));
        sort.quickSort(array,0,array.length-1);
        System.out.println("排序后："+ Arrays.toString(array));
        System.out.println("---------------------------------------");

        fillArray(array);
        System.out.println("冒泡排序前："+ Arrays.toString(array));
        sort.bubbleSort(array);
        System.out.println("排序后："+ Arrays.toString(array));
        System.out.println("---------------------------------------");

        fillArray(array);
        System.out.println("插入排序前："+ Arrays.toString(array));
        sort.insertSort(array);
        System.out.println("排序后："+ Arrays.toString(array));
        System.out.println("---------------------------------------");

        fillArray(array);
        System.out.println("选择排序前："+ Arrays.toString(array));
        sort.selectSort(array);
        System.out.println("排序后："+ Arrays.toString(array));
        System.out.println("---------------------------------------");
    }

    //冒泡排序
    private void bubbleSort(int[] nums){
        int temp;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    //选择排序
    private void selectSort(int[] nums) {
        int index;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (index != i) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
    }
    //插入排序
    private void insertSort(int[] nums){
        int i,j,k;
        for(i=1;i<nums.length;i++){
            k=nums[i];
            j=i-1;
            while(j>=0&&nums[j]>k){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=k;
        }
    }
    //快速排序
    private void quickSort(int[] array,int low,int high){

        int i,j,pivot;
        pivot=array[low];
        i=low;
        j=high;
        while (i<j){
            while(i<j&&array[j]>=pivot){
                j--;
            }
            array[i]=array[j];
            while(i<j&&array[i]<=pivot){
                i++;
            }
            array[j]=array[i];
        }
        array[i]=pivot;
        if(low<i){
            quickSort(array,low,i-1);
        }
        if(high>i){
            quickSort(array,i+1,high);
        }

    }

    private void fillArray(int[] array){
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(50);
        }
    }
}
