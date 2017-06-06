package leetcode;
/**
 * Write a function that takes a string as input 
 * and returns the string reversed.
 * @author ccding
 *
 */
public class Problem344_ReverseString {
	public static String reverseString(String s){
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1; i>=0; i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
