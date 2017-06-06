# General algorithms implemented by Java.
code by ccding. 2016.10 /br

[TOC]

## Data Structure

- [Tree](https://github.com/ccding-ustc/Algorithms_java/tree/master/src/Tree)
    + [Binary Tree](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/Tree/BinaryTree.java)
    + [Binary Search Tree, BST](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/Tree/BinarySearchTree.java)
    + [Black Red Tree, BRT](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/Tree/BlackRedTree.java)
    + [AVL Tree](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/Tree/AVLTree.java)

- Graph

- String
    + [String matcher](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/algorithms3th/StringMatcher.java)
        * Naive method
        * KMP

## [Design Patterns](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/DesignPattern)

- [Singleton](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/DesignPattern/Singleton.java)
- [Factory](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/DesignPattern/Factory.java)

## [Leetcode Problems](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode)

- [Problem004_MedianTwoSortedArr](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem004_MedianTwoSortedArr.java)

There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n))

- [Problem005_LongestPalindromicSubstring](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem005_LongestPalindromicSubstring.java)

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example:
Input: "cbbd"
Output: "bb"

- [Problem006_ZigZagConversion](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem006_ZigZagConversion.java)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

- [Problem007_ReverseInteger](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem007_ReverseInteger.java)

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

- [Problem008_StringToInteger](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem008_StringToInteger.java)

Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

- [Problem009_PalindromeNumber](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem009_PalindromeNumber.java)

Determine whether an integer is a palindrome. Do this without extra space.

- [Problem012_IntegerToRoman](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem012_IntegerToRoman.java)

Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.

- [Problem013_RomanToInteger](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem013_RomanToInteger.java)

Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.

- [Problem021_MergeTwoSortedLists](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem021_MergeTwoSortedLists.java)

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

- [Problem023_MergeKSortedLists](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem023_MergeKSortedLists.java)

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

- [Problem026_RemoveDuplicatesFromSortedArrays](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem026_RemoveDuplicatesFromSortedArrays.java)

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

- [Problem027_RemoveElement](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem027_RemoveElement.java)

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.

- [Problem033_SearchInRotatedSortedArr](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem033_SearchInRotatedSortedArr.java)

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.

- [Problem035_SearchInsertPosition](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem035_SearchInsertPosition.java)

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

- [Problem043_MultiplyStrings](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem043_MultiplyStrings.java)

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

Note:

The length of both num1 and num2 is < 110.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

- [Problem057_InsertInterval](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem057_InsertInterval.java)

Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
## Newcoder Problems
