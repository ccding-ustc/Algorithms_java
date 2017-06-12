package leetcode;

import utils.ListNode;

/**
 * 
 * @ClassName: DeleteDuplicates
 *
 * @Description: Given a sorted linked list, delete all duplicates 
 * such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @author: ccding
 * @date: 2016年9月28日 上午9:46:12
 *
 */
public class Problem083_RemoveDuplicatesFromSortedList {
	public static ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode p = head;
		ListNode r = p.next;
		while(r != null){
			if(p.val == r.val){
				r = r.next;
				p.next = r;
			}else{
				p = r;
				r = r.next;
			}
		}
		return head;
	}
	
	public ListNode deleteDuplicatesII(ListNode head){
		ListNode curr = head;
		while(curr != null){
			while(curr.next!=null && curr.val == curr.next.val){
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}
		return head;
	}
}
