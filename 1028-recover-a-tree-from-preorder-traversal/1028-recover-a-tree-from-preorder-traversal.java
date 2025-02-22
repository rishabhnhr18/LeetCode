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

 /*
class Solution {
    private int position =0;
    public TreeNode recoverFromPreorder(String traversal) {
        if(traversal == null || traversal.length() == 0) return new TreeNode();
            int size= traversal.length();
            TreeNode root = new TreeNode(getValue(traversal, size, position));
            buildTree(root, 1, traversal, size, position);
            buildTree(root, 1, traversal, size, position);
            return root;
            }
            private int getValue(String traversal, int size, int position){
            int val=0;
            while(position <size && traversal.charAt(position)>='0' && traversal.charAt(position)<='9')
            {
                val=val*10+Integer.parseInt(traversal.substring(position, position+1));
                position++;
            }
            return val;
        }

        private int getDashLength(String traversal , int size, int position){
            int dashLen=0;
            while(position <= size && traversal.charAt(position) == '-')
            {
                dashLen++;
                position++;
            }
            return dashLen;
        }
        private void buildTree(TreeNode node, int dashLen, String traversal, int size, int position){
            if( position == size) return;
            int prevPosition =position;
            int currDashLen = getDashLength(traversal, size, position);
            if(currDashLen < dashLen){
                position =prevPosition;
                return;
            }
            int nodeValue = getValue(traversal, size, position);
            TreeNode newNode = new TreeNode(nodeValue);
            if(node.left==null) node.left = newNode;
            else node.right = newNode;
            buildTree(newNode, 1+dashLen, traversal, size, position);
        }
}
*/

class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        int[] position = {0}; // Mutable position tracker
        return buildTree(traversal, 0, position);
    }

    private TreeNode buildTree(String traversal, int depth, int[] position) {
        int dashCount = getDashLength(traversal, position);
        if (dashCount != depth) {
            position[0] -= dashCount; // Backtrack if depth does not match
            return null;
        }

        int value = getValue(traversal, position);
        TreeNode node = new TreeNode(value);
        
        node.left = buildTree(traversal, depth + 1, position);
        node.right = buildTree(traversal, depth + 1, position);

        return node;
    }

    private int getDashLength(String traversal, int[] position) {
        int count = 0;
        while (position[0] < traversal.length() && traversal.charAt(position[0]) == '-') {
            count++;
            position[0]++;
        }
        return count;
    }

    private int getValue(String traversal, int[] position) {
        int value = 0;
        while (position[0] < traversal.length() && Character.isDigit(traversal.charAt(position[0]))) {
            value = value * 10 + (traversal.charAt(position[0]) - '0');
            position[0]++;
        }
        return value;
    }
}
