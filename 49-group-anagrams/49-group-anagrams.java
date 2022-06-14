class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        
        Map<String, ArrayList<String>> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedstring = String.valueOf(arr);
            if(!hm.containsKey(sortedstring)){
                hm.put(sortedstring, new ArrayList<String>());
            }
            
            hm.get(sortedstring).add(strs[i]);
        }
        
        List<List<String>> ans  = new ArrayList<>(hm.values());
        return ans;
    }
}