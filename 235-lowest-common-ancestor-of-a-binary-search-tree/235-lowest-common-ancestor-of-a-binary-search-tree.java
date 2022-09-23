/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode helper(TreeNode root, int p, int q){
        if(root == null) {
            return root;
        }
        if(root.val < p) {
            return helper(root.right, p , q);
        }
        else if(root.val > q) {
            return helper(root.left, p, q); 
        }
        else {
            return root;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = Math.min(p.val, q.val);
        int b = Math.max(p.val, q.val);
        return helper(root, a, b);
    }
}