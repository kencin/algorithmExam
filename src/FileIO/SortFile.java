package FileIO;
// Exam1_sort
// SortFile.java
// 2019/4/11 22:38
// Author:Kencin <myzincx@gmail.com>

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class SortFile {
    private final static String INPUT_FILE = "input.txt", OUTPUT_FILE = "output.txt";
    private int num_of_nums;

    public static void main(String[] args){
        //generate_input();
        //get_input();
    }

    public SortFile(int the_num_of_nums){
        num_of_nums = the_num_of_nums;
    }

    public void generate_input(){
        Random random = new Random(1223);
        try {
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(new FileOutputStream (INPUT_FILE),"UTF-8"));
            for(int i = 0; i < num_of_nums; i++){
                writer.write(random.nextInt(num_of_nums) + " ");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public int[] get_input(){
        String line= "";
        int []nums = new int[num_of_nums];

        try{
            Scanner sn = new Scanner(new File(INPUT_FILE));
//            BufferedReader in=new BufferedReader(new FileReader(INPUT_FILE));
//            line = in.readLine();
            for(int i = 0; i < num_of_nums; i++){
                //nums[i] = Integer.parseInt(line.split(" ")[i]);   // 恕我直言， parseInt太鸡儿慢了
                nums[i] = sn.nextInt();
            }
            //in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return nums;
    }

    public void generate_output(int [] nums){
        try{
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE)));
            for(int i = 0;i<nums.length;i++){
                writer.write(nums[i] + " ");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

