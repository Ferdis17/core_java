package bst;

public class BST {

	public static void main(String[] args) {

	}

	public void insertElement(TreeNode node, int data) {

		if (node == null) {

			node = new TreeNode(data);
		} else {
			if (data <= node.getLeft().getData()) {
				insertElement(node.getLeft(), data);
			} else {
				insertElement(node.getRight(), data);
			}
		}
	}
}
