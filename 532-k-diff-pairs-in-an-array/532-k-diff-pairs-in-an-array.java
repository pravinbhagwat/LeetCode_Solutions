class Solution {
        
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        if(k == 0) {
            for(int i : hm.keySet()){
                if(hm.get(i) > 1) count++;
            }
        }
        else {
            for(int i : hm.keySet()){
                if(hm.containsKey(i+k)) count++;
            }
        }
        return count;
    }
}