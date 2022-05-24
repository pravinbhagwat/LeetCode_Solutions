class Solution {
    
    int binarySearch(int[] nums, int s, int e, int target){
        if(s>e) return -1;
        int mid = (s+e)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return binarySearch(nums,s,mid-1,target);
        else return binarySearch(nums,mid+1,e,target);
    }
    
    
    
    public int search(int[] nums, int target) {
        int e = nums.length-1;
        return binarySearch(nums,0,e,target);
    }
}