package main;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Point> points = new ArrayList<>(n);
		for(int i=0; i<n; i++)
			points.add(new Point(sc.nextInt(), sc.nextInt()));
		Collections.sort(points);
		int tMin = points.get(k-1).low;
		int tMax = points.get(n-k).high;
		if(tMin<=tMax)
			System.out.println(tMin+" "+tMax);
		else
			System.out.println("error");
		sc.close();
		
	}
	static class Point implements Comparable<Point>{
		int low;
		int high;
		public Point(int _low, int _high) {
			this.low = _low;
			this.high = _high;
		}
		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			if(this.low != o.low)
				return this.low-o.low;
			else
				return o.high-this.high;
		}
		
		public String toString() {
			return low+" "+high;
		}
	}
}
