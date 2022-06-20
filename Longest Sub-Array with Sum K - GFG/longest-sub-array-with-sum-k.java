// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}


            

// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int[] arr, int n, int k) {
        //Complete the function
    int[] pSum = new int[n];
      int sum = 0;
      for(int i = 0; i < n; i++){
        sum += arr[i];
        pSum[i] = sum;
      }

      Map<Integer, Integer> hm = new HashMap<>();
      int len = 0;
      for(int i = 0; i < n; i++){
        if(!hm.containsKey(pSum[i])) {
            hm.put(pSum[i], i);
        }
        if(pSum[i] == k) len = i+1;
        if(hm.containsKey(pSum[i] - k)){
          len = Math.max(len, i - hm.get(pSum[i] - k));
        }        
      }

      return len;

    }
    
    
}


