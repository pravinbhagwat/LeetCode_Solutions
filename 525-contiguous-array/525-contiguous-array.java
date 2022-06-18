// Approach 
// 1- Time - O(n2) space - O(n) -> TLE
// 2- Time - O(n) Space - O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        
        int[] pSum = new int[n];
        //int sum = 0;
        pSum[0] = nums[0] == 0 ? -1 : 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == 0) pSum[i] = pSum[i-1] - 1;
            else pSum[i] = pSum[i-1] + nums[i];
            //System.out.print(pSum[i] + " ");
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        int maxLength = 0;
        
        for(int i = 0; i < n; i++){
            if(hm.containsKey(pSum[i])) maxLength = Math.max(maxLength, i - hm.get(pSum[i]));
            else hm.put(pSum[i], i);             
            if(pSum[i] == 0) maxLength = Math.max(maxLength, i +1);     
        }                
        
               
        return maxLength; 
    }
}