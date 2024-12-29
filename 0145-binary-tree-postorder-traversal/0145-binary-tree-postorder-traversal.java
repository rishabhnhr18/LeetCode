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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        if(root.left==null && root.right==null)
        {
            result.add(root.val);
            return result;
        }
        postOrderTrav(root, result);
        return result;
    }
    private void postOrderTrav(TreeNode node, List<Integer> result)
    {
        if(node==null) return;
        postOrderTrav(node.left, result);
        postOrderTrav(node.right, result);
        result.add(node.val);
    }
}