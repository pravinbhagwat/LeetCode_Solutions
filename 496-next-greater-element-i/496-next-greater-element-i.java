class Solution {
    private static int[] helper(int[] arr) {
        
        int n = arr.length;
        Stack<Integer> S = new Stack<>(); 
        int[] ans = new int[n];
                       
        for (int i = n-1; i >= 0; i--) {
            while (!S.isEmpty() &&  S.peek() <= arr[i]) {
                S.pop();
            }

            if (S.isEmpty()) {
                ans[i] = -1;

             } else 
             {  
                ans[i] = S.peek();
             }
             S.push(arr[i]);
        }
        return ans;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n2 = nums2.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = helper(nums2);
        int[] newAns = new int[n];
        for(int i = 0; i < n2; i++){
            hm.put(nums2[i], ans[i]);    
        }
        for(int i = 0; i < n; i++) {
            newAns[i] = hm.get(nums1[i]);
        }
        return newAns;
    }
}