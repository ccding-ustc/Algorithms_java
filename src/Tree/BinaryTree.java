package Tree;

import java.util.Stack;

/**
 * 
 * @ClassName: BinaryTree
 *
 * @Description: 二叉树相关算法实现
 *
 * @author: ccding
 * @date: 2017年5月24日 下午8:20:13
 *
 * @param <T>
 */
public class BinaryTree <T extends Comparable <T>> {
	public TreeNode<T> root;// root node of binary tree
	
	//construct method
	public BinaryTree(TreeNode<T> root){
		this.root = root;
	}
	
	/**
	 * 先序遍历递归实现
	 */
	public void preOrderTraverse(TreeNode<T> t){
		if(t != null){
			System.out.print(t.val+" ");
			preOrderTraverse(t.left);
			preOrderTraverse(t.right);
		}
	}
	
	/**
	 * 先序遍历非递归实现
	 */
	public void preOrderTraverseII(TreeNode<T> t){
		Stack<TreeNode<T>> s = new Stack<>();
		s.push(t);
		TreeNode<T> curr = t;
		while(!s.isEmpty() || curr!=null){
			while(curr!=null){
				System.out.print(curr.val + " ");
				s.push(curr);
				curr = curr.left;
			}
			if(!s.isEmpty()){
				curr = s.pop();
				curr = curr.right;
			}
		}
	}
	
	/**
	 * 先序遍历非递归实现
	 */
	public void preOrderTraverseIII(TreeNode<T> t){
		Stack<TreeNode<T>> s = new Stack<>();
		s.push(t);
		TreeNode<T> p = null;
		while(!s.isEmpty()){
			p = s.pop();
			System.out.print(p.val + " ");
			if(p.right != null)
				s.push(p.right);
			if(p.left != null)
				s.push(p.left);
		}
	}
	
	/**
	 * 中序遍历递归实现
	 */
	public void inOrderTraverse(TreeNode<T> t){
		if(t != null){
			inOrderTraverse(t.left);
			System.out.print(t.val+" ");
			inOrderTraverse(t.right);
		}
	}
	
	/**
	 * 中序遍历非递归实现
	 */
	public void inOrderTraverseII(TreeNode<T> t){
		Stack<TreeNode<T>> s = new Stack<>();
		TreeNode<T> curr = t;
		while(!s.isEmpty() || curr!=null){
			while(curr != null){
				s.push(curr);
				curr = curr.left;
			}
			if(!s.isEmpty()){
				curr = s.pop();
				System.out.print(curr.val + " ");
				curr = curr.right;
			}
			
		}
	}
	
	/**
	 * 后序遍历递归实现
	 */
	public void postOrderTraverse(TreeNode<T> t){
		if(t != null){
			postOrderTraverse(t.left);
			postOrderTraverse(t.right);
			System.out.print(t.val+" ");
		}
	}
	
	/**
	 * 后序遍历非递归实现
	 */
	public void postOrderTraverseII(TreeNode<T> t){
		Stack<TreeNode<T>> s1 = new Stack<>();
		Stack<TreeNode<T>> s2 = new Stack<>();
		s1.push(t);
		TreeNode<T> curr = null;
		while(!s1.isEmpty()){
			curr = s1.pop();
			s2.push(curr);
			if(curr.left!=null)
				s1.push(curr.left);
			if(curr.right != null)
				s1.push(curr.right);
		}
		while(!s2.isEmpty())
			System.out.print(s2.pop().val + " ");
	}
	
}
