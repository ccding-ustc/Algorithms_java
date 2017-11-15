package main;
import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int total = sc.nextInt();
    	List<Tic> tics = new ArrayList<>();
    	for(int i=0; i<n; i++) {
    		tics.add(new Tic(sc.nextInt(), sc.nextInt()));
    	}
    	Collections.sort(tics);
    	int idx = 0;
    	while(total > 0) {
    			Tic t = tics.get(idx);
    			if(total >= t.val && t.count>0) {
    				total -= t.val;
    				t.count--;
    			}else {
    				idx++;
    				if(idx==n)
    					break;
    			}
    	}
    	System.out.println(total);
    	sc.close();
    }
    static class Tic implements Comparable<Tic>{
    	int val;
    	int count;
    	public Tic(int _val, int _count) {
    		val = _val;
    		count = _count;
    	}
		@Override
		public int compareTo(Tic o) {
			return o.val-this.val;
		}
    }
}
