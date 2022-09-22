class Solution {
    public int firstMissingPositive(int[] arr) {
        int size = arr.length;
        int missing = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < size; i++) {
            hs.add(arr[i]);
        }
        for(int i = 0; i < size; i++) {
            if(hs.contains(missing)) {
                missing++;
            }
        }
        
        
        return missing;
    }
}