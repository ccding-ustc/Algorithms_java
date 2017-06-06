package leetcode;

/**
 * The Hamming distance between two integers is the number of positions 
 * at which the corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs
 * of the given numbers.
 * @author ccding
 *
 */
public class Problem477_TotalHammingDistance {
	public int totalHammingDistance(int[] nums){
		int n = 31;
		int len = nums.length;
		int[] countOnes = new int[n];
		for(int i=0; i<len; i++){
			for(int j=0; j<n; j++)
			countOnes[j] += (nums[i]>>j) & 1;
		}
		int sum = 0;
		for(int countOne: countOnes){
			sum += countOne * (len - countOne);
		}
		return sum;
	}
}
