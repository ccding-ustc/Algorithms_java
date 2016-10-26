/**
 * 
 * @ClassName: SortAlgorithms
 *
 * @Description: 常见的排序算法 java 实现
 *
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
	
	
}
