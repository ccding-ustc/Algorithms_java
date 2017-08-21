package leetcode;

import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * You may assume the dictionary does not contain duplicate words.
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
 * @author ccding
 *
 */
public class Problem139_WordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
		 int len = s.length();
		 boolean dp[] = new boolean[len+1];
		 dp[0] = true;
		 for(int i=1; i<=len; i++){
			 for(int j=i-1; j>=0; j--){
				 if(dp[j] && wordDict.contains(s.substring(j, i))){
					 dp[i] = true;
					 break;
				 }
			 }
		 }
		 return dp[len];
	 }
}
