
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode headDummy = new ListNode(0);
		while(head != null){
			ListNode next = head.next;
			insert(headDummy, head);
			head = next;
		}
		return headDummy.next;		
	}
	
	
	private void insert(ListNode listDummy, ListNode target){
		ListNode curr = listDummy;
		while(curr.next != null && curr.next.val < target.val)
			curr = curr.next;
		target.next = curr.next;
		curr.next = target;
	}
}
