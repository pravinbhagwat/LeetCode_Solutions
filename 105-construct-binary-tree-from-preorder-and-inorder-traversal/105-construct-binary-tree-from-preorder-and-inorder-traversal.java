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
    public static TreeNode createBST(int[] preorder, int[] inorder, HashMap<Integer, Integer> hm, int preStart, int preEnd, int inStart, int inEnd) {
        
        if(preStart > preEnd || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = hm.get(root.val);
        int leftPart = rootIndex - inStart;
        
        root.left = createBST(preorder, inorder, hm, preStart + 1, preStart + leftPart, inStart, rootIndex-1);
        root.right = createBST(preorder, inorder, hm, preStart + leftPart + 1, preEnd, rootIndex+1, inEnd);
        return root;
    
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int m = inorder.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n; i++) {
            hm.put(inorder[i], i);
        }
        
        TreeNode root = createBST(preorder, inorder, hm, 0, n-1, 0, m-1);
        return root;
    }
}