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
    
    public void inorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        
        inorder(root.left, ans);
        //System.out.print(root.val + " ");
        ans.add(root.val);
        inorder(root.right, ans);
        return;
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
//         Stack<TreeNode> st = new Stack<>();
           List<Integer> ans = new ArrayList<>();
        
//         st.push(root);
//         while(!st.isEmpty()){
//             TreeNode temp = root;
//             st.pop();
            
//             if(temp.left != NULL){
//                 //ans.add(temp.left.val);
//                 st.push(temp.left);
//             }
            
//             ans.add(temp.val);
            
//             if(temp.right != NULL){
//                 //ans.add(temp.right.val);
//                 st.push(temp.right);
//             }
            
//         }
        inorder(root, ans);
        return ans;
    }
}