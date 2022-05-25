class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s) / 2;
            if (mid + 1 < n && arr[mid] > arr[mid+1]) {
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }

        return ans;
    }
}