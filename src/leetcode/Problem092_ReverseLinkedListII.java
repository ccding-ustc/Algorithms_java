package leetcode;

import utils.ListNode;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * return 1->4->3->2->5->NULL.
 * Note 1 ≤ m ≤ n ≤ length of list.
 * @author ccding
 *
 */
public class Problem092_ReverseLinkedListII {
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
//		  return head;
	  }
}
