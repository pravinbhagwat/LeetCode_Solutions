class Solution {
    
     boolean isCheck(int[] piles, int mid, int h){
        int n = piles.length;
        int hours = 0;
        for(int i=0; i<n; i++) {
            ///int val = piles[i];
            hours += Math.ceil(piles[i] * 1.0 / mid);
            if(hours > h) return false;
        }
        
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        int start = 1;
        int end = 0;
        int maxBan = 0;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            maxBan = Math.max(piles[i], maxBan);
        }
        
        end = maxBan;
        
        while(start <= end){
            int mid = (start + end) / 2;
            if(isCheck(piles, mid, h)){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        
        return ans;
        
    }
}