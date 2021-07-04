package problems;

import java.util.LinkedList;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;

		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root.left);
		list.add(root.right);

		while(!list.isEmpty()) {
			TreeNode t1 = list.poll(), t2 = list.poll();

			if(t1 == null && t2 == null)
				continue;
			if(t1 == null || t2 == null)
				return false;
			if(t1.val != t2.val)
				return false;

			list.add(t1.left);
			list.add(t2.right);
			list.add(t1.right);
			list.add(t2.left);
		}
		return true;
	}

	public boolean isSymmetricRecursive(TreeNode root) {
		return root == null || isMirror(root.left, root.right);
	}

	private boolean isMirror(TreeNode left, TreeNode right) {
		if(left == null || right == null) {
			return left == right;
		}
		if(left.val != right.val) {
			return false;
		}
		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}
}