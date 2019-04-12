// Exam1_sort
// SortTest.java
// 2019/4/11 22:27
// Author:Kencin <myzincx@gmail.com>

import algorithm.InsertSort;
import FileIO.*;
import algorithm.MergeSort;
import algorithm.QuickSort;

public class SortTest {
    public static void main(String[] args){
        int the_num_of_nums = 100000;
        int []nums;
        SortFile sf = new SortFile(the_num_of_nums);
        //sf.generate_input();
        sf.generate_input_distinct();
        nums = sf.get_input();
//        int []is_nums = new InsertSort().start_sort(nums);
//        long start_time  = System.currentTimeMillis();
//        int []ms_nums = new MergeSort().start_sort(nums);
//        System.out.println("Merge sort time used: " + (System.currentTimeMillis() - start_time));

	    int []qs_nums = new QuickSort().start_sort(nums);
	    int small_num = 5132;
	    if(small_num < 0 || small_num > qs_nums.length){
            System.out.printf("第 %d 小数为： -1\n", small_num);
            return;
        }

	    System.out.printf("第 %d 小数为：%d \n", small_num, qs_nums[small_num - 1]);
//        for(int n:qs_nums){
//            System.out.print(n + " ");
//        }
        //        sf.generate_output(nums);
    }
}
