package main;

import java.util.*;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, SSID> list = new HashMap<>();
		Map<String, String> curr = new HashMap<>();
		while(n-- !=0) {
			String[] strs = sc.nextLine().split(" ");
			if(strs[0].equals("put")) {
				curr.put(strs[1], strs[2]);
			}else if(strs[0].equals("mkss")) {
				list.put(strs[1], new SSID(strs[1], curr));
				curr = list.get(strs[1]).values;
			}else if(strs[0].equals("get")) {
				if(strs.length>2)
				{
					if(list.get(strs[2])==null)
						System.out.println("(UNKNOWN_SSID)");
					else
						curr = list.get(strs[2]).values;
				}
				if(curr.get(strs[1])==null) {
					System.out.println("(NULL)");
				}else {
					System.out.println(curr.get(strs[1]));
				}
			}else if(strs[0].equals("del")) {
				if(curr.get(strs[1])==null)
					System.out.println("(NULL)");
				curr.remove(strs[1]);
			}
		}
		sc.close();
	}
	static class SSID{
		String id;
		Map<String, String> values;
		public SSID(String _id, Map<String, String> _values) {
			this.id = _id;
			values = _values;
			
		}
	}
}
