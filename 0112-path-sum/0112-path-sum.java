/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return root.val == targetSum;

        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);

    }
}

//     if (sum(root) == targetSum)
//         return true;
//     return false;
// }

// public int sum(TreeNode root) {
//     int sum = 0;
//     if (root == null) {
//         sum += 0;
//     }
//     int lsum = sum(root.left);
//     int rsum = sum(root.right);
//     return lsum + rsum + root.val;

// int totalsum = sum(root);
// if (totalsum == 0)
//     return false;
// return totalsum == targetSum;

// public int sum(TreeNode root) {
//     if (root == null)
//         return 0;
//     int lsum = sum(root.left);
//     int rsum = sum(root.right);

//     return lsum + rsum + root.val;
// }