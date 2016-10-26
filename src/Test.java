

public class Test{
	public static void main(String[] args) {
		Integer[] nums = {1,2,6,43,2,12};
		SortAlgorithms<Integer> sa = new SortAlgorithms<>();
		sa.bubbleSort(nums);
		for(Integer i: nums)
			System.out.print(i + " ");
		
	}
}
