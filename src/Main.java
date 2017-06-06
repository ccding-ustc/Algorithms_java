import algorithms3th.StringMatcher;
import utils.ListNode;

public class Main {
	public static void main(String[] args){
		SolutionLeetcode solution = new SolutionLeetcode();
//		System.out.println(solution.convert("PAYPALISHIRING", 3));
		ListNode node = new ListNode(1);
		node.next = new ListNode(5);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);
//		System.out.println(solution.reverseWordsII( "the sky is blue"));
		System.out.println(StringMatcher.KMP("absghhsgdj", "hhs"));	
	}
}
