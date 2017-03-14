

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
		head = mergeTwoList(sortList(head), sortList(second));
		return head;
	}
	private ListNode mergeTwoList(ListNode list1, ListNode list2){
		ListNode dummy = new ListNode(0), merge = dummy;
		while(list1 != null && list2 != null){
			if(list1.val <= list2.val){
				merge.next = list1;
				merge = merge.next;
				list1 = list1.next;
			}else{
				merge.next = list2;
				merge = merge.next;
				list2 = list2.next;
			}
		}
		if(list1 != null)
			merge.next = list1;
		if(list2 != null)
			merge.next = list2;
		return dummy.next;
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
	
	public static void main(String[] args){
		SolutionLeetcode solution = new SolutionLeetcode();
		ListNode node = new ListNode(1);
		node.next = new ListNode(5);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);
		System.out.println(solution.totalHammingDistance(new int[]{4, 2, 14}));
	}
	
}
