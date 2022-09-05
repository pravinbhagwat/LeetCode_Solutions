class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        if(s1 != t1) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        
        for(int i = 0; i < s1; i++) {
            char c = s.charAt(i);
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
    
        }
        for(int i = 0; i < t1; i++) {
            char c = t.charAt(i);
            hm1.put(c, hm1.getOrDefault(c, 0) - 1);
        }
        
        for(char x : hm1.keySet()) {
            if(hm1.get(x) != 0) return false;
        }
        
        return true;
    }
}