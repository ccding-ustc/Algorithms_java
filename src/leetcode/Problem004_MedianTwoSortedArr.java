package leetcode;

import java.util.Arrays;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4
 * The median is (2 + 3)/2 = 2.5
 * @author ccding
 *
 */
public class Problem004_MedianTwoSortedArr {
	// time complexity O(m+n)
    public double findMedianSortedArrays(int[] A, int[] B) {
    	int n = A.length;
    	int m = B.length;
        return (((n+m)&1)==1)?findk(A,B,n,m,(n+m+1)>>1):(findk(A,B,n,m,(n+m)>>1)+findk(A,B,n,m,((n+m)>>1)+1))*0.5;
    }
    public double findk(int a[],int b[],int lena,int lenb,int k){
        int i=0,j=0;
        for(;(i<lena&&j<lenb);){
            --k;
            if(a[i]<b[j]){
                if(k==0){
                    return (double)a[i];
                }
                ++i;
            }else if(k==0){
                return (double)b[j];
            }else{
                ++j;
            }
        }
        return (i>=lena)?(double)b[j+k-1]:(double)a[i+k-1];
    }
    
    // time complexity O(log(m+n))
    public double findMedianSortedArraysII(int[] nums1, int[] nums2) {
    	int m = nums1.length;
    	int n = nums2.length;
        if((m+n)%2 == 0){
        	return (searchKthElement(nums1, nums2, ((m+n)>>1)-1)+searchKthElement(nums1, nums2, (m+n)>>1))/2;
        }else{
        	return searchKthElement(nums1, nums2, (m+n)>>1);
        }
    }
    private double searchKthElement(int[] nums1, int[] nums2, int k){
    	if(nums1.length==0){
    		return (double)nums2[k];
    	}
    	if(nums2.length==0){
    		return (double)nums1[k];
    	}
    	if(k==0){
    		return Math.min(nums1[0], nums2[0]);
    	}
    	int mid1 = nums1.length>>1;
    	int mid2 = nums2.length>>1;
    	if(k > mid1+mid2){
    		if(nums1[mid1]>nums2[mid2]){
    			return searchKthElement(nums1, Arrays.copyOfRange(nums2, mid2+1, nums2.length), k-mid2-1);
    		}else{
    			return searchKthElement(Arrays.copyOfRange(nums1, mid1+1, nums1.length), nums2, k-mid1-1);
    		}
    	}else{
    		if(nums1[mid1]>nums2[mid2]){
    			return searchKthElement(Arrays.copyOfRange(nums1, 0, mid1), nums2, k);
    		}else{
    			return searchKthElement(nums1, Arrays.copyOfRange(nums2, 0, mid2), k);
    		}
    	}
    }
}