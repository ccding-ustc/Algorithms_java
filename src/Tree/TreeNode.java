package Tree;

public class TreeNode <T extends Comparable<T>>{
	public T val;
	public TreeNode<T> parent;
	public TreeNode<T> left;
	public TreeNode<T> right;
	public TreeNode(T val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
