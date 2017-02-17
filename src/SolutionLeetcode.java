/**
 * 
 * @ClassName: SolutionLeetcode
 *
 * @Description: Solutions for leetcode problems.
 *
 * @author: ccding
 * @date: 2017年2月16日 下午3:25:32
 *
 */
public class SolutionLeetcode {
	/**
	 * Problem 153. Find minimum in rotated sorted array.
	 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	 * Find the minimum element.
	 * You may assume no duplicate exists in the array.
	 * 
	 * @param nums 
	 * @return
	 */
	public int findMin(int[] nums){
		int i = 0;
		int j = nums.length-1;
		while(i<j){
			if(nums[i]<nums[j])
				return nums[i];
			int mid = (i+j)>>1;
			if(nums[mid] >= nums[i])
				i = mid+1;
			else{
				j = mid;
			}
		}
		return nums[i];	
	}
	/**
	 * Problem 504. Base 7
	 * Given an integer, return its base 7 string representation.
	 * 
	 * @param num
	 * @return
	 */
	public String convertToBase7(int num){
		String s = "";
		if(num == 0)
			return "0";
		boolean isNeg = num<0;
		while(num!=0){
			s = Math.abs(num)%7 + s;
			num = num/7;
		}
		return isNeg ? "-"+s : s;
	}
	
	public String convertToBase7_2(int num){
		return Integer.toString(num, 7);
	}
	
	/**
	 * Problem 80. Remove duplicates from sorted array II
	 * Follow up for "Remove Duplicates".
	 * What if duplicates are allowed at most twice?
	 * For example,
	 * Given sorted array nums = [1,1,1,2,2,3],
	 * Your function should return length = 5, with the first five 
	 * elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what
	 * you leave beyond the new length.
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums){
		if(nums.length <= 2)
			return nums.length;
		int i = 0, j = 0;			
		int duplicate = 0;
		while(++j != nums.length){
			if(nums[j] == nums[i]){
				duplicate++;
				if(duplicate < 2){
					nums[++i] = nums[j];
				}
			}else{
				duplicate = 0;
				nums[++i] = nums[j];
			}
		}
		return i+1;
	}
	
	public int removeDuplicates2(int[] nums){
		int i = 0;
		for(int n:nums){
			if(i<2 || nums[i-2] < n){
				nums[i++] = n;
			}
		}
		return i;
	}
	
	
	public static void main(String[] args){
		SolutionLeetcode solution = new SolutionLeetcode();
		System.out.println(solution.removeDuplicates2(new int[]{1,1,1,2,2,3}));
	}
	
}
