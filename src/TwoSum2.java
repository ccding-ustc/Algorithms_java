
public class TwoSum2 {
	public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while(low <= high){
        	if(numbers[low] + numbers[high] == target){
        		res[0] = low;
        		res[1] = high;
        		return res;
        	}else if(numbers[low] + numbers[high] < target){
        		low++;
        	}else{
        		high--;
        	}
        }
        return res;
    }
}
