package leetcode;

/**
 * Given a string, you need to reverse the order of characters
 * in each word within a sentence while still preserving 
 * whitespace and initial word order.
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * @author ccding
 *
 */
public class Problem557_ReverseWordsInStringIII {
	 public String reverseWords(String s) {
			if(s==null || s.length()==1)
				 return s;
			char[] chars = s.toCharArray();
			int start = 0;
			for(int i=0; i<chars.length; i++){
				if( i+1==chars.length || chars[i+1]==' ' ){
					int end = i;
					while(end > start){
						char tmp = chars[start];
						chars[start] = chars[end];
						chars[end] = tmp;
						start++;
						end--;
					}
					start = i+2;
				}
			}
			return new String(chars);
		 }
}
