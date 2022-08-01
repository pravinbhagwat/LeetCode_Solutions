class Solution {
    
    private void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {
        
        if(index >= nums.length)  {
            ans.add(output);
            return;
        }
        
        solve(nums, index+1, new ArrayList<Integer>(output), ans);
        output.add(nums[index]);
        solve(nums, index+1, new ArrayList<Integer>(output), ans);
        
        return;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //List<Integer> output = new ArrayList<>();
        solve(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
}