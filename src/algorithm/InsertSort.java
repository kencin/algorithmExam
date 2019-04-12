package algorithm;// Exam1_sort
// InsertSort.java
// 2019/4/11 22:16
// Author:Kencin <myzincx@gmail.com>

public class InsertSort {
    private int []arr;

    public InsertSort(int []nums){
        arr = nums;
    }

    public int[] sort(){
        int key, j;
        long start_time  = System.currentTimeMillis();
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

    public void print(){
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
