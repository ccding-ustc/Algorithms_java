package Tree;

public class BinarySearchTree<T extends Comparable<T>> {
	
	/**
	 * 查找特定元素
	 * @param x 树根节点
	 * @param k 待查找元素
	 * @return
	 */
	public TreeNode<T> search(TreeNode<T> x, T k){
		if(x==null || x.val == k){
			return x;
		}
		if(k.compareTo(x.val) < 0){
			return search(x.left, k);
		}else{
			return search(x.right, k);
		}
	}
	
	/**
	 * 查找待定元素，非递归
	 * @param x
	 * @param k
	 * @return
	 */
	public TreeNode<T> searchNoIter(TreeNode<T> x, T k){
		while(x != null && k != x.val){
			if(k.compareTo(x.val) < 0){
				x = x.left;
			}else{
				x = x.right;
			}
		}
		return x;
	}
	
	/**
	 * 求树中最小元素
	 * @param x
	 * @return
	 */
	public TreeNode<T> minimum(TreeNode<T> x){
		while(x.left != null)
			x = x.left;
		return x;
	}
	
	/**
	 * 求树中最大元素
	 * @param x
	 * @return
	 */
	public TreeNode<T> maximum(TreeNode<T> x){
		while(x.right != null)
			x = x.right;
		return x;
	}
	
	/**
	 * 求树中节点x的后继节点
	 * @param x
	 * @return
	 */
	public TreeNode<T> successor(TreeNode<T> x){
		if(x.right != null){
			return minimum(x.right);
		}
		TreeNode<T> y = x.parent;
		while(y!=null && x == y.right){
			x = y;
			y = y.parent;
		}
		return y;
	}
	
	/**
	 * 求树中节点x的前驱节点
	 * @param x
	 * @return
	 */
	public TreeNode<T> predecessor(TreeNode<T> x){
		if(x.left != null)
			return maximum(x.left);
		TreeNode<T> y = x.parent;
		while(y!=null && x == y.left){
			x = y;
			y = y.parent;
		}
		return y;
	}
	
	/**
	 * 向树中插入一个节点
	 * @param x
	 * @param k
	 */
	public void insert(TreeNode<T> x, TreeNode<T> k){
		TreeNode<T> y = null;
		while(x != null){
			y = x;
			if(k.val.compareTo(x.val) < 0){
				x = x.left;
			}else{
				x = x.right;
			}
		}
		k.parent = y;
		if(y == null)
			x = k;
		else if(k.val.compareTo(y.val) < 0)
			y.left = k;
		else
			y.right = k;
		
	}
	
	/**
	 * 删除树中一个节点
	 * @param x
	 * @param k
	 */
	public void delete(TreeNode<T> x, TreeNode<T> k){
		if(k.left == null)
			transplant(x, k, k.right);
		else if(k.right == null)
			transplant(x, k, k.left);
		else{
			TreeNode<T> y = minimum(k.right);
			if(y.parent != k){
				transplant(x, y, y.right);
				y.right = k.right;
				y.right.parent = y;
			}
			transplant(x, k, y);
			y.left = k.left;
			y.left.parent = y;
		}
	}
	/**
	 * 用子树 v 替换子树 u
	 * @param x
	 * @param u
	 * @param v
	 */
	private void transplant(TreeNode<T> x, TreeNode<T> u, TreeNode<T> v){
		if(u.parent == null)
			x = v;
		else if(u == u.parent.left)
			u.parent.left = v;
		else
			u.parent.right = v;
		if(v != null)
			v.parent = u.parent;
	}
}
