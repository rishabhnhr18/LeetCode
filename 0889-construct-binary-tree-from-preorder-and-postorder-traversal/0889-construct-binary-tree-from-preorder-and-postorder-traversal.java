/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int preOrderIndex = 0;
    int postOrderIndex = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        TreeNode node = new TreeNode(preorder[preOrderIndex]);
        preOrderIndex++;
        if (node.val != postorder[postOrderIndex])
            node.left = constructFromPrePost(preorder, postorder);
        if (node.val != postorder[postOrderIndex])
            node.right = constructFromPrePost(preorder, postorder);
        postOrderIndex++;
        return node;
    }
}