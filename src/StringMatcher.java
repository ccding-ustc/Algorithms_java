
/**
 * String matcher methods
 * @author ccding
 *
 */
public class StringMatcher {
	/**
	 * 暴力求解算法
	 * @param s 字符串
	 * @param pattern 模式串
	 * @return
	 */
	public static int naiveMatcher(String s, String pattern){
		int i = 0, j = 0;
		while(i<s.length() && j<pattern.length()){
			if(s.charAt(i) == pattern.charAt(j)){
				i++; 
				j++;
			}else{
				i = i-j+1;
				j=0;
			}
		}
		if(j==pattern.length()-1)
			return i-j;
		else
			return -1;
	}
	
	/**
	 * KMP求解算法
	 * @param s 字符串
	 * @param pattern 模式串
	 * @return
	 */
	public static int KMP(String s, String pattern){
		int i=0, j=0;
		int[] next = getNext(pattern);
		while( i<s.length() && j<pattern.length() ){
			if(j==-1 || s.charAt(i)==pattern.charAt(j)){
				i++;
				j++;
			}else{
				j = next[j];
			}
		}
		if(j == pattern.length())
			return i-j;
		else
			return -1;
	}
	/**
	 * 求模式串 next 数组
	 * @param p 模式串
	 * @return
	 */
	private static int[] getNext(String p){
		int[] next = new int[p.length()];
		next[0] = -1;
		int j = 0;
		int k = -1;
		while(j < p.length()-1){
			if(k==-1 || p.charAt(j) == p.charAt(k)){
				j++;
				k++;
				next[j] = k;
			}else{
				k = next[k];
			}
		}
		return next;
	}
}
