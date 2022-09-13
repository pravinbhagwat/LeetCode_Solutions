class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, cost = 0;
        int maxLen = 0;
        int n = s.length();
        for(int end = 0; end < n; end++) {
            cost += Math.abs(s.charAt(end) - t.charAt(end));
            while(cost > maxCost) {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLen  = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}