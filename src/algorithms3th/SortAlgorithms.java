package algorithms3th;

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
 * void mergeSort(T[]) 归并排序
 * void quickSort(T[]) 快速排序
 * void heapSort(T[]) 堆排序
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
	private int getMinIndex(T[] nums, int startIndex){
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
		mergeSort(nums, 0, nums.length-1);
	}
	private void mergeSort(T[] nums, int startIndex, int endIndex){
		if(endIndex > startIndex){
			int midIndex = (endIndex+startIndex) >> 1;
			mergeSort(nums, startIndex, midIndex);
			mergeSort(nums, midIndex+1, endIndex);
			merge(nums, startIndex, midIndex, endIndex);
		}
	}
	private void merge(T[] nums, int s, int m, int e){
		T[] sub1 = Arrays.copyOfRange(nums, s, m+1);
		T[] sub2 = Arrays.copyOfRange(nums, m+1, e+1);
		int idx1 = 0, idx2 = 0;
		int k=s;
		while(idx1<sub1.length && idx2<sub2.length){
			if(sub1[idx1].compareTo(sub2[idx2]) < 0){
				nums[k++] = sub1[idx1++];
			}else{
				nums[k++] = sub2[idx2++];
			}
		}
		while(idx1<sub1.length){
			nums[k++] = sub1[idx1++];
		}
		while(idx2<sub2.length){
			nums[k++] = sub2[idx2++];
		}
	}
	
	public void quickSort(T[] nums){
		quickSort(nums, 0, nums.length-1);
	}
	private void quickSort(T[] nums, int s, int t){
		if(s < t){
			int mid = partition(nums, s, t);
			quickSort(nums, s, mid-1);
			quickSort(nums, mid+1, t);
		}
	}
	private int partition(T[] nums, int s, int t){
		int randomIdx = (int)((t-s) * Math.random())+s;
		T e = nums[randomIdx];
		exchange(nums, randomIdx, t);
		while(s < t){
			while(s<t && nums[s].compareTo(e) <= 0)
				s++;
			nums[t] = nums[s];
			while(s<t && nums[t].compareTo(e) >= 0)
				t--;
			nums[s] = nums[t];
		}
		nums[s] = e;
		return s;
	}
	
	public void heapSort(T[] nums){
		buildMinHeap(nums);
		int heapSize = nums.length;
		for(int i=nums.length-1; i>=0; i--){
			exchange(nums, i, 0);
			heapify(nums, 0, --heapSize);
		}
	}
	private void buildMinHeap(T[] nums){
		for(int i= nums.length>>1; i>=0; i--){
			heapify(nums, i, nums.length);
		}
	}
	private void heapify(T[] nums, int i, int heapSize){
		int l = i<<1;
		int r = l+1;
		int large = i;
		if(l<heapSize && nums[l].compareTo(nums[large])<0){
			large = l;
		}
		if(r<heapSize && nums[r].compareTo(nums[large])<0){
			large = r;
		}
		if(large != i){
			exchange(nums, large, i);
			heapify(nums, large, heapSize);
		}
	}
	
	private void exchange(T[] nums, int i, int j){
		T tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	
}
