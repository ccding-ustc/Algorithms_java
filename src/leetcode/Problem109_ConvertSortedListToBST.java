package leetcode;

import utils.ListNode;
import utils.TreeNode;

/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * @author ccding
 *
 */
public class Problem109_ConvertSortedListToBST {
	public TreeNode sortedListToBST(ListNode head){
		if(head == null)
			return null;
		if(head.next == null)
			return new TreeNode(head.val);
		ListNode slow = head;
		ListNode fast = head.next.next;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode treeNode = new TreeNode(slow.next.val);
		treeNode.right = sortedListToBST(slow.next.next);
		slow.next = null;
		treeNode.left = sortedListToBST(head);
		return treeNode;
	}
}
