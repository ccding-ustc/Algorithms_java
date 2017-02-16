package leetcode;
/**
 * 
 * @ClassName: ConvertSortedArrToBST
 *
 * @Description: Given an array where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 *
 * @author: ccding
 * @date: 2017年2月15日 下午5:59:48
 *
 */
public class ConvertSortedArrToBST {
	public static TreeNode sortedArrayToBST(int[] nums){
		return getBST(nums, 0, nums.length-1);
	}
	private static TreeNode getBST(int[] nums, int start, int end){
		TreeNode treeNode = null;
		if(end == start)
			return new TreeNode(nums[start]);
		if(end>start){
			int mid = start + ((end-start)>>1);
			treeNode = new TreeNode(nums[mid]);
			treeNode.left = getBST(nums, start, mid-1);
			treeNode.right = getBST(nums, mid+1, end);
		}
		return treeNode;
	}
}
