class Pair {
        int first, second;
        public Pair(int f, int s) {
                this.first = f;
                this.second = s;
        }
}
class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
                int[] left = new int[n];
                int[] right =  new int[n];
                
                Stack<Pair> s1 = new Stack<>();
                // For Left Smaller
                for(int i = 0; i < n; i++) {
                        
                        while(!s1.isEmpty() && s1.peek().first >= arr[i] ) {
                                s1.pop();
                        }
                        if(!s1.isEmpty()) {
                                left[i] = s1.peek().second;
                        }
                        else {
                                left[i] = -1;
                        }
                        s1.push(new Pair(arr[i], i));
                }

                while(!s1.isEmpty()) s1.pop();
                // for Right Smaller
                
                for(int i = n-1; i >= 0; i--) {
                        
                        while(!s1.isEmpty() && s1.peek().first >= arr[i] ) {
                                s1.pop();
                        }
                        if(!s1.isEmpty()) {
                                right[i] = s1.peek().second;
                        }
                        else {
                                right[i] = n;
                        }
                        s1.push(new Pair(arr[i], i));
                }

                // ANs
                //int[] ans = new int[n];
                int ans = 0;
                for(int i = 0; i < n; i++) {
                        ans = Math.max(ans, (right[i] - left[i] -1) * arr[i]);
                        
                }
                return ans;
    }
}