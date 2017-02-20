package leetcode;

import utils.ListNode;

public class MergeTwoSortedList {
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
	 public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 ListNode res = new ListNode(0);
		 ListNode l = res;
		 while(l1!=null && l2!=null){
			 if(l1.val <= l2.val){
				 l.next = new ListNode(l1.val);
				 l1 = l1.next;
			 }else{
				 l.next = new ListNode(l2.val);
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
