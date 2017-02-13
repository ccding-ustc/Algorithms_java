

public class Test{
	public static void main(String[] args) {
		Integer[] nums = {1,0,0,2,6,4,3,2,12,13};
		SortAlgorithms<Integer> sa = new SortAlgorithms<>();
		sa.mergeSort(nums);
		for(Integer i: nums)
			System.out.print(i + " ");
		
	}
}
