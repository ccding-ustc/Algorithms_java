package leetcode;

import utils.ListNode;

/**
 * Merge two sorted linked lists and return it as one sorted list. 
 * Analyze and describe its complexity.
 * @author ccding
 *
 */
public class Problem021_MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 if(l1.val <= l2.val){
			 l1.next = mergeTwoLists(l1.next, l2);
			 return l1;
		 }else{
			 l2.next = mergeTwoLists(l1, l2.next);
			 return l2;
		 }
	 }
	 public ListNode mergeTwoListsII(ListNode l1, ListNode l2) {
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 ListNode res = new ListNode(0);
		 ListNode l = res;
		 while(l1!=null && l2!=null){
			 if(l1.val <= l2.val){
				 l.next = l1;
				 l1 = l1.next;
			 }else{
				 l.next = l2;
				 l2 = l2.next;
			 }
			 l = l.next;
		 }
		 if(l1 != null){
			 l.next = l1;
		 }
		 if(l2 != null){
			 l.next = l2;
		 }
		 return res.next;
	 }
}
