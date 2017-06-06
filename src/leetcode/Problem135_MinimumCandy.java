package leetcode;

/**
 * There are N children standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * @author ccding
 *
 */
public class Problem135_MinimumCandy {
	public int candy(int[] ratings) {
		if(ratings.length==0)
			return 0;
		int n = ratings.length;
        int dp[] = new int[n];
 		for(int i=0; i<n; i++)
 			dp[i] = 1;
        for(int i=1; i<n; i++){
        	if(ratings[i]>ratings[i-1])
        		dp[i] = dp[i-1]+1;
        }
        for(int i=n-2; i>=0; i--){
        	if(ratings[i] > ratings[i+1] && dp[i]<=dp[i+1])
        		dp[i] = dp[i+1]+1;
        }
        int res = 0;
        for(int i: dp)
        	res += i;
        return res;
    }
}
