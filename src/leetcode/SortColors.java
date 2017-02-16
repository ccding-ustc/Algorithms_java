package leetcode;
import java.util.Arrays;

/**
 * 
 * @ClassName: SortColors
 *
 * @Description: TODO Given an array with n objects colored red, white or blue, 
 * sort them so that objects of the same color are adjacent, 
 * with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * @author: ccding
 * @date: 2016年9月28日 上午10:47:16
 *
 */
public class SortColors {
	   public static void sortColors(int[] nums){
			int[] counts = {0, 0, 0};
			int[] numsDummy = Arrays.copyOf(nums, nums.length);
			
			for(int i = 0; i<nums.length; i++){
				counts[nums[i]]++;
			}
			for(int i = 1; i<counts.length; i++){
				counts[i] += counts[i-1];
			}
			for(int i=nums.length-1; i>=0; i--){
				nums[counts[numsDummy[i]]-1] = numsDummy[i];
				counts[numsDummy[i]]--;
			}
		}
}
