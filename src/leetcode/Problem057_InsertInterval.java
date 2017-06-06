package leetcode;

import java.util.ArrayList;

import utils.Interval;
/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * You may assume that the intervals were initially sorted according to their start times.
 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * @author ccding
 *
 */
public class Problem057_InsertInterval {

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int low = 0;
		int high = intervals.size()-1;
		while(low <= high){
			int mid = low + ((high-low)>>1);
			if(intervals.get(mid).start < newInterval.start){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		ArrayList<Interval> res = new ArrayList<>();
		intervals.add(low, newInterval);
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for(int i=1; i<intervals.size(); i++){
			Interval tmp = intervals.get(i);
			if(tmp.start > end){
				res.add(new Interval(start, end));
				start = tmp.start;
				end = tmp.end;
			}else{
				end = Math.max(end, tmp.end);
			}
		}
		res.add(new Interval(start, end));
		return res;
    } 
}


