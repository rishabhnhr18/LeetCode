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
    private boolean mirrorCheck(TreeNode left, TreeNode right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null || left.val!=right.val) return false;
        return mirrorCheck(left.left, right.right) && mirrorCheck(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return mirrorCheck(root.left,  root.right);
    }
}