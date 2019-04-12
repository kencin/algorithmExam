// Exam1_sort
// SortTest.java
// 2019/4/11 22:27
// Author:Kencin <myzincx@gmail.com>

import algorithm.InsertSort;
import FileIO.*;
import algorithm.MergeSort;

public class SortTest {
    public static void main(String[] args){
        int the_num_of_nums = 1000000;
        int []nums;
        SortFile sf = new SortFile(the_num_of_nums);
        //sf.generate_input();
        nums = sf.get_input();
        InsertSort is = new InsertSort(nums);
        //is.sort();
        MergeSort ms = new MergeSort();
        long start_time  = System.currentTimeMillis();
        nums = ms.divided(nums);
        System.out.println("Merge sort time used: " + (System.currentTimeMillis() - start_time));
        sf.generate_output(nums);
	    
    }
}
