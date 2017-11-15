package main;
import java.util.*;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Bread> breads = new ArrayList<>(n);
		int idx = 0;
		for(int i=0; i<n; i++) {
			breads.add(new Bread(sc.nextInt(), sc.nextInt(), idx++));
		}
		int[] res = new int[n];
		while(breads.size() >=m ) {
			Collections.sort(breads);
			for(int i=0; i<2 && breads.size()>0; i++) {
				Bread rm = breads.get(0);
				res[rm.idx] = -1;
				breads.remove(rm);
			}
			for(Iterator<Bread> it = breads.iterator(); it.hasNext();) {
				Bread b = it.next();
				if(b.val <= b.dec) {
					res[b.idx] = 0;
					it.remove();
				}else {
					b.val -= b.dec;
				}
			}
		}
		if(!breads.isEmpty()) {
			for(Bread b: breads) {
				res[b.idx] = b.val;
			}
		}
		for(int i=0; i<n; i++)
			System.out.println(res[i]);
		sc.close();
		
	}
	
	static class Bread implements Comparable<Bread>{
		int val;
		int dec;
		int idx;
		public Bread(int _val, int _dec, int _idx) {
			this.val = _val;
			this.dec = _dec;
			this.idx = _idx;
		}
		@Override
		public int compareTo(Bread o) {
			if(this.val != o.val)
				return o.val-this.val;
			else {
				return o.dec -this.dec;
			}
		}
		
		public String toString() {
			return val +" "+dec;
		}
		
	}
}
