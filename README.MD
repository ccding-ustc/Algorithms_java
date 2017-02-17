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
Leetcode solutions implemented by Java.

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
	
## Problem 504. Base 7
	/**
	 * Given an integer, return its base 7 string representation.
	 * 
	 * @param num
	 * @return
	 */
	public String convertToBase7(int num){
		StringBuffer sb = new StringBuffer();
		if(num == 0)
			return "0";
		boolean isNeg = num<0;
		while(num!=0){
			sb.append(Math.abs(num)%7);
			num = num/7;
		}
		return isNeg ? "-"+sb.toString() : sb.toString();
	}

## Problem 80. Remove Duplicates from sorted array II
	/**
	 * Problem 80. Remove duplicates from sorted array II
	 * Follow up for "Remove Duplicates".
	 * What if duplicates are allowed at most twice?
	 * For example,
	 * Given sorted array nums = [1,1,1,2,2,3],
	 * Your function should return length = 5, with the first five 
	 * elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what
	 * you leave beyond the new length.
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums){
		if(nums.length <= 2)
			return nums.length;
		int i = 0, j = 0;			
		int duplicate = 0;
		while(++j != nums.length){
			if(nums[j] == nums[i]){
				duplicate++;
				if(duplicate < 2){
					nums[++i] = nums[j];
				}
			}else{
				duplicate = 0;
				nums[++i] = nums[j];
			}
		}
		return i+1;
	}
	
	public int removeDuplicates2(int[] nums){
		int i = 0;
		for(int n:nums){
			if(i<2 || nums[i-2] < n){
				nums[i++] = n;
			}
		}
		return i;
	}

