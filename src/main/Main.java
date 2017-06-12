package main;
import leetcode.Problem092_ReverseLinkedListII;
import utils.ListNode;

public class Main {
	public static void main(String[] args){
		ListNode node = new ListNode(3);
		node.next = new ListNode(5);
//		node.next.next = new ListNode(2);
//		node.next.next.next = new ListNode(3);
//		node.next.next.next.next = new ListNode(3);
		System.out.println(Problem092_ReverseLinkedListII.reverseBetween(node, 1, 2));	
	}
}
