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
    private boolean hasSum(TreeNode node, int  target, int total)
    {
        if(node==null) return false;
        total+=node.val;
        if(node.left==null && node.right==null) return target==total;
        return hasSum(node.left, target, total)||hasSum(node.right, target, total);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        int sum=0;
        return hasSum(root, targetSum, sum);
    }
}