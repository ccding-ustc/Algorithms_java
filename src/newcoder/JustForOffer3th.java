package newcoder;

import java.util.Stack;

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
    
}
