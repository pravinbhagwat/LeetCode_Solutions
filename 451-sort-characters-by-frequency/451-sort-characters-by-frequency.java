class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm  = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            Character cha = s.charAt(i);
            hm.put(cha, hm.getOrDefault(cha, 0) + 1);
        }
        
        StringBuilder ans  = new StringBuilder();
        int l = hm.size();
        for(int i = 0; i < l; i++){
            int max = -1;
            Character ch = 'a';
            
            for(Character c : hm.keySet()){
                if(hm.get(c) > max){
                    max = hm.get(c);
                    ch  = c;
                }                                 
            }  
            for(int k = 0; k < max; k++){
                ans.append(ch);                   
            }
            
            hm.remove(ch);
        }
        
        return ans.toString();
    }
}