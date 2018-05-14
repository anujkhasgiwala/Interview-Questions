package problems;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		return preorder(inorderToBST(nums, 0, nums.length - 1));
    }

	public TreeNode inorderToBST(int[] nums, int start, int end) {
		if(start > end)
			return null;

		int mid = (start + end) / 2;

		TreeNode node = new TreeNode(nums[mid]);
		node.left = inorderToBST(nums, start, mid - 1);
		node.right = inorderToBST(nums, mid + 1, end);

		return node;
    }

	public TreeNode preorder(TreeNode root) {
		if(root == null)
			return null;

		preorder(root.left);
		preorder(root.right);

		return root;
	}
}
