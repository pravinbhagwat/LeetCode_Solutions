class Solution {
    
    int binarySearch(int s, int e, int tar, int[] arr){
        while(s<=e){
            int mid = s + (e-s) / 2;
            if(arr[mid] == tar) return mid;
            else if(tar < arr[mid]) e = mid-1;
            else s = mid+1;
        }
        
        return -1;
    }
    
    public int[] twoSum(int[] arr, int target) {
        
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            int a = arr[i];
            int b = target - arr[i];
            int find = binarySearch(i+1,n-1,b,arr);
            
            if(find != -1) return new int[]{i+1, find+1};
        }
        
        return new int[]{-1, -1};
        
    }
}