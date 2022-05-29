class Solution {
    
    public int[] getArrayFromList(List<Integer> arr){
        int n = arr.size();
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++)
        {
            newArr[i] = arr.get(i);
        }
        
        return newArr;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] count = new int[1001];
        
        for(int i = 0; i < n1; i++){
            count[nums1[i]]++;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n2; i++){
            if(count[nums2[i]] > 0){
                ans.add(nums2[i]);
                count[nums2[i]] = 0;
            }
        }
        
        return getArrayFromList(ans);
        
    }
}