package leetcode;

import utils.ListNode;

/**
 *  Sort a linked list in O(n logn) time using constant space complexity.
 * @author ccding
 *
 */
public class Problem148_SortList {
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
		head = Problem021_MergeTwoSortedLists.mergeTwoLists(sortList(head), sortList(second));
		return head;
	}
}
