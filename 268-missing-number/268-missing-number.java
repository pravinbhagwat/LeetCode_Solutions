class Solution {
    public int missingNumber(int[] nums) {
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
}