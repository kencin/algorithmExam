package algorithm;
// Exam1_sort
// MaximumSubarray.java
// 2019/5/2 17:45
// Author:Kencin <myzincx@gmail.com>
// 最大连续字数组

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Arrays;

public class MaximumSubarray {
//    public static void main(String [] args){
//        int [] arr = {2,4,-7,5,2,-1,2,-4,3};
//        int max = viloentSearch(arr);
//        System.out.println(max);
//    }

    // 1. 暴力搜索法
    public int viloentSearch(int [] arr){
        int [] maximumArr;
        int max = 0;
        for(int i=0 ;i<arr.length;i++){
            int maxCurrent = 0;
            for(int j=i;j<arr.length;j++){
                maxCurrent += arr[j];
                if(maxCurrent > max){
                    max = maxCurrent;
                }
            }
        }
        return max;
    }

    //  2.分治法
    public int findMaxArr(int []arr, int low,int high){
        if(low == high){
            return arr[high];
        }
        int mid = (low+high)/2;
        int left = findMaxArr(arr, low, mid);
        int right = findMaxArr(arr, mid+1, high);
        int cross = findMaxCrossArr(arr,low,high,mid);
        if(left >= right && left>= cross) return left;
        else if(right >= left && right >= cross) return right;
        else return cross;
    }

    public int findMaxCrossArr(int []arr, int low, int high, int mid){
        int leftSum = 0;
        int leftMax = arr[mid];
        for(int i = mid;i>=low;i--){
            leftSum += arr[i];
            if(leftSum > leftMax){
                leftMax = leftSum;
            }
        }

        int rightSum = 0;
        int rightMax = arr[mid+1];
        for(int i =mid+1;i<=high;i++){
            rightSum += arr[i];
            if(rightSum > rightMax){
                rightMax = rightSum;
            }
        }

        return leftMax+rightMax;
    }
}
