class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int ans = nums[n-1] * nums[n-2] * nums[n-3];
        int ans2 = nums[0] * nums[1] * nums[n-1];
        
        return Math.max(ans, ans2);
    }
}