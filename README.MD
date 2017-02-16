#Leetcode Problems Solved by ccding.
[TOC]

## Problem 451:
Given a string, sort it in decreasing order based on the frequency of characters.

[./src/SortCharactersByFrequency.java](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/SortCharactersByFrequency.java)

## Problem 108:Convert Sorted Array to Binary Search Tree
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

[./src/ConvertSortedArrToBST.java](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/ConvertSortedArrToBST.java)

##  Problem 378: Kth Smallest Element in a Sorted Matrix
Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.
example:
matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,
return 13.

[./src/KthSmallestElementInSortedMat.java](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/KthSmallestElementInSortedMat.java)

#[./src/SolutionLeetcode.java](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/SolutionLeetcode.java)
Leetcode problems implemented by Java.

## Problem 153. Find minimum in rotated sorted array.
	 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	 * Find the minimum element.
	 * You may assume no duplicate exists in the array.
	 * 
	 * @param nums 
	 * @return
	 */
	public int findMin(int[] nums){
		int i = 0;
		int j = nums.length-1;
		while(i<j){
			if(nums[i]<nums[j])
				return nums[i];
			int mid = (i+j)>>1;
			if(nums[mid] >= nums[i])
				i = mid+1;
			else{
				j = mid;
			}
		}
		return nums[i];	
	}

