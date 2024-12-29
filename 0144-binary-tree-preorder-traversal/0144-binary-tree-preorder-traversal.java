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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        if(root.left==null && root.right==null)
        {
            result.add(root.val);
            return result;
        }
        preorderTrav(root, result);
        return result;
    }

private void preorderTrav(TreeNode node, List<Integer> result)
{
    if(node==null) return;
    result.add(node.val);
    preorderTrav(node.left, result);
    preorderTrav(node.right, result);
}
}