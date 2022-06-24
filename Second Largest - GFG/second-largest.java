// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    // O(nlogn) TC
    // int print2largest(int arr[], int n) {
    //     // code here
    //       if(n < 2) return -1;
    //       Arrays.sort(arr); 
    //       if(arr[n-2] != arr[n-1]) return arr[n-2];
          
    //       for(int i = n-2; i >= 0; i--){
    //         if(arr[i] != arr[i+1]) {
    //           return arr[i];
    //         }
    //       }
    //       return -1;
    // }
    
    //O(n) TC
    int print2largest(int arr[], int n) {
        // code here
          if(n < 2) return -1;
          int maxEle = Integer.MIN_VALUE;
          for(int i = 0; i < n; i++){
            if(arr[i] > maxEle) maxEle = arr[i];
          }
          //System.out.println(maxEle + " ");
          int secondMax = -1;
          for(int i = 0; i < n; i++){
            if(arr[i] != maxEle) {
                secondMax = Math.max(secondMax, arr[i]);
            }
            //System.out.println(secondMax + " ");
          }
          
          return secondMax;
    }
}