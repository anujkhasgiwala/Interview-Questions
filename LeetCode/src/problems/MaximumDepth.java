package problems;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class MaximumDepth {
	public int maxDepth(TreeNode root) {
		if(root == null) {
	        return 0;
	    }

	    int leftDepth = maxDepth(root.left);
	    int rightDepth = maxDepth(root.right);

	    return Math.max(leftDepth, rightDepth) + 1;
	}
}
