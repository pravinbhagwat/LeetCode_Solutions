class Solution {
    private static int[] helper(int[] arr) {
        
        int n = arr.length;
        Stack<Integer> S = new Stack<>(); 
        int[] ans = new int[n];
                       
        for (int i = 2*n-1; i >= 0; i--) {
            int idx  = i%n;
            while (!S.isEmpty() &&  S.peek() <= arr[idx]) {
                S.pop();
            }

            if (S.isEmpty()) {
                ans[idx] = -1;

             } else 
             {  
                ans[idx] = S.peek();
             }
             S.push(arr[idx]);
        }
        return ans;
    }
    public int[] nextGreaterElements(int[] nums1) {
        return helper(nums1);
    }
}