class Solution {
    // Approach 1 - Frequecy Array
    private int solve(int[] nums){
        int n = nums.length;
        int[] count = new int[n+1];
        
        for(int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        
        for(int i = 0; i < n+1; i++){
            if(count[i] == 0) return i;
        }
        
        return -1;
    }
    
    // Approach 2
    private int solve2(int[] nums){
        int n = nums.length;
        int ans = n*(n+1);
        ans /= 2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        
        return ans-sum;
    }
    
    public int missingNumber(int[] nums) {
        return solve2(nums);
    }
}