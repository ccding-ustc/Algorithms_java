package main;
import leetcode.Problem025_ReverseNodesInKGroups;
import newcoder.JustForOffer3th;
import utils.ListNode;

public class Main {
	public static void main(String[] args){
		JustForOffer3th test = new JustForOffer3th();
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		ListNode node5 = new ListNode(5);
//		ListNode node6 = new ListNode(6);
//		ListNode node7 = new ListNode(7);
//		ListNode node8 = new ListNode(8);
		node.next.next.next.next = node5;
//		node5.next = node6;
//		node6.next = node7;
//		node7.next = node8;
//		node8.next = node6;
		
		System.out.println(test.findKthToTail(node, 5));	
		
	}
}
