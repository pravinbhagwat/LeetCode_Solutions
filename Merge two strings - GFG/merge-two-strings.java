// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String s1, String s2)
    { 
        // code here
        StringBuilder sb = new StringBuilder();
        int len1 = s1.length();
          int len2 = s2.length();
          int i = 0;
          while(i < len1 || i < len2){
            if(i < len1){
              sb.append(s1.charAt(i));
            }
            if(i < len2){
              sb.append(s2.charAt(i));
            }
            i++;
          }
          return sb.toString();
    }
} 