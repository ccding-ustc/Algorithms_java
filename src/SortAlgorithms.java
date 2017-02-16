
import java.util.Arrays;

/**
 * 
 * @ClassName: SortAlgorithms
 *
 * @Description: 常见的排序算法 java 实现
 * void bubbleSort(T[]) 冒泡排序
 * void insertSort(T[]) 插入排序
 * void selectSort(T[]) 选择排序
 * void shellSort(T[]) 希尔排序
 * @author: ccding
 * @date: 2016年10月26日 上午10:50:55
 *
 * @param <T> 待排序元素的类型
 */
public class SortAlgorithms <T extends Comparable<T>> {
	public void bubbleSort(T[] nums){
		T tmp;
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[j].compareTo(nums[i]) < 0){
					tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
			}
		}
	}
	
	public void insertSort(T[] nums){
		T tmp;
		for(int i=1; i<nums.length; i++){
			tmp = nums[i];
			int j = i-1;
			while(j>=0 && tmp.compareTo(nums[j]) < 0){
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = tmp;
		}
	}
	
	public void selectSort(T[] nums){
		T tmp;
		int minIndex;
		for(int i=0; i<nums.length; i++){
			minIndex = this.getMinIndex(nums, i);
			tmp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = tmp;
		}
			
		
	}
	
	int getMinIndex(T[] nums, int startIndex){
		T minValue = nums[startIndex];
		int minIndex = startIndex;
		for(int i=startIndex; i<nums.length; i++){
			if(minValue.compareTo(nums[i]) > 0){
				minValue = nums[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public void shellSort(T[] nums){
		int gap = nums.length >> 1;
		T tmp;
		while(gap >= 1){
			for(int i=gap; i<nums.length; i++){
				if(nums[i].compareTo(nums[i-gap]) < 0){
					tmp = nums[i];
					int j = i-gap;
					while( j>=0 && tmp.compareTo(nums[j])<0){
						nums[j+gap] = nums[j];
						j -= gap;
					}
					nums[j+gap] = tmp;
				}
			}
			gap = gap >> 1;
		}
	}
	public void mergeSort(T[] nums){
		mergeSort(nums, 0, nums.length);
	}
	private void mergeSort(T[] nums, int startIndex, int endIndex){
		if(endIndex > startIndex){
			int midIndex = (endIndex-startIndex) >> 1;
			mergeSort(nums, startIndex, midIndex);
			mergeSort(nums, midIndex+1, endIndex);
			merge(nums, startIndex, midIndex, endIndex);
		}
	}
	private void merge(T[] nums, int s, int m, int e){
		T[] sub1 = Arrays.copyOfRange(nums, s, m);
		T[] sub2 = Arrays.copyOfRange(nums, m, e);
		int idx1 = 0, idx2 = 0;
		while(idx1<sub1.length && idx2<sub2.length){
			if(sub1[idx1].compareTo(sub2[idx2]) < 0){
				nums[idx1+idx2] = sub1[idx1];
				idx1++;
			}else{
				nums[idx1+idx2] = sub2[idx2];
				idx2++;
			}
		}
	}
}
