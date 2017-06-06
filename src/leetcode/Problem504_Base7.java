package leetcode;
/**
 * Given an integer, return its base 7 string representation.
 * @author ccding
 *
 */
public class Problem504_Base7 {
	public String convertToBase7(int num){
		String s = "";
		if(num == 0)
			return "0";
		boolean isNeg = num<0;
		while(num!=0){
			s = Math.abs(num)%7 + s;
			num = num/7;
		}
		return isNeg ? "-"+s : s;
	}
	
	public String convertToBase7II(int num){
		return Integer.toString(num, 7);
	}
}
