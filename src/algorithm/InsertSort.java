package algorithm;// Exam1_sort
// InsertSort.java
// 2019/4/11 22:16
// Author:Kencin <myzincx@gmail.com>

public class InsertSort {
    public int[] start_sort(int []arr){
        long start_time  = System.currentTimeMillis();
        int key, j;
        for(int i = 1;i < arr.length; i++){
            key = arr[i];
            j = i -1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j --;
            }
            arr[j+1] = key;
        }
        System.out.println("Insert sort time used: " + (System.currentTimeMillis() - start_time));
        return arr;
    }
}
