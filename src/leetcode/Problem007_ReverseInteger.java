package leetcode;

/**
 * Reverse digits of an integer.
 * The input is assumed to be a 32-bit signed integer.
 * Your function should return 0 when the reversed integer overflows.
 * @author ccding
 *
 */
public class Problem007_ReverseInteger {
	public int reverse(int x){
		int r = 0;
		while(x != 0){
			int tmp = r*10 +x%10;
			if(tmp/10 != r)     //overflows
				return 0;
			r = tmp;
			x = x/10;
		}
		return r;	
	}
}
