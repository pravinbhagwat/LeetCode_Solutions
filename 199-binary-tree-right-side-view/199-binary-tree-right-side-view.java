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
    
    // Approach 1 - Iterative BFS
    /*
    List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            while(size-- > 0){
                TreeNode temp = que.poll();
                list.add(temp.val);
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
            ans.add(list.get(list.size()-1));
        }
        return ans;
    */
    
    private void solve(TreeNode root, List<Integer> ans, int level){
        if(root == null) return;
        if(ans.size() == level) ans.add(root.val);
        solve(root.right, ans, level + 1);
        solve(root.left, ans, level + 1);
        return;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }
}