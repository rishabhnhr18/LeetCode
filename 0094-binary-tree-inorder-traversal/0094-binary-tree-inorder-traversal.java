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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        if(root.left==null && root.right==null)
        {
            result.add(root.val);
            return result;
        }
        inorderTrav(root, result);
        return result;
    }
    private void inorderTrav(TreeNode node, List<Integer> result)
    {
        if(node==null) return;
        inorderTrav(node.left, result);
        result.add(node.val);
        inorderTrav(node.right, result);
    }
}