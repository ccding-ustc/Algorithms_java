package leetcode;

/**
 * Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * @author ccding
 *
 */
public class Problem151_ReverseWordsInString {
	public String reverseWordsII(String s) {
		 String[] strs = s.split("\\s+");
		 StringBuilder sb = new StringBuilder();
		 for(int i=strs.length-1; i>=0; i--)
			 sb.append(strs[i]+" ");
		 return sb.toString().trim();
	 }

}
