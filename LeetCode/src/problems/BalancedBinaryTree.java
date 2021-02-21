package problems;

import java.lang.Math;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return helper(root, 0) >= 0;
    }

    public int helper(TreeNode root, int height) {
        if (root == null) {
            return height;
        }

        int l = helper(root.left, height + 1);
        int r = helper(root.right, height + 1);

        if(l < 0 || r < 0 || Math.abs(l - r) > 1) {
            return -1;
        }

        return Math.max(l, r);
    }
}