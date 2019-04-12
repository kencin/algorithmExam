package algorithm;

public class QuickSort(){
	public int[] sort(int num[], int left, int right) {
		if (left <right) {
			int index = partition(num, left, right);
			sort(num, left, index-1);
			sort(num, index, right);
		}
		return num;
	}

	public int partition(int[] num, int left, int right) {
		if(num==null || num.length<=0 || left<0 || right>=num.length){
			return 0;
		}
		int prio = num[left + (right - left) / 2];
		while(left<=right){
			while (num[left] < prio)
				left++;
			while (num[right] > prio)
				right--;
			if (left<=right) {
				swap(num, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public void swap(int[] num, int left, int right) {
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
	}
}