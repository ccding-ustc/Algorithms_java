package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.
 * For example, given s = "aab",
 * Return
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 * @author ccding
 *
 */
public class Problem131_PalindromePartitioning {
	public List<List<String>> partition(String s) {
		  int len = s.length();
		  List<List<String>> ans = new ArrayList<>();
		  boolean[][] isPalin = new boolean[len][len];
		  for(int i=0; i<len; i++){
			  for(int j=i; j>=0; j--){
				  if(s.charAt(i)==s.charAt(j) && (i-j<2 || isPalin[j+1][i-1])){
					  isPalin[j][i] = true;
				  }
			  }
		  }
		  dfs(ans, new ArrayList<String>(), s, isPalin, 0);
		  return ans;
	  }
	  private void dfs(List<List<String>> ans, List<String> list, String s, boolean[][] isPalin, int row) {
		  int length = s.length();
		  if (row == length) { 
			  ans.add(new ArrayList<String>(list)); 
			  return; 
		  }
		  for (int i=row; i<length; ++i) {
			  if (isPalin[row][i]) {
				  list.add(s.substring(row, i+1));
				  dfs(ans, list, s, isPalin, i+1);
				  list.remove(list.size()-1);
			  }
		  }
	  }
}
