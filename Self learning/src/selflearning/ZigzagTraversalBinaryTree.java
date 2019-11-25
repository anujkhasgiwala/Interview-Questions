package selflearning;

import java.util.Stack;

public class ZigzagTraversalBinaryTree {
	public void zigzagTraverse(Node root) {
		if(root == null)
			return;
		
		Stack<Node> current = new Stack<Node>();
		Stack<Node> next = new Stack<Node>();
		boolean leftToRight = true;
		
		current.push(root);
		
		while(!current.isEmpty()) {
			Node temp = current.pop();
			System.out.print(temp.data + " ");
			if(leftToRight) {
				next.push(temp.left);
				next.push(temp.right);
			} else {
				next.push(temp.right);
				next.push(temp.left);
			}

			if(current.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<Node> temp1 = current;
				current = next;
				next = temp1;
			}
		}
	}
}
