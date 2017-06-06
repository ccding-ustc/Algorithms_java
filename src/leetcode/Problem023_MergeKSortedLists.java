package leetcode;

import utils.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. 
 * Analyze and describe its complexity.
 * @author ccding
 *
 */
public class Problem023_MergeKSortedLists {
	 public ListNode mergeKLists(ListNode[] lists){
		 return mergeLists(lists, 0, lists.length-1);
	 }
	 private ListNode mergeLists(ListNode[] lists, int s, int t){
		 if(s==t)
			 return lists[s];
		 if(s<t){
			 int m = s + ((t-s)>>1);
			 ListNode l1 = mergeLists(lists, s, m);
			 ListNode l2 = mergeLists(lists, m+1, t);
			 return Problem021_MergeTwoSortedLists.mergeTwoLists(l1, l2);
		 }else{
			 return null;
		 }
	 }
	
}
