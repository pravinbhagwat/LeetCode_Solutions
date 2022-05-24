class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        
        long s = 0;
        long e = (x/2);
        
        long ans = 0;
        
        while(s<=e){
            long mid = (s+e)/2;
            long sq = mid*mid;
            if(sq == x) return (int)mid;
            else if(x < sq) e= mid-1;
            else{
                ans = mid;
                s = mid+1;
            }
        }
        
        return (int)ans;
    }
}