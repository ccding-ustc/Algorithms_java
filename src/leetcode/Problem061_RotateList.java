package leetcode;

import utils.ListNode;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * @author ccding
 *
 */
public class Problem061_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		  if(head==null || head.next==null || k==0)
			  return head;
		  int len = 1;
		  ListNode s = head;
		  while(s.next != null){
			  s = s.next;
			  len++;
		  }
		  s.next = head;
		  k = k%len;
		  s = head;
		  for(int i=1; i<len-k; i++){
			  s = s.next;
		  }
		  ListNode res = s.next;
		  s.next = null;
		  return res;
	  }
}
