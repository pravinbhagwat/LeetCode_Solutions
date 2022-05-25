class Solution {

     int firstOccur(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s) / 2;
            if(target == arr[mid]) {
                ans = mid;
                e = mid-1;
            }
            else if(target > arr[mid]) s = mid + 1;
            else e = mid-1;
        }

        return ans;
    }

     int lastOccur(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s) / 2;
            if(target == arr[mid]) {
                ans = mid;
                s = mid+1;
            }
            else if(target > arr[mid]) s = mid + 1;
            else e = mid-1;
        }

        return ans;
    }
    

    public int[] searchRange(int[] nums, int target) {
        
        int left = firstOccur(nums, target);
        if (left == -1) {
            return new int[] {-1,-1};
        }

        int right = lastOccur(nums, target);
        return new int[] {left, right};
    }
}