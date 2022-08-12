class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            if(hm.containsKey(nums[i])) return nums[i];
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        return -1;
    }
}