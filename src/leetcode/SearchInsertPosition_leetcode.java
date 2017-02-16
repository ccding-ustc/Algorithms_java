package leetcode;
import java.util.Arrays;

public class SearchInsertPosition_leetcode {
	static int position = 0;
	public static int searchInsert(int[] nums, int target){
		int mid = nums.length>>1;
		if(nums.length == 0 || target < nums[0])
			return position;
		if(target > nums[nums.length-1]){
			return position + nums.length;
		}
		if(target == nums[mid]){
			return position+mid;
		}
		if(target < nums[mid]){
				return searchInsert(Arrays.copyOfRange(nums, 0, mid),target);
		}else{
				position+=mid;
				return searchInsert(Arrays.copyOfRange(nums, mid, nums.length), target);
		}
	}
	public int searchInsert2(int[] nums, int target) {
	    int idx = Arrays.binarySearch(nums, target);
	    return idx < 0 ? -idx - 1 : idx;
	}
}
