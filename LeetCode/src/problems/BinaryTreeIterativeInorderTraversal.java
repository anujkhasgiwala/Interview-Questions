package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeIterativeInorderTraversal {
	List<Integer> traversal(TreeNode root) {
		List<Integer> inorder = new ArrayList<Integer>();
		
		if(root == null)
			return inorder;
		
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		TreeNode temp = root;
		while(temp != null || !nodes.isEmpty()) {
			while(temp != null) {
				nodes.push(temp);
				temp = temp.left;
			}
			temp = nodes.pop();
			inorder.add(temp.val);
			temp = temp.right;
		}
		
		return inorder;
	}
	
	public static void main(String[] args) {
		
	}
}
