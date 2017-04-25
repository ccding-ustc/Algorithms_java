
import java.util.HashMap;
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
	 * Problem 153. Find minimum in rotated sorted array.
	 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	 * Find the minimum element.
	 * You may assume no duplicate exists in the array.
	 * 
	 * @param nums 
	 * @return
	 */
	public int findMin(int[] nums){
		int i = 0;
		int j = nums.length-1;
		while(i<j){
			if(nums[i]<nums[j])
				return nums[i];
			int mid = (i+j)>>1;
			if(nums[mid] >= nums[i])
				i = mid+1;
			else{
				j = mid;
			}
		}
		return nums[i];	
	}
	
	/**
	 * Problem 504. Base 7
	 * Given an integer, return its base 7 string representation.
	 * 
	 * @param num
	 * @return
	 */
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
	public String convertToBase7_2(int num){
		return Integer.toString(num, 7);
	}
	
	/**
	 * Problem 80. Remove duplicates from sorted array II
	 * Follow up for "Remove Duplicates".
	 * What if duplicates are allowed at most twice?
	 * For example,
	 * Given sorted array nums = [1,1,1,2,2,3],
	 * Your function should return length = 5, with the first five 
	 * elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what
	 * you leave beyond the new length.
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums){
		if(nums.length <= 2)
			return nums.length;
		int i = 0, j = 0;			
		int duplicate = 0;
		while(++j != nums.length){
			if(nums[j] == nums[i]){
				duplicate++;
				if(duplicate < 2){
					nums[++i] = nums[j];
				}
			}else{
				duplicate = 0;
				nums[++i] = nums[j];
			}
		}
		return i+1;
	}
	public int removeDuplicates2(int[] nums){
		int i = 0;
		for(int n:nums){
			if(i<2 || nums[i-2] < n){
				nums[i++] = n;
			}
		}
		return i;
	}
	
	/**
	 * Problem 109. Convert sorted list to binary search tree.
	 * Given a singly linked list where elements are sorted in ascending order,
	 * convert it to a height balanced BST.
	 * 
	 * @param head
	 * @return
	 */
	public TreeNode sortedListToBST(ListNode head){
		if(head == null)
			return null;
		if(head.next == null)
			return new TreeNode(head.val);
		ListNode slow = head;
		ListNode fast = head.next.next;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode treeNode = new TreeNode(slow.next.val);
		treeNode.right = sortedListToBST(slow.next.next);
		slow.next = null;
		treeNode.left = sortedListToBST(head);
		return treeNode;
	}
	
	/**
	 * Problem 82. Remove duplicates from sorted list II
	 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
	 * For example,
	 * Given 1->2->3->3->4->4->5, return 1->2->5.
	 * Given 1->1->1->2->3, return 2->3.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicatesII(ListNode head){
		if(head == null)
			return null;
		ListNode slow = new ListNode(0);
		ListNode dummy = slow;
		slow.next = head;
		ListNode fast = slow;
		while(fast != null){
			while(fast.next!=null && fast.val == fast.next.val){
				fast = fast.next;
			}
			if(slow.next == fast){
				slow = slow.next;
				fast = fast.next;
			}else{
				slow.next = fast.next;
				fast = fast.next;
			}
		}
		return dummy.next;
	}

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
	 * Problem 477. Total Hamming distance
	 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
	 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
	 * 
	 * @param nums
	 * @return
	 */
	public int totalHammingDistance(int[] nums){
		int n = 31;
		int len = nums.length;
		int[] countOnes = new int[n];
		for(int i=0; i<len; i++){
			for(int j=0; j<n; j++)
			countOnes[j] += (nums[i]>>j) & 1;
		}
		int sum = 0;
		for(int countOne: countOnes){
			sum += countOne * (len - countOne);
		}
		return sum;
	}
	
	/**
	 * Problem 5. Longest Palindromic Substring
	 * Given a string s, find the longest palindromic substring in s. 
	 * You may assume that the maximum length of s is 1000.
	 * Example:
	 * Input: "babad"
	 * Output: "bab"
	 * Note: "aba" is also a valid answer.
	 * Example:
	 * Input: "cbbd"
	 * Output: "bb"
	 */
	public String longestPalindrome(String s) {
        int n = s.length();
        boolean isPalindrome[][] = new boolean[n][n];
        int src=0,des=0;
        int maxlen = 0;
        for(int i=0; i<n; i++){
        	int j=i;
        	while(j>=0){
        		if(s.charAt(i)==s.charAt(j) && (i-j<2||isPalindrome[j+1][i-1])){
        			isPalindrome[j][i] = true;
        			if(maxlen<i-j+1){
        				maxlen = i-j+1;
        				src = j;
        				des = i;
        			}
        		}
        		j--;
        	}
        }
        return s.substring(src, des+1);
    }
	
	/**
	 * Problem 12. Integer to Roman
	 * Given an integer, convert it to a roman numeral.
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */
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
	
	/**
	 * Problem 13. Roman to Integer
	 * Given a roman numeral, convert it to an integer.
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */
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
	
	/**
	 * Problem 21. Merge two sorted lists.
	 * Merge two sorted linked lists and return it as one sorted list. 
	 * Analyze and describe its complexity.
	 */
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 if(l1.val <= l2.val){
			 l1.next = mergeTwoLists(l1.next, l2);
			 return l1;
		 }else{
			 l2.next = mergeTwoLists(l1, l2.next);
			 return l2;
		 }
	 }
	 public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 ListNode res = new ListNode(0);
		 ListNode l = res;
		 while(l1!=null && l2!=null){
			 if(l1.val <= l2.val){
				 l.next = new ListNode(l1.val);
				 l1 = l1.next;
			 }else{
				 l.next = new ListNode(l2.val);
				 l2 = l2.next;
			 }
			 l = l.next;
		 }
		 if(l1 != null){
			 l.next = l1;
		 }
		 if(l2 != null){
			 l.next = l2;
		 }
		 return res.next;
	 }
	
	/**
	 * Problem 23. Merge K sorted lists.
	 * Merge k sorted linked lists and return it as one sorted list. 
	 * Analyze and describe its complexity.
	 */
	 public ListNode mergeKLists(ListNode[] lists){
		 return mergeLists(lists, 0, lists.length-1);
	 }
	 private ListNode mergeLists(ListNode[] lists, int s, int t){
		 if(s==t)
			 return lists[s];
		 if(s<t){
			 int m = s + ((t-s)>>1);
			 ListNode l1 = mergeLists(lists, s, m);
			 ListNode l2 = mergeLists(lists, m+1, t);
			 return mergeTwoLists(l1, l2);
		 }else{
			 return null;
		 }
	 }
	
	 /**
	  * Problem 33. Search in Rotated Sorted Array
	  * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	  * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	  * You are given a target value to search. If found in the array return its index, otherwise return -1.
	  * You may assume no duplicate exists in the array.
	  */
	 public int search(int[] nums, int target){
		 int low = 0;
		 int high = nums.length-1;
		 while(low < high){
			 int mid = low+((high-low)>>1);
			 if(nums[mid]>nums[high])
				 low = mid+1;
			 else
				 high = mid;
		 }
		 int rot = low;
		 int res1 = binarySearch(nums, 0, rot-1, target);
		 int res2 = binarySearch(nums, rot, nums.length-1, target);
		 return res1==-1 ? res2:res1;
	 }
	 private int  binarySearch(int[] nums, int src, int des, int target){
		 if(src>des)
			 return -1;
		 while(src <= des){
			 int mid = src + ((des-src)>>1);
			 if(nums[mid] == target)
				 return mid;
			 if(nums[mid] < target){
				 src = mid+1;
			 }else{
				 des = mid-1;
			 }
		 }
		 return -1;
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
	
}
