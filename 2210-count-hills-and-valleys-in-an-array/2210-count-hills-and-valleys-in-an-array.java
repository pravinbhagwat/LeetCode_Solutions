class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 1; i < n-1; i++) {
                
                if(nums[i] == nums[i+1]) continue;
                int j = i-1;
                int k = i+1;
                
                
                 while(k<n &&nums[i] == nums[k]) {
                    k++;
                }
                
                while(j>=0 && nums[i] == nums[j]) {
                    j--;
                }
               
                if(j < 0 || k >= n) {
                    continue;
                }
                
                if(nums[i] < nums[j] && nums[i] < nums[k]) count++;
                else if(nums[i] > nums[j] && nums[i] > nums[k]) count++;
            } 
        
        return count;
    }
}