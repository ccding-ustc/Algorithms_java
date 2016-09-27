
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		ListNode l = head;
		ListNode node = head;
		while(node != null){
			while(node.val > l.val)
				l = l.next;
			node.next = l.next;
			l.next = node;
			node = node.next;
			
		}
	}

}
