package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author ccding
 *
 */
public class Problem013_RomanToInteger {
	public int romanToInt(String s){
		Map<Character, Integer> dics = new HashMap<>();
		dics.put('I', 1);
		dics.put('V', 5);
		dics.put('X', 10);
		dics.put('L', 50);
		dics.put('C', 100);
		dics.put('D', 500);
		dics.put('M', 1000);
		int len = s.length();
		int result = dics.get(s.charAt(len-1));
		for(int i = len-2; i>=0; i--){
			if(dics.get(s.charAt(i)) >= dics.get(s.charAt(i+1))){
				result += dics.get(s.charAt(i));
			}else{
				result -= dics.get(s.charAt(i));
			}
		}
		return result;
	}
	
}
