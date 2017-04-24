import java.util.Arrays;

public class Main {

	public static void main(String[] args){
//		SolutionLeetcode solution = new SolutionLeetcode();
//		ListNode node = new ListNode(1);
//		node.next = new ListNode(5);
//		node.next.next = new ListNode(2);
//		node.next.next.next = new ListNode(3);
//		node.next.next.next.next = new ListNode(3);
//		System.out.println(solution.totalHammingDistance(new int[]{4, 2, 14}));
		SortAlgorithms<Integer> t = new SortAlgorithms<>();
		Integer[] nums = new Integer[]{1,3,2,4,56,7,8,32,222,2};
//		t.quickSort(nums);
//		t.mergeSort(nums);
		t.heapSort(nums);
		Integer[] tmp = Arrays.copyOfRange(nums, 2,6);
	}

}
