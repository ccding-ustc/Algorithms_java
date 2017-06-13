package leetcode;

import java.util.Stack;

import utils.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. 
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * 
 * For example,
 * Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 * @author ccding
 *
 */
public class Problem025_ReverseNodesInKGroups {
	public static ListNode reverseKGroup(ListNode head, int k){
		if(head==null || head.next==null || k<2)
			return head;
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode pre = res, tail = res, tmp;
		int count;
		while(true){
			count = k;
			while(count>0 && tail!=null){
				count--;
				tail = tail.next;
			}
			if(tail==null)
				break;
			head = pre.next;
			while(pre.next!=tail){
				tmp = pre.next;
				pre.next = tmp.next;
				tmp.next = tail.next;
				tail.next = tmp;
			}
			tail = head;
			pre = head;
		}
		return res.next;
	}
	
	
	//use stack
	public static ListNode reverseKGroupII(ListNode head, int k){
		if(head==null || head.next==null || k<=0)
			return head;
		Stack<ListNode> s = new Stack<>();
		ListNode p = head;
		ListNode res = new ListNode(0);
		ListNode curr = res;
		while(head!=null){
			s.push(head);
			head = head.next;
			if(s.size() == k){
				p = head;
				while(!s.isEmpty()){
					curr.next = s.pop();
					curr = curr.next;
				}
			}
		}
		if(!s.isEmpty()){
			curr.next = p;
		}else{
			curr.next = null;
		}
		return res.next;	
	}
}
