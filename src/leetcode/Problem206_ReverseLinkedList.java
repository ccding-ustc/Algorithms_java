package leetcode;

import utils.ListNode;

/**
 * Reverse a singly linked list.
 * @author ccding
 *
 */
public class Problem206_ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
		  if(head==null || head.next==null)
			  return head;
		  ListNode curr = head.next;
		  ListNode tail = head.next;
		  ListNode pre = head;
		  head.next = null;
		  while(curr != null){
			  tail = curr.next;
			  curr.next = pre;
			  pre = curr;
			  curr = tail;
		  }
		  return pre;
	  }
}
