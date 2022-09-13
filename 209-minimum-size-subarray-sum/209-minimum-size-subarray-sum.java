class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int end = 0; end < n; end++) {
            sum += nums[end];
            while(sum >= target) {
                minLen = Math.min(minLen, end-start+1);
                sum -= nums[start];
                start++;
            }           
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}