package leetcode;

import java.util.Stack;

import utils.ListNode;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * @author ccding
 *
 */
public class Problem143_ReorderList {
	 public static void reorderList(ListNode head) {
		 if(head == null || head.next == null || head.next.next == null)
			 return;
		 ListNode slow = head;
		 ListNode fast = head;
		 while(fast.next!= null && fast.next.next != null){
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 ListNode laterHalf = slow.next;
		 slow.next = null;
		 Stack<ListNode> s = new Stack<>();
		 while(laterHalf != null){
			 s.push(laterHalf);
			 laterHalf = laterHalf.next;
		 }
		 ListNode curr = head;
		 while(!s.isEmpty()){
			 ListNode tmp = s.pop();
			 tmp.next = curr.next;
			 curr.next = tmp;
			 curr = tmp.next;
		 }	 
	 }
}
