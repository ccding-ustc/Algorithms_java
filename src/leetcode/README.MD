# leetcode problems
code by ccding. 2017.01.

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

- [Problem061_RotateList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem061_RotateList.java)

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

- [Problem075_SortColors](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem075_SortColors.java)

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

- [Problem080_RemoveDuplicatesFromSortedArrII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem080_RemoveDuplicatesFromSortedArrII.java)

Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

- [Problem082_RemoveDuplicatesFromSortedListII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem082_RemoveDuplicatesFromSortedListII.java)

Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3

- [Problem083_RemoveDuplicatesFromSortedList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem083_RemoveDuplicatesFromSortedList.java)

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

- [Problem088_MergeSortedArrays](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem088_MergeSortedArrays.java)
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

- [Problem092_ReverseLinkedListII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem092_ReverseLinkedListII.java)

Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,
return 1->4->3->2->5->NULL.

- [Problem108_ConvertSortedArrToBST](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem108_ConvertSortedArrToBST.java)

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

- [Problem109_ConvertSortedListToBST](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem109_ConvertSortedListToBST.java)

Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

- [Problem131_PalindromePartitioning](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem131_PalindromePartitioning.java)

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return
[
  ["aa","b"],
  ["a","a","b"]
]

- [Problem132_PalindromePartitioningII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem132_PalindromePartitioningII.java)

Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s = "aab",
Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

- [Problem135_MinimumCandy](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem135_MinimumCandy.java)

There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

- [Problem138_CopyRandomList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem138_CopyRandomList.java)

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

- [Problem142_LinkedListCycleII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem142_LinkedListCycleII.java)

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.
Follow up:
Can you solve it without using extra space?

- [Problem143_ReorderList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem143_ReorderList.java)

Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

- [Problem147_InsertionSortList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem147_InsertionSortList.java)

Sort a linked list using insertion sort.

- [Problem148_SortList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem148_SortList.java)

Sort a linked list in O(n log n) time using constant space complexity.

- [Problem150_EvaluateRPN](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem150_EvaluateRPN.java)

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

- [Problem151_ReverseWordsInString](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem151_ReverseWordsInString.java)

Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

- [Problem153_FindMin](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem153_FindMin.java)

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

- [Problem167_TwoSumII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem167_TwoSumII.java)

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

- [Problem205_IsomorphicStrings](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem205_IsomorphicStrings.java)

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.

- [Problem206_ReverseLinkedList](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem206_ReverseLinkedList.java)

Reverse a singly linked list.


- [Problem258_AddDigits](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem258_AddDigits.java)

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

- [Problem344_ReverseString](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem344_ReverseString.java)

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

- [Problem378_KthSmallestElementInSortedMat](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem378_KthSmallestElementInSortedMat.java)

Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
Note: 
You may assume k is always valid, 1 ≤ k ≤ n2.

- [Problem415_AddStrings](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem415_AddStrings.java)

Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

- [Problem451_SortCharactersByFrequency](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem451_SortCharactersByFrequency.java)

Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

- [Problem461_HammingDistance](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem461_HammingDistance.java)

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 2^31.

- [Problem477_TotalHammingDistance](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem477_TotalHammingDistance.java)

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Now your job is to find the total Hamming distance between all pairs of the given numbers.

- [Problem504_Base7](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem504_Base7.java)

Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"

- [Problem541_ReverseWordsInStringII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem541_ReverseWordsInStringII.java)

Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]

- [Problem557_ReverseWordsInStringIII](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/Problem557_ReverseWordsInStringIII.java)

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)
- [](https://github.com/ccding-ustc/Algorithms_java/blob/master/src/leetcode/)