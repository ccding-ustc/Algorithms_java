package leetcode;

import utils.ListNode;

/**
 * @ClassName: InsertionSortList
 *
 * @Description: TODO Sort a linked list using insertion sort.
 *
 * @author: ccding
 * @date: 2016年9月28日 上午9:12:45
 */

public class Problem147_InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode headDummy = new ListNode(0);
		while(head != null){
			ListNode next = head.next;
			insert(headDummy, head);
			head = next;
		}
		return headDummy.next;		
	}
	
	
	private void insert(ListNode listDummy, ListNode target){
		ListNode curr = listDummy;
		while(curr.next != null && curr.next.val < target.val)
			curr = curr.next;
		target.next = curr.next;
		curr.next = target;
	}
}
