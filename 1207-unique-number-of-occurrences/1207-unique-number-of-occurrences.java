class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        Map<Integer, Integer> uf = new HashMap<>();
        
        for(int i : hm.keySet()) {          
            if(uf.containsValue(hm.get(i))) return false;
            else uf.put(i, hm.get(i));
            //System.out.print(val + " ");
        }
        return true;
    }
}