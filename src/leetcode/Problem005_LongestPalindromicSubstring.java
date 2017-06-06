package leetcode;

/**
 * Given a string s, find the longest palindromic substring in s. 
 * You may assume that the maximum length of s is 1000.
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 * @author ccding
 *
 */
public class Problem005_LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        int n = s.length();
        boolean isPalindrome[][] = new boolean[n][n];
        int src=0,des=0;
        int maxlen = 0;
        for(int i=0; i<n; i++){
        	int j=i;
        	while(j>=0){
        		if(s.charAt(i)==s.charAt(j) && (i-j<2||isPalindrome[j+1][i-1])){
        			isPalindrome[j][i] = true;
        			if(maxlen<i-j+1){
        				maxlen = i-j+1;
        				src = j;
        				des = i;
        			}
        		}
        		j--;
        	}
        }
        return s.substring(src, des+1);
    }
}
