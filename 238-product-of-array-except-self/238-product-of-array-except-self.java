// Approach
// 1- O(n), Spcae = O(n+n+n);
// 2- O(n), Space = O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] prefix = new int[n];
        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
            
        
        int[] suffix = new int[n];
        suffix[n-1] = 1;
        for(int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
            //System.out.print(prefix[i] + " ");
        }        
        
        int[] prod = new int[n];
        for(int i = 0; i < n; i++) 
            prod[i] = prefix[i] * suffix[i];
        
        return prod;
    }
}