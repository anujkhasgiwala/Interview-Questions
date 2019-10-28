package selflearning;

class Node {
	int data;
	Node left, right;
	
	Node(int key) {
		data = key;
		left = null;
		right = null;
	}
}

public class BST {
	Node search(Node root, int k) {
		if(root == null || root.data == k)
			return root;
		
		if(root.data < k)
			return search(root.right, k);
		
		return search(root.left, k);
	}
	
	Node insert(Node root, int key) {
		if(root == null)
			return new Node(key);
		
		if(root.data < key)
			root.right = insert(root.right, key);
		else
			root.left = insert(root.left, key);
		
		return root;
	}
}
