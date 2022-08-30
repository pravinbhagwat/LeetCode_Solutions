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
    public List<List<Integer>> sol1(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<TreeNode> s1 = new Stack<>();// Store L to R
        Stack<TreeNode> s2 = new Stack<>();// Store R to L
        s1.push(root);
        while(!s1.empty() || !s2.empty()){
            // L to R
            List<Integer> currLevel = new ArrayList<>();
            while(!s1.empty()){
                // Store all elements of this level
                TreeNode curr = s1.pop();
                if(curr.left != null) s2.push(curr.left);
                if(curr.right != null) s2.push(curr.right);
                // print
                currLevel.add(curr.val);
            }
            ans.add(currLevel);
            currLevel = new ArrayList<>();
            // R to L
            while(!s2.empty()){
                // Store all elements of this level
                TreeNode curr = s2.pop();
                
                if(curr.right != null) s1.push(curr.right);
                if(curr.left != null) s1.push(curr.left);
                // print
                currLevel.add(curr.val);
            }
            if(!currLevel.isEmpty()) ans.add(currLevel);
        }
        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return sol1(root);
//         List<List<Integer>> ans = new ArrayList<>();
//         if(root == null) return ans;
//         Stack<TreeNode> currLevel = new Stack<>();
//         Stack<TreeNode> nextLevel = new Stack<>();
        
//         currLevel.push(root);
//         boolean LTR = true;
//         while(!currLevel.empty()) {
//             List<Integer> currList = new ArrayList<>();
//             TreeNode temp = currLevel.pop();
            
//             currList.add(temp.val);
//             if(LTR) {
//                 if(root.left != null) {
//                     nextLevel.push(root.left);
//                 }
//                 if(root.right != null) {
//                     nextLevel.push(root.right);
//                 }
//             }
//             else {
//                 if(root.right != null) {
//                     nextLevel.push(root.right);
//                 }
//                 if(root.left != null) {
//                     nextLevel.push(root.left);
//                 }
//             }
            
//             if(currLevel.empty()) {
//                 ans.add(currList);
//                 LTR = !LTR;
//                 Stack<TreeNode> tempSt = currLevel;
//                 currLevel = nextLevel;
//                 nextLevel = tempSt;
//             }
//         }
//         return ans;
    }
}