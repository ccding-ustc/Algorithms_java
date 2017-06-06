import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.ListNode;
import utils.TreeNode;

/**
 * 
 * @ClassName: SolutionLeetcode
 *
 * @Description: Solutions for leetcode problems.
 *
 * @author: ccding
 * @date: 2017年2月16日 下午3:25:32
 *
 */
public class SolutionLeetcode {
	
	

	/**
	 * Problem 148. Sort List
	 * Sort a linked list in O(n logn) time using constant space complexity.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode sortList(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode second = slow.next;
		slow.next = null;
		head = mergeTwoLists(sortList(head), sortList(second));
		return head;
	}
	
	/**
	 * Problem 7. Reverse integer
	 * Reverse digits of an integer.
	 * 
	 * @param x
	 * @return
	 */
	public int reverse(int x){
		int r = 0;
		while(x != 0){
			int tmp = r*10 +x%10;
			if(tmp/10 != r)
				return 0;
			r = tmp;
			x = x/10;
		}
		return r;	
	}
	
	/**
	 * Problem 461. Hamming distance
	 * The Hamming distance between two integers is the number od positions at which the corresponding bits are different.
	 * Given two integers x and y, calculate the Hamming distance.
	 * Note: 0 <= x,y <= 2^31
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int hamingDistance(int x, int y){
		return Integer.bitCount(x^y);
	}
 
	
	 
	 /**
	  * Problem 6. ZigZag Conversion
	  * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
	  * P   A   H   N
	  * A P L S I I G
	  * Y   I   R
	  * And then read line by line: "PAHNAPLSIIGYIR"
	  * Write the code that will take a string and make this conversion given a number of rows:
	  * string convert(string text, int nRows);
	  * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
	  */
	 public String convert(String s, int numRows) {
		 StringBuilder[] sbs = new StringBuilder[numRows];
		 int len = s.length();
		 for(int i=0; i<numRows; i++)
			 sbs[i] = new StringBuilder();
		 int idx = 0;
		 while(idx < len){
			 for(int i=0; i<numRows&&idx<len; i++){
				 sbs[i].append(s.charAt(idx++));
			 }
			 for(int i=numRows-2; i>=1&&idx<len; i--){
				 sbs[i].append(s.charAt(idx++));
			 }
		 }
		 for(int i=1; i<numRows; i++)
			 sbs[0].append(sbs[i]);
		 return sbs[0].toString();
	 }
	
	 /**
	  * Problem 8. String to Integer(atoi)
	  * Implement atoi to convert a string to an integer.
	  */
	 public int myAtoi(String str){
		 str = str.trim();
		 if(str.length() == 0)
			 return 0;
		 int start = 0;
		 while(start < str.length() && (str.charAt(start)=='-'||str.charAt(start)=='+'))
			 start++;
		 if(start>1)
			 return 0;
		 int sign = 1;
		 if(str.charAt(0)=='-')
			 sign = -1;
		 long sum = 0;
		 for(int i=start; i<str.length(); i++){
			 if(str.charAt(i)>'9' || str.charAt(i)<'0')
				 break;
			 sum = sum*10 + (str.charAt(i)-'0');
			 if (sign == 1 && sum > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			 if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
		 }
	
		 return (int)sum * sign;
	 }

	 /**
	  * Problem 9. Palindrome Number
	  * Determine whether an integer is a palindrome. Do this without extra space.
	  */
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



	  
	  


	
	 

	
	
	

	
	
	/**
	 * Problem 557. Reverse Words in a String III
	 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
	 * Example 1:
	 * Input: "Let's take LeetCode contest"
	 * Output: "s'teL ekat edoCteeL tsetnoc"
	 */
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

	 
	  /**
	   * Problem 92. Reverse Linked List II
	   * Reverse a linked list from position m to n. Do it in-place and in one-pass.
	   * For example:
	   * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	   * return 1->4->3->2->5->NULL.
	   * Note 1 ≤ m ≤ n ≤ length of list.
	   */
	  public ListNode reverseBetween(ListNode head, int m, int n) {
		  if(head==null || head.next== null || m==n)
			  return head;
		  ListNode mPre = null;
		  ListNode mNode = head;
		  for(int i=0; i<m; i++){
			  mPre = mNode;
			  mNode = mNode.next;
		  }
		  
		  ListNode pre = mNode;
		  ListNode curr = mNode.next;
		  ListNode tail = mNode.next;
		  for(int i=n-m; i>0; i--){
			  tail = curr.next;
			  curr.next = pre;
			  pre = curr;
			  curr = tail;
		  }
		  mNode.next = curr;
		  mPre.next = tail;
		  return head;
	  }
	  
}
