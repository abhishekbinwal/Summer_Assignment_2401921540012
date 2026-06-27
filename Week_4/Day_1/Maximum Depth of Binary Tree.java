class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0; // base case
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}