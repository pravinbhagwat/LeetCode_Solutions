class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
          hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
          if(hm.get(arr[i]) > 1) return true;
        }
        return false;
    }
}