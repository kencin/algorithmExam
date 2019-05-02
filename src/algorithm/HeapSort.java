package algorithm;
// Exam1_sort
// HeapSort.java
// 2019/4/17 19:22
// Author:Kencin <myzincx@gmail.com>

public class HeapSort {

    public static int[] heapSort(int[] target) {
        if (target != null && target.length > 1) {

            // 调整为最大堆
            int pos = (target.length - 2) / 2;
            while (pos >= 0) {
                shiftDown(target, pos, target.length - 1);
                pos--;
            }

            // 堆排序
            for (int i = target.length-1; i > 0; i--) {
                int temp = target[i];
                target[i] = target[0];
                target[0] = temp;
                shiftDown(target, 0, i-1);
            }
            return target;
        }
        return target;
    }

    private static void shiftDown(int[] target, int start, int end) {
        int i = start;
        int j = 2 * start + 1;
        int temp = target[i];
        while (j <= end) {   // 迭代条件
            if (j < end && target[j + 1] > target[j]) {  //找出较大子女
                j = j + 1;
            }
            if (target[j] <= temp) {  // 父亲大于子女
                break;
            } else {
                target[i] = target[j];
                i = j;
                j = 2 * j + 1;
            }
        }
        target[i] = temp;
    }
}
