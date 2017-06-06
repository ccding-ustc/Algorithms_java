package leetcode;

/**
 * Determine whether an integer is a palindrome. 
 * Do this without extra space.
 * @author ccding
 *
 */
public class Problem009_PalindromeNumber {
	public boolean isPalindrome(int x) {
		 if(x<0)
			 return false;
		 int palindrome = 0;
		 int xbak = x;
		 while(x >= 10){
			 palindrome = palindrome*10 + x%10;
			 x = x/10;
		 }
		 return x==xbak%10 && palindrome==xbak/10;
	 }

}
