class Solution {
        
    public int[] twoSum(int[] arr, int target) {        
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == target) return new int[]{start+1, end+1};
            else if(sum < target) start++;
            else end--;
        }
        
        return new int[]{-1, -1};
        
    }
}