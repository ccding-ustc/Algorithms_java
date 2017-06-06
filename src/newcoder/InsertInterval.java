package newcoder;

import java.util.ArrayList;

import utils.Interval;

public class InsertInterval {

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


