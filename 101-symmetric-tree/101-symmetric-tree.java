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
    private boolean isSymmetricUtil(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        } 
        if(left.val != right.val) return false;
        Boolean leftTree = isSymmetricUtil(left.left, right.right);
        Boolean rightTree = isSymmetricUtil(left.right, right.left);
        return leftTree && rightTree;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricUtil(root.left, root.right);
    }
}