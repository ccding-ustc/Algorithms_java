package main;
import leetcode.Problem025_ReverseNodesInKGroups;

import utils.ListNode;

public class Main {
	public static void main(String[] args){
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
//		node.next.next.next.next = new ListNode(3);
		System.out.println(Problem025_ReverseNodesInKGroups.reverseKGroupII(node, 2));	
	}
}
