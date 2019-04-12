package algorithm;
// Exam1_sort
// MergeSort.java
// 2019/4/12 16:12
// Author:Kencin <myzincx@gmail.com>

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    //private int [] arrs;

   // public MergeSort(int []nums){
    //    arrs = nums;
   // }
     //static void main(String [] args){
        //int [] a = {5, 3, 13, 24, 3, 2, 15, 6, 12};
       // int []public b = divided(a);
        //for(int i =0; i < b.length;i++){
        //    System.out.print(b[i] + "  ");
        //}
    //}

    public int[] divided(int [] arrs){

        if(arrs.length < 2) return arrs;
        int mid = arrs.length / 2;
        int [] left = Arrays.copyOfRange(arrs, 0, mid);
        int [] right = Arrays.copyOfRange(arrs, mid, arrs.length);
        return merge(divided(left),divided(right));
    }

    public int[] merge(int[] left, int[] right) {
        //for(int i = 0; i<left.length;i++){
         //   System.out.print(left[i] + "  ");
        //}
        //System.out.println();
        //for(int i = 0; i<right.length;i++){
         //   System.out.print(right[i] + "  ");
        //}
        //System.out.println();
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

}
