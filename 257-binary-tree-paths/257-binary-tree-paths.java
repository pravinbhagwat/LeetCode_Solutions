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
    
    public void findPaths(TreeNode root, String temp, List<String> ans){
        if(root == null) return;
        
        
        if(root.left == null && root.right == null) {
            temp += root.val;
            ans.add(temp);
            return;
        }
        String path = root.val + "->";
        temp += path;
        if(root.left != null) findPaths(root.left, temp, ans);
        if(root.right != null) findPaths(root.right, temp, ans);
        
        return;
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        findPaths(root, "", ans);
        return ans;
    }
}