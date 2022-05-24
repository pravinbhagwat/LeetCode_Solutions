class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        int s = 0;
        int e = nums.length-1;
        int ans=nums.length;
        while(s<=e){
            int mid = (s+e)/2;
            
            if(nums[mid]==target) return mid;
            else if(target < nums[mid]){
                ans  = mid;
                e = mid-1;
            }
            else{
                //and = mid;
                s = mid+1;
            }
        }
        
        return ans;
        
    }
}