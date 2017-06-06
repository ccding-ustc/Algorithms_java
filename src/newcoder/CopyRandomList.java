package newcoder;

import java.util.HashMap;
import java.util.Map;

import utils.RandomListNode;

/**
 * A linked list is given such that each node contains an 
 * additional random pointer which could point to any node 
 * in the list or null.
 * Return a deep copy of the list.
 * @author ccding
 *
 */
public class CopyRandomList {
	public RandomListNode copyRandomList(RandomListNode head){
		RandomListNode curr = head;
		Map<RandomListNode, RandomListNode> m = new HashMap<>();
		while(curr != null){
			m.put(curr, new RandomListNode(curr.label));
			curr = curr.next;
		}
		for(Map.Entry<RandomListNode, RandomListNode> entry: m.entrySet()){
			RandomListNode tmp = entry.getValue();
			tmp.next = m.get(entry.getKey().next);
			tmp.random = m.get(entry.getKey().random);
		}
		return m.get(head);
	}
}
