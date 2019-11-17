package selflearning;

public class IsBST {
	boolean isBst(Node root, int min, int max) {
		if(root == null)
			return true;
		
		if(root.data < min || root.data > max)
			return false;
		
		return (isBst(root.left, min, root.data - 1) && isBst(root.right, root.data + 1, max));
	}
}
