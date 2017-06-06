package leetcode;

/**
 * Given a string s, partition s such that every substring
 * of the partition is a palindrome.
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * @author ccding
 *
 */
public class Problem132_PalindromePartitioningII {
	public int minCut(String s) {
		if(s==null || s.length()<2)
			return 0;
		int n = s.length();
		int[] cutNum = new int[n];//cutNum from 0...i
		boolean[][] isPalin = new boolean[n][n];
		for(int i=0; i<n; i++){
			cutNum[i] = i;
			for(int j=i; j>=0; j--){
				if(s.charAt(i) == s.charAt(j) && (i-j<2 || isPalin[j+1][i-1])){
					isPalin[j][i] = true;
					if(j==0){
						cutNum[i] = 0;
					}else{
						cutNum[i] = Math.min(cutNum[i], cutNum[j-1]+1);
					}
				}
			}
		}
		return cutNum[n-1];
	}
}
