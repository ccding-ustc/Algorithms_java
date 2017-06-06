package leetcode;
/**
 * 
 * @ClassName: KthSmallestElementInSortedMat
 *
 * @Description: Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * example:
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * return 13.
 *
 * @author: ccding
 * @date: 2017年2月15日 下午7:12:35
 *
 */
public class Problem378_KthSmallestElementInSortedMat {
	 public static int kthSmallest(int[][] matrix, int k) {
		 int n = matrix.length;
		 int minValue = matrix[0][0];
		 int maxValue = matrix[n-1][n-1];
		 while(minValue < maxValue){
			int m = minValue + ((maxValue-minValue)>>1);
		 	int count = binarySearch(matrix, m);
		 	if(count < k){
		 		minValue = m+1;
		 	}else{
		 		maxValue = m;
		 	}
		 }
		 return minValue;
	 }
	 
	 public static int binarySearch(int[][] matrix, int target){
		 int n = matrix.length;
		 int i = n-1, j = 0;
		 int res = 0;
		 while(i>=0 && j<=n-1){
			 if(matrix[i][j] > target){
				 i--;
			 }else{
				j++;
				res += i+1;
			 }
		 }
		 return res;
	 }
}
