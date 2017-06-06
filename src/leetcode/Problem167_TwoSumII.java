package leetcode;
/**
 * Given an array of integers that is already sorted in ascending order, 
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) 
 * are not zero-based.
 * You may assume that each input would have exactly one solution 
 * and you may not use the same element twice.
 * @author ccding
 *
 */
public class Problem167_TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while(low <= high){
        	if(numbers[low] + numbers[high] == target){
        		res[0] = low;
        		res[1] = high;
        		return res;
        	}else if(numbers[low] + numbers[high] < target){
        		low++;
        	}else{
        		high--;
        	}
        }
        return res;
    }
}
