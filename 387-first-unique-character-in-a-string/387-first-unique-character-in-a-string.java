class Solution {
    public int firstUniqChar(String S) {
        int n = S.length();
        Map<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            hm.put(S.charAt(i), hm.getOrDefault(S.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < n; i++) {
            if(hm.get(S.charAt(i)) == 1) return i;
        }
        
        return -1;
    }
}