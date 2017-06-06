package leetcode;

/**
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author ccding
 *
 */
public class Problem012_IntegerToRoman {
	public String intToRoman(int n){
		StringBuffer sb = new StringBuffer();
		String dics[] = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int vals[] = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0; i<vals.length; i++){
			while(n>=vals[i]){
				sb.append(dics[i]);
				n-=vals[i];
			}
		}
		return sb.toString();
	}
}
