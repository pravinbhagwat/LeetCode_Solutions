// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void merge(int[] arr, int start, int mid, int end)
     {
        int start1 = start;
        int end1 = mid;
        int start2 = mid + 1;
        int end2 = end;
        
        int[] temp = new int[end - start + 1];
        int k = 0;
        
        while(start1 <= end1 && start2 <= end2)
        {
            if(arr[start1] < arr[start2]) temp[k++] = arr[start1++];
            else temp[k++] = arr[start2++];
        }
        
        while(start1 <= end1) temp[k++] = arr[start1++];
        while(start2 <= end2) temp[k++] = arr[start2++];
        
        //k = 0;
        for(int i = start; i <= end; i++)
        {
            arr[i] = temp[i - start];
            // arr[i] = temp[k++];
        }
    }
    
    public void mergeSort(int[] arr, int start, int end)
    {
        if(start == end) return;
        
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    
    public int find_median(int[] arr)
    {
      int n = arr.length;
        // Code here
      mergeSort(arr, 0, n-1);
      //print(arr);
      if(n % 2 == 0){
        int ans = (arr[n/2-1] + arr[n/2]) / 2; 
        return ans;
      } 
      else{
        int ans = n/2;
        return arr[ans];
      }
    }
}