package leetcode;
import java.util.Arrays;

public class MedianTwoSortedArr_leetcode {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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