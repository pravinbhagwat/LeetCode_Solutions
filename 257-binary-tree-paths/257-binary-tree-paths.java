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
    
    public boolean findPaths(TreeNode root, String temp, List<String> ans){
        if(root == null) return true;
        
        
        if(root.left == null && root.right == null) {
            temp += root.val;
            ans.add(temp);
            return true;
        }
        String path = root.val + "->";
        temp += path;
        if(root.left != null) findPaths(root.left, temp, ans);
        if(root.right != null) findPaths(root.right, temp, ans);
        
        return true;
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        findPaths(root, "", ans);
        return ans;
    }
}