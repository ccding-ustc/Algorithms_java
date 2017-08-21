package leetcode;

import utils.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @author ccding
 *
 */
public class Problem002_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode curr = res;
		int increase = 0;
		while(l1!=null || l2!=null || increase != 0){
			if(l1!=null){
				increase += l1.val;
				l1 = l1.next;
			}
			if(l2!=null){
				increase += l2.val;
				l2 = l2.next;
			}
			curr.next = new ListNode(increase%10);
			increase /= 10;
			curr = curr.next;
			
		}
		return res.next;
	}
}
