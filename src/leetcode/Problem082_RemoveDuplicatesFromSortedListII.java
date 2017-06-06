package leetcode;

import utils.ListNode;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * @author ccding
 *
 */
public class Problem082_RemoveDuplicatesFromSortedListII {
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
}
