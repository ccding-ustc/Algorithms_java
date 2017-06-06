package leetcode;

import utils.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null.
 * @author ccding
 *
 */
public class Problem142_LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		  if(head==null || head.next==null)
			  return null;
		  ListNode f = head;
		  ListNode s = head;
		  while(f!=null && f.next!=null){
			  s = s.next; 
			  f = f.next.next;
			  if(s == f){
				  ListNode sc = head;
				  while(s != sc){
					  s = s.next;
					  sc = sc.next;
				  }
				  return s;
			  }
		  }
		  return null;
	  }

}
