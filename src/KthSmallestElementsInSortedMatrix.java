/**
 * 
 * @ClassName: KthSmallestElementsInSortedMatrix
 *
 * @Description: TODO Given a n x n matrix where each of the rows and columns
 *  are sorted in ascending order, find the kth smallest element in the matrix.
 *  Note that it is the kth smallest element in the sorted order, 
 *  not the kth distinct element.
 *  Example:
 *  matrix = [
 *  [ 1,  5,  9],
 *  [10, 11, 13],
 *  [12, 13, 15]
 *  ],
 *  k = 8,
 *  return 13.
 *  Note: 
 *  You may assume k is always valid, 1 ≤ k ≤ n2.
 *
 * @author: ccding
 * @date: 2016年9月29日 下午10:21:50
 *
 */
public class KthSmallestElementsInSortedMatrix {
	public static int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		if(k%n==0){
			return matrix[k/n-1][n-1];
		}else{
			return matrix[k/n][k%n-1];
		}
    }

}
