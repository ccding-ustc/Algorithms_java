package leetcode;

/**
 * Given a string and an integer k, 
 * you need to reverse the first k characters for every 2k 
 * characters counting from the start of the string. 
 * If there are less than k characters left, 
 * reverse all of them. If there are less than 2k but greater than or equal to k characters, 
 * then reverse the first k characters and left the other as original.
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * @author ccding
 *
 */
public class Problem541_ReverseWordsInStringIII {
	public String reverseStr(String s, int k) {
        if(s==null || s.length()==1)
        	return s;
        char[] schs = s.toCharArray();
        for(int i=0; i<schs.length; i+=2*k){
        	int src = i;
        	int des = Math.min(i+k-1, schs.length-1);
        	while(src < des){
        		char tmp = schs[src];
        		schs[src] = schs[des];
        		schs[des] = tmp;
        		src++;
        		des--;
        	}
        }
        return new String(schs);
    }
}
