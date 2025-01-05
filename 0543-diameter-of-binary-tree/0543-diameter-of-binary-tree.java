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
    private int findHeight(TreeNode node)
    {
        if(node==null) return 0;
        return Math.max(findHeight(node.left),findHeight(node.right))+1;
    }
    private int findDiameterofBinaryTree(TreeNode node, int max)
    {
        if(node==null) return max;
        int leftHeight= findHeight(node.left);
        int rightHeight=findHeight(node.right);
        max=Math.max(max, leftHeight+rightHeight);
        max=findDiameterofBinaryTree(node.left, max);
        max=findDiameterofBinaryTree(node.right, max);
        return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return findDiameterofBinaryTree(root, 0);
    }
}