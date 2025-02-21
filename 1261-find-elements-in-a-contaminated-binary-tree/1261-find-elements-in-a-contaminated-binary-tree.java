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
class FindElements {
Set<Integer> set = new HashSet<>();
    //helper function for restoring original tree from contaminated binary tree
    private void recoverBinaryTree(TreeNode root, int value)
        {
            if(root==null) return;
            set.add(value);
            recoverBinaryTree(root.left, 2*value+1);
            recoverBinaryTree(root.right, 2*value+2);
        }

    public FindElements(TreeNode root) {
        recoverBinaryTree(root,0);
        recoverBinaryTree(root.left, 1);
        recoverBinaryTree(root.right, 2);  
    }
    
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */