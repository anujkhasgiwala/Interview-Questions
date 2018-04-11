package problems.tree;

public class PreorderTraversal {
	public static void main(String[] args) {
		preOrder(new Node());
	}

	static void preOrder(Node root) {
		if(root == null)
			return;
		
		System.out.print(root.data+" ");
		
		preOrder(root.left);
		
		preOrder(root.right);
	}
}

class Node {
    int data;
    Node left;
    Node right;
}