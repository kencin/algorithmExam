// Exam1_sort
// findMaxArrTest.java
// 2019/5/2 19:06
// Author:Kencin <myzincx@gmail.com>

import FileIO.SortFile;
import algorithm.MaximumSubarray;

public class findMaxArrTest {
    public static void main(String [] args){
        int the_num_of_nums = 10;
        int []nums ={2,4,-7,5,2,-1,2,-4,3};
//        SortFile sf = new SortFile(the_num_of_nums);
//        //sf.generate_input();
//        sf.generate_input();
//        nums = sf.get_input();
        int max =  new MaximumSubarray().findMaxArr(nums, 0, nums.length-1);
    }
}
