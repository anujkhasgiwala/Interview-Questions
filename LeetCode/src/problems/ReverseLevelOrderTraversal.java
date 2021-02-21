package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLevelOrderTraversal {
    List<List<Integer>> traversal = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        addNode(root, 0);
        Collections.reverse(traversal);
        return traversal;
    }

    private void addNode(TreeNode node, int level) {
        if(node == null) {
            return;
        }

        if(traversal.size() == level) {
            traversal.add(new ArrayList<>());
        }
        traversal.get(level).add(node.val);
        addNode(node.left, level + 1);
        addNode(node.right, level + 1);
    }
}
