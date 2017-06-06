package leetcode;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * @author ccding
 *
 */
public class Problem033_SearchInRotatedSortedArr {
	 public int search(int[] nums, int target){
		 int low = 0;
		 int high = nums.length-1;
		 while(low < high){
			 int mid = low+((high-low)>>1);
			 if(nums[mid]>nums[high])
				 low = mid+1;
			 else
				 high = mid;
		 }
		 int rot = low;
		 int res1 = binarySearch(nums, 0, rot-1, target);
		 int res2 = binarySearch(nums, rot, nums.length-1, target);
		 return res1==-1 ? res2:res1;
	 }
	 private int  binarySearch(int[] nums, int src, int des, int target){
		 if(src>des)
			 return -1;
		 while(src <= des){
			 int mid = src + ((des-src)>>1);
			 if(nums[mid] == target)
				 return mid;
			 if(nums[mid] < target){
				 src = mid+1;
			 }else{
				 des = mid-1;
			 }
		 }
		 return -1;
	 }
}
