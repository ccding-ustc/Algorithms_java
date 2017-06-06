import utils.ListNode;

public class Main {

	public static void main(String[] args){
		SolutionLeetcode solution = new SolutionLeetcode();
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
//		node.next.next.next = new ListNode(4);

//		ListNode node2 = new ListNode(6);
//		node2.next = new ListNode(10);
//		ListNode[] lists = new ListNode[]{null, node, null, node2};
//		int nums[] = new int[]{2,2,2,0,2,2};
		System.out.println(StringMatcher.KMP("absghhsgdj", "hhs"));
	
		
	}

}
