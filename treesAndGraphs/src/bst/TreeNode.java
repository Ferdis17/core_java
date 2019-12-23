package bst;

public class TreeNode<E>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private E element;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E e) {
		
		this.element = e;
		
	}
	
	TreeNode<Integer> root = new TreeNode<>(60);
//	root.left = new TreeNode<>(55);
//	root.right = new TreeNode<>(100);

	
public boolean searchElement(E y) {
	TreeNode<Integer> root = new TreeNode<>(this.element);
	TreeNode<E> current = root;
	return false;
}
}
