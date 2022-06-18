class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[]  prefixSum = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            prefixSum[i] = sum;
        }
        
        if(n==1) return k;
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        //hm.put(0,1);
        
        //int currSum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            int target = prefixSum[i] - k;
            if(prefixSum[i] == k) {
                //hm.put(prefixSum[i], hm.getOrDefault(prefixSum[i], 0) + 1);
                count++;
            }
            if(hm.containsKey(target)){
                //hm.put(prefixSum[i], hm.getOrDefault(prefixSum[i], 0) + 1);
                count+=hm.get(target);
            }
            hm.put(prefixSum[i], hm.getOrDefault(prefixSum[i], 0) + 1);
        } 
        
        return count;
        
    }
}