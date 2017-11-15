package newcoder;

import java.util.*;

import utils.ListNode;

/**
 * 实现《剑指offer》第三版 所有问题实例
 * @author ccding
 * @date 2017/06/13
 *
 */
public class JustForOffer3th {
	
	/**
	 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.
	 * 则经过替换之后的字符串为We%20Are%20Happy。
	 * @param str
	 * @return
	 */
	public String replaceSpace(StringBuffer str) {
    	StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == ' ')
                sb.append("%20");
        	else
                sb.append(str.charAt(i));
        return sb.toString();
    }
	
	
	/**
	 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
	 */
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();  
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
    	if(stack2.isEmpty()){
			while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        if(!stack2.isEmpty())
        	return stack2.pop();
        return 0;
    }
    
    /**
     * 反转链表-栈
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
    	if(head==null)
    		return null;
    	Stack<ListNode> s = new Stack<>();
        while(head!=null){
            s.push(head);
        	head = head.next;
        }
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(true){
            curr.next = s.pop();
            System.out.print(curr.next.val);
            curr = curr.next;
            if(s.size()==0){
            	curr.next = null;
            	break;
            }
         
        }
        return res.next;
    }
    
    /**
     * 反转链表-指针
     * @param head
     * @return
     */
    public ListNode reverseListII(ListNode head){
    	if(head == null)
    		return head;
    	ListNode pre = head;
        ListNode curr = head;
        ListNode tail = head.next;
        pre.next = null;
        while(tail != null){
			curr = tail;
            tail = tail.next;
            curr.next = pre;
            pre = curr;
        }
        return curr;
    }
    
    /**
     * 链表中环的入口点
     * @param pHead
     * @return
     */
    public ListNode entryNodeOfLoop(ListNode pHead){
    	if(pHead == null || pHead.next == null)
            return null;
        ListNode f = pHead;
        ListNode s = pHead;
        while(f != null && f.next != null){
        	f = f.next.next;
        	s = s.next;
        	if(s == f){
        		f = pHead;
        		while(s != f){
        			s = s.next;
        			f = f.next;
        		}
        		if(s==f)
        			return s;
        	}
        }
        return null;
    }
    
    /**
     * 寻找链表中倒数第k个节点
     * @param pHead
     * @return
     */
    public ListNode findKthToTail(ListNode pHead, int k){
    	if(pHead==null || k<=0)
    		return null;
    	ListNode p = pHead;
    	for(; k>1 && p!=null; k--)
    		p = p.next;
    	if(p==null)
    		return null;
    	ListNode q = pHead;
    	while(p.next != null){
    		p = p.next;
    		q = q.next;
    	}
    	return q;
    }
    
    /**
     * 打印全排列 包含重复字符
     * @param str
     * @return
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        permutation(str.toCharArray(), 0, res);
        Collections.sort(res);
        return res;
     }
     private void permutation(char[] cStrs, int start, ArrayList<String> res){
 		if(start == cStrs.length-1){
 			res.add(new String(cStrs));
         }
         for(int i=start; i<cStrs.length; i++){
             if(isSwap(cStrs, start, i)){
                 swap(cStrs, i, start);
                 permutation(cStrs, start+1, res);
                 swap(cStrs, start, i);
             }
         }
     }
     private boolean isSwap(char[] cStrs, int start, int end){
         for(int i = start; i<end; i++){
             if(cStrs[i] == cStrs[end])
                 return false;
         }
         return true;
     }
     private void swap(char[] s, int src, int des){
         char tmp = s[src];
         s[src] = s[des];
         s[des] = tmp;
     }
     
     /**
      * 旋转数组中的最小数字
      * @param array
      * @return
      */
     public int findMin(int[] nums) {
         if(nums.length==0)
             return 0;
     	int s = 0;
         int t = nums.length-1;
         while(s<=t){
             if(nums[s] < nums[t])
             	return nums[s];
         	if(t-s<=1)
             	return nums[t];
             int mid = s + ((t-s)>>1);
             if(nums[mid] < nums[t])
                 t = mid;
             else if(nums[mid] > nums[s])
                 s = mid+1;
             else
 				return getMin(nums, s, mid, t);
         }
         return 0;
     }
     public int getMin(int[] array, int s, int mid, int t){
         int min1 = Integer.MAX_VALUE;
         int min2 = Integer.MAX_VALUE;
         for(int i=s;i<=mid;i++)
             if(array[i]<min1)
                 min1 = array[i];
         for(int i=mid+1; i<=t; i++)
             if(array[i]<min2)
                 min2 = array[i];
         return Math.min(min1, min2);
     }
    
}
